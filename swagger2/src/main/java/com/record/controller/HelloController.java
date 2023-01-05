package com.record.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "HelloController")
@RestController
public class HelloController {

    @ApiOperation(value = "Get")
    @GetMapping("/record")
    public String record1(){
        return "Hello World!";
    }

    @ApiOperation(value="Post")
    @PostMapping("record/{userId}")
    public String record2(@PathVariable("userId") Integer userid){
        return "Hello World!";
    }

    @ApiOperation(value="Put")
    @PutMapping("record")
    public String record3(){
        return "Hello World!";
    }

    @ApiOperation(value="Delete")
    @DeleteMapping("record")
    public String record4(){
        return "Hello World!";
    }
}
