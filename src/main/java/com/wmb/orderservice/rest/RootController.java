package com.wmb.orderservice.rest;

import com.wmb.orderservice.model.Catalog;
import com.wmb.orderservice.service.ProductServiceImpl;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by robertmurray on 7/2/16.
 */
@RestController
@RequestMapping("/")
public class RootController {
    @RequestMapping( method = {RequestMethod.GET})
    public void rootRedirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}
