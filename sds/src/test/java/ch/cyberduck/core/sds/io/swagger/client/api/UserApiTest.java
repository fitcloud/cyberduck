/*
 * Secure Data Space API
 * Version 4.1.2 - built at: 2017-03-02 18:50:25, API server: https://sds.ssp-europe.eu/api/v4
 *
 * OpenAPI spec version: 4.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.api;

import ch.cyberduck.core.sds.io.swagger.client.ApiException;
import ch.cyberduck.core.sds.io.swagger.client.model.ChangeUserPasswordRequest;
import ch.cyberduck.core.sds.io.swagger.client.model.CustomerData;
import ch.cyberduck.core.sds.io.swagger.client.model.EnableCustomerEncryptionRequest;
import ch.cyberduck.core.sds.io.swagger.client.model.OAuthAuthorization;
import ch.cyberduck.core.sds.io.swagger.client.model.UpdateUserAccountRequest;
import ch.cyberduck.core.sds.io.swagger.client.model.UserAccount;
import ch.cyberduck.core.sds.io.swagger.client.model.UserKeyPairContainer;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Change user password
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Change the user&#39;s password.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Password is changed.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Password security configuration applies.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeUserPasswordTest() throws ApiException {
        String xSdsAuthToken = null;
        ChangeUserPasswordRequest body = null;
        api.changeUserPassword(xSdsAuthToken, body);

        // TODO: test validations
    }
    
    /**
     * Delete OAuth authorization
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt; Delete authorizations of an OAuth client.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token, valid client id&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Authorizations for OAuth client are revoked.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOAuthAuthorizationTest() throws ApiException {
        String xSdsAuthToken = null;
        String clientId = null;
        api.deleteOAuthAuthorization(xSdsAuthToken, clientId);

        // TODO: test validations
    }
    
    /**
     * Delete user keypair
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Delete the user&#39;s keypair.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This will also remove all FileKeys that were encrypted with the user&#39;s public key. If the user had exclusive access to some files, those are removed as well since decrypting them became impossible.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserKeyPairTest() throws ApiException {
        String xSdsAuthToken = null;
        api.deleteUserKeyPair(xSdsAuthToken);

        // TODO: test validations
    }
    
    /**
     * Enable encryption for this customer
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Activate client-side encryption for whole customer.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Only available for Data Space Administrators.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Client-side encryption is enabled.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Sets the ability for this customer to encrypt Rooms. Once enabled on customer level, it cannot be unset. On activation, a rescue keypair must be set.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableCustomerEncryptionTest() throws ApiException {
        String xSdsAuthToken = null;
        EnableCustomerEncryptionRequest body = null;
        CustomerData response = api.enableCustomerEncryption(xSdsAuthToken, body);

        // TODO: test validations
    }
    
    /**
     * Get customer info
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Lean API to get customer name, used/free space and used/avaliable user account info of a customer.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerInfoTest() throws ApiException {
        String xSdsAuthToken = null;
        String xSdsDateFormat = null;
        CustomerData response = api.getCustomerInfo(xSdsAuthToken, xSdsDateFormat);

        // TODO: test validations
    }
    
    /**
     * Get customer keypair
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve the customer&#39;s keypair (aka Data Space Rescue Key).&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The private key is password-based encrypted with AES256/PBKDF2. Further details in crypto documentation.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerKeyPairTest() throws ApiException {
        String xSdsAuthToken = null;
        UserKeyPairContainer response = api.getCustomerKeyPair(xSdsAuthToken);

        // TODO: test validations
    }
    
    /**
     * Get OAuth client authorizations
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve info about all OAuth client authorizations.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOAuthAuthorizationsTest() throws ApiException {
        String xSdsAuthToken = null;
        String xSdsDateFormat = null;
        List<OAuthAuthorization> response = api.getOAuthAuthorizations(xSdsAuthToken, xSdsDateFormat);

        // TODO: test validations
    }
    
    /**
     * Get user account info
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieves all information regarding the current user&#39;s account.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Setting the query parameter &lt;dfn&gt;more_info&lt;/dfn&gt; to &lt;b&gt;true&lt;/b&gt;, causes the API to return more details, e.g. the user&#39;s groups.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserInfoTest() throws ApiException {
        String xSdsAuthToken = null;
        String xSdsDateFormat = null;
        Boolean moreInfo = null;
        UserAccount response = api.getUserInfo(xSdsAuthToken, xSdsDateFormat, moreInfo);

        // TODO: test validations
    }
    
    /**
     * Get user keypair
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve the user&#39;s keypair.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The private key is password-based encrypted with AES256/PBKDF2. Further details in crypto documentation.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserKeyPairTest() throws ApiException {
        String xSdsAuthToken = null;
        UserKeyPairContainer response = api.getUserKeyPair(xSdsAuthToken);

        // TODO: test validations
    }
    
    /**
     * Set user keypair
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Set the user&#39;s keypair.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The keypair is set.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Overwriting an existing keypair is not possible. Please delete the existing keypair first. The private key is password-based encrypted with AES256/PBKDF2. Further details in crypto documentation.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserKeyPairTest() throws ApiException {
        String xSdsAuthToken = null;
        UserKeyPairContainer body = null;
        api.setUserKeyPair(xSdsAuthToken, body);

        // TODO: test validations
    }
    
    /**
     * Update user account
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Update current user&#39;s account.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid auth token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; User updated.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; All input fields are limited to &lt;b&gt;150&lt;/b&gt; characters&lt;/b&gt;.&lt;br/&gt;Allowed characters: &lt;b&gt;All&lt;/b&gt;&lt;br/&gt;&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Authentication method parameters&lt;/h4&gt;&lt;dl&gt;&lt;dt&gt;SQL&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;\&quot;login\&quot;: E-Mail Address&lt;/code&gt;&lt;br/&gt;&lt;code&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Active Directory Username &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Active Directory Username according to auth setting &#39;user_filter&#39;\&quot;&lt;br/&gt;additional parameters (optional):&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;RADIUS  &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Radius user name\&quot;&lt;br/&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserAccountTest() throws ApiException {
        String xSdsAuthToken = null;
        UpdateUserAccountRequest body = null;
        String xSdsDateFormat = null;
        UserAccount response = api.updateUserAccount(xSdsAuthToken, body, xSdsDateFormat);

        // TODO: test validations
    }
    
    /**
     * Invalidate authentication token
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Logout a user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid authentication token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; User is logged out, authentication token invalidated.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userLogoutTest() throws ApiException {
        String xSdsAuthToken = null;
        Boolean everywhere = null;
        api.userLogout(xSdsAuthToken, everywhere);

        // TODO: test validations
    }
    
}