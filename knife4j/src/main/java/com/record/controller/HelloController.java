package com.record.controller;


import com.github.xiaoymin.knife4j.annotations.ApiSupport;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "HelloController")
@ApiSupport(author = "京茶吉鹿")
@RestController
@RequestMapping("/hello")
public class HelloController {


    @Operation(summary = "Get")
    @GetMapping("/record")
    public String record1() {
        return "Hello World!";
    }

    @Operation(summary = "Post")
    @PostMapping("record/{userId}")
    public String record2(@PathVariable("userId") Integer userid) {
        return "Hello World!";
    }

    @Operation(summary = "Put")
    @PutMapping("record")
    public String record3() {
        return "Hello World!";
    }

    @Operation(summary = "Delete")
    @DeleteMapping("record")
    public String record4() {
        return "Hello World!";
    }
}
