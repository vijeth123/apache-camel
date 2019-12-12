package com.vijeth;

import com.vijeth.route.HelloWorldRoute;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloWorldApp {
    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new HelloWorldRoute());
        context.start();
    }
}
