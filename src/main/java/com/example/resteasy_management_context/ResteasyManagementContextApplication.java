package com.example.resteasy_management_context;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Path("/")
public class ResteasyManagementContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResteasyManagementContextApplication.class, args);
    }

    @GET
    @Path("hello")
    public String hello() {
        return "Hello World!";
    }
}
