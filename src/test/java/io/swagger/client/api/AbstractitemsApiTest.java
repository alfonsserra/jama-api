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
import io.swagger.client.model.AbstractItemDataWrapper;
import io.swagger.client.model.AbstractVersionedItemDataWrapper;
import io.swagger.client.model.ItemDataListWrapper;
import io.swagger.client.model.VersionDataListWrapper;
import io.swagger.client.model.VersionDataWrapper;
import io.swagger.client.model.VersionedRelationshipDataListWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AbstractitemsApi
 */
@Ignore
public class AbstractitemsApiTest {

    private final AbstractitemsApi api = new AbstractitemsApi();

    
    /**
     * Search for items, test plans, test cycles, test runs, or attachments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAbstractItemsTest() throws ApiException {
        List<Integer> project = null;
        List<Integer> itemType = null;
        List<String> documentKey = null;
        List<Integer> release = null;
        List<String> createdDate = null;
        List<String> modifiedDate = null;
        List<String> lastActivityDate = null;
        List<String> contains = null;
        List<String> sortBy = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        ItemDataListWrapper response = api.getAbstractItems(project, itemType, documentKey, release, createdDate, modifiedDate, lastActivityDate, contains, sortBy, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Get any item, test plan, test cycle, test run, or attachment with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemTest() throws ApiException {
        Integer id = null;
        List<String> include = null;
        AbstractItemDataWrapper response = api.getItem(id, include);

        // TODO: test validations
    }
    
    /**
     * Get the numbered version for the item with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionOnItemTest() throws ApiException {
        Integer versionNum = null;
        Integer id = null;
        List<String> include = null;
        VersionDataWrapper response = api.getVersionOnItem(versionNum, id, include);

        // TODO: test validations
    }
    
    /**
     * Get the  snapshot of the item at the specified version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionedItemTest() throws ApiException {
        Integer versionNum = null;
        Integer id = null;
        List<String> include = null;
        AbstractVersionedItemDataWrapper response = api.getVersionedItem(versionNum, id, include);

        // TODO: test validations
    }
    
    /**
     * Get all versioned relationships that were associated to the item at the specified time
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionedRelationshipsTest() throws ApiException {
        Integer id = null;
        String timestamp = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        VersionedRelationshipDataListWrapper response = api.getVersionedRelationships(id, timestamp, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Get all versions for the item with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionsOnItemTest() throws ApiException {
        Integer id = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        VersionDataListWrapper response = api.getVersionsOnItem(id, startAt, maxResults, include);

        // TODO: test validations
    }
    
}