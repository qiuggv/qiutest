package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2021-01-15T06:32:43.646Z")

@RestSchema(schemaId = "projectsvqc")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class ProjectsvqcImpl {

    @Autowired
    private ProjectsvqcDelegate userProjectsvqcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectsvqcDelegate.helloworld(name);
    }

}
