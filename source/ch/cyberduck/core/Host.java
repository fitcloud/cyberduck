package ch.cyberduck.core;
/*
 *  Copyright (c) 2003 David Kocher. All rights reserved.
 *  http://cyberduck.ch/
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  Bug fixes, suggestions and comments should be sent to:
 *  dkocher@cyberduck.ch
 */

import org.apache.log4j.Logger;
import java.io.Serializable;
import java.net.URL;

import ch.cyberduck.core.ftp.FTPSession;
import ch.cyberduck.core.http.HTTPSession;
import ch.cyberduck.core.sftp.SFTPSession;

import com.sshtools.j2ssh.transport.HostKeyVerification;

public class Host {
    private static Logger log = Logger.getLogger(Host.class);

    private String protocol;
    private int port;
    private String name;
    private HostKeyVerification hostKeyVerification;
    private Session session;
    private Login login;

//    public Host(String url) {
//	this(url.substring(0, url.indexOf("://")),
  //    url.substring(url.indexOf("://")+3, url.lastIndexOf("@")),
    //  url.substring(url.indexOf("@")+1, url.lastIndexOf(":")),
 //     Integer.parseInt(url.substring(url.lastIndexOf(":")+1, url.length())));
   // }

//    public Host(String protocol, String host, int port) {
//	this(protocol, String user, host, port, null);
//    }
    
    public Host(String protocol, String name, int port, Login login) {
        this.protocol = protocol != null ? protocol : Preferences.instance().getProperty("connection.protocol.default");
        this.port = port != -1 ? port : this.getDefaultPort(protocol);
        this.name = name;
        this.login = login;
	log.debug(this.toString());
    }

    public Host(String name, Login login) {
	this(Preferences.instance().getProperty("connection.protocol.default"), name, Integer.parseInt(Preferences.instance().getProperty("connection.port.default")), login);
    }

    public Session getSession() {
        log.debug("getSession");
	if(null == this.session) {
	    if(this.getProtocol().equalsIgnoreCase(Session.HTTP)) {
		this.session = new HTTPSession(this);
	    }
	    //  @todo      if(this.getProtocol().equalsIgnoreCase(Session.HTTPS)) {
     //            return new HTTPSession(this);
     //        }
	    else if(this.getProtocol().equalsIgnoreCase(Session.FTP)) {
		this.session = new FTPSession(this);
	    }
	    else if(this.getProtocol().equalsIgnoreCase(Session.SFTP)) {
		this.session = new SFTPSession(this);
	    }
	    else {
		throw new IllegalArgumentException("Unknown protocol");
	    }
	}
	return this.session;
    }
    
//    public boolean hasValidSession() {
//	return session != null && session.isConnected();//@todo use check() without reconnecting 
//    }

    public void closeSession() {
        log.debug("closeSession");
	if(session != null) {
	    this.session.close();
	    this.session = null;
	}
    }
    
    
    private int getDefaultPort(String protocol) {
	if(protocol.equals(Session.FTP))
	    return Session.FTP_PORT;
	else if(protocol.equals(Session.SFTP))
	    return Session.SSH_PORT;
	else if(protocol.equals(Session.HTTP))
	    return Session.HTTP_PORT;
	return -1;
    }

/*
 public void setServerPath(String p) {
     Cyberduck.DEBUG("[Bookmark] setServerPath("+ p.toString() + ")");
     if(p == null || p.equals("")) {
	 this.serverPath = new Path("/");
	 this.serverDirectory = serverPath;
     }
     else {
	 this.serverPath = new Path(p);
	 if(serverPath.isDirectory()) {
	     this.serverDirectory = serverPath;
	     this.serverFilename = null;
	     this.localFilename = null;
	     this.localFinalPath = null;
	     this.localTempPath = null;
	     this.localDirectory = null;
	 }
	 else {
	     this.serverDirectory = serverPath.getParent();
                //this.serverFilename = Path.encode(serverPath.getName());
	     this.serverFilename = serverPath.getName();
	     this.setLocalPath(new File(Preferences.instance().getProperty("download.path"), this.serverFilename));
	 }
     }
 }
 */
    
    // ----------------------------------------------------------
    // Accessor methods
    // ----------------------------------------------------------

    public void setLoginController(Login login) {
	this.login = login;
    }
    
    public Login getLogin() {
	return this.login;
    }

    public String getProtocol() {
	return this.protocol;
    }

    private void setProtocol(String protocol) {
	log.debug("setProtocol"+protocol);
	this.protocol = protocol;
    }

    public String getName() {
	return this.name;
    }

    private void setName(String name) {
	log.debug("setName"+name);
	this.name = name;
    }

    public int getPort() {
	return this.port;
    }

    private void setPort(int port) {
	log.debug("setPort"+port);
	this.port = port;
    }

    //ssh specific
    public void setHostKeyVerificationController(HostKeyVerification h) {
	this.hostKeyVerification = h;
    }

    public HostKeyVerification getHostKeyVerificationController() {
	return this.hostKeyVerification;
    }

//    public URL getURL() {
//	try {
//	    return new URL(this.toString());
//	}
//	catch(java.net.MalformedURLException e) {
//	    log.error(e.getMessage());
//	}
//	return null;
//  }

    /**
	* @return The IP address of the remote host if available
     */
    public String getIp() {
        //if we call getByName(null) InetAddress would return localhost
        if(this.name == null)
            return "Unknown host";
        try {
            return java.net.InetAddress.getByName(name).toString();
        }
        catch(java.net.UnknownHostException e) {
            return "Unknown host";
        }
    }

    /**
	* protocol://user@host:port
	@ return The URL of the remote host including user login name and port
     */
    public String toString() {
	return this.getProtocol()+"://"+this.getLogin().getUsername()+"@"+this.getName()+":"+this.getPort();
    }
}
