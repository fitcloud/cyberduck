package ch.cyberduck.core.ftp;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.Preferences;
import ch.cyberduck.core.ftp.parser.CompositeFileEntryParser;

import org.apache.log4j.Logger;

import java.util.TimeZone;

/**
 * @version $Id:$
 */
public class FTPParserSelector {
    private static final Logger log = Logger.getLogger(FTPParserSelector.class);

    public CompositeFileEntryParser getParser(final String system) {
        return this.getParser(system, null);
    }

    public CompositeFileEntryParser getParser(final String system, TimeZone zone) {
        final CompositeFileEntryParser parser;
        if(null == zone) {
            parser = new FTPParserFactory().createFileEntryParser(system,
                    TimeZone.getTimeZone(Preferences.instance().getProperty("ftp.timezone.default")));
        }
        else {
            parser = new FTPParserFactory().createFileEntryParser(system, zone);
        }
        // Configure timezone
        parser.configure(null);
        return parser;
    }
}