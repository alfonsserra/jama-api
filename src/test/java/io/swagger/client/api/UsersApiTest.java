/*
 * Jama REST API
 * This is the documentation for the Jama REST API.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AbstractRestResponse;
import io.swagger.client.model.CreatedResponse;
import io.swagger.client.model.FilterDataListWrapper;
import io.swagger.client.model.RequestActiveStatus;
import io.swagger.client.model.RequestUser;
import io.swagger.client.model.UserDataListWrapper;
import io.swagger.client.model.UserDataWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create a new user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserTest() throws ApiException {
        RequestUser body = null;
        CreatedResponse response = api.addUser(body);

        // TODO: test validations
    }
    
    /**
     * Gets the current user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
        List<String> include = null;
        UserDataWrapper response = api.getCurrentUser(include);

        // TODO: test validations
    }
    
    /**
     * Gets the current user&#39;s favorite filters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoriteFiltersForCurrentUserTest() throws ApiException {
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        FilterDataListWrapper response = api.getFavoriteFiltersForCurrentUser(startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Get the user with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        Integer userId = null;
        List<String> include = null;
        UserDataWrapper response = api.getUser(userId, include);

        // TODO: test validations
    }
    
    /**
     * Get all users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String username = null;
        String email = null;
        String firstName = null;
        String lastName = null;
        Boolean includeInactive = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        UserDataListWrapper response = api.getUsers(username, email, firstName, lastName, includeInactive, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Update the user with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUserTest() throws ApiException {
        RequestUser body = null;
        Integer userId = null;
        AbstractRestResponse response = api.putUser(body, userId);

        // TODO: test validations
    }
    
    /**
     * Update the active status for the user with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setActiveStatusTest() throws ApiException {
        RequestActiveStatus body = null;
        Integer userId = null;
        AbstractRestResponse response = api.setActiveStatus(body, userId);

        // TODO: test validations
    }
    
}
