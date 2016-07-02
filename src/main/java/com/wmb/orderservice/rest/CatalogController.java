package com.wmb.orderservice.rest;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.wmb.orderservice.model.Catalog;
import com.wmb.orderservice.service.ProductServiceImpl;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.websocket.server.PathParam;

/**
 * Created by robertmurray on 7/2/16.
 */
@RestController
@RequestMapping("/catalogs")
public class CatalogController {

    @Inject
    private ProductServiceImpl productService;

    private final AtomicLong counter = new AtomicLong();


    @ApiOperation(value = "catalogs", notes="Returns a list of all available catalogs", nickname = "retrieve catalogs")
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Catalog.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public List<Catalog> retrieve() {
        return productService.retrieveCatalogs();
    }

    @ApiOperation(value = "catalogs", notes="Returns a single instance of a Catalog", nickname = "catalogs")
    @RequestMapping(value = "/{catalogId}", method = {RequestMethod.GET})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "catalogId", value = "the unique identifier of the catalog", required = true, dataType = "Long", paramType = "path")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Catalog.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public Catalog retrieve(@PathVariable(value = "catalogId") Long catalogId) {
        return productService.retrieveCatalogs(catalogId);
    }

}
