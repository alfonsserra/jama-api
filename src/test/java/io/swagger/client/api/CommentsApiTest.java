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
import io.swagger.client.model.CommentDataListWrapper;
import io.swagger.client.model.CommentDataWrapper;
import io.swagger.client.model.CreatedResponse;
import io.swagger.client.model.RequestComment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentsApi
 */
@Ignore
public class CommentsApiTest {

    private final CommentsApi api = new CommentsApi();

    
    /**
     * Create a new comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCommentTest() throws ApiException {
        RequestComment body = null;
        CreatedResponse response = api.addComment(body);

        // TODO: test validations
    }
    
    /**
     * Get the comment with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentTest() throws ApiException {
        Integer id = null;
        List<String> include = null;
        CommentDataWrapper response = api.getComment(id, include);

        // TODO: test validations
    }
    
    /**
     * Get all comments viewable by the current user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        Integer startAt = null;
        Integer maxResults = null;
        Boolean rootCommentsOnly = null;
        List<String> include = null;
        CommentDataListWrapper response = api.getComments(startAt, maxResults, rootCommentsOnly, include);

        // TODO: test validations
    }
    
    /**
     * Get all reply comments for the comment with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRepliesTest() throws ApiException {
        Integer id = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        CommentDataListWrapper response = api.getReplies(id, startAt, maxResults, include);

        // TODO: test validations
    }
    
}