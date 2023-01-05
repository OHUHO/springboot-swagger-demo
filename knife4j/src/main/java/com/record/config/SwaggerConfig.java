/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.record.config;

import cn.hutool.core.util.RandomUtil;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.customizers.GlobalOpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/***
 * Swagger配置
 * 1、切记 SpringBoot3 需要 JDK17 以上
 * 2、该项目使用了 Knife4j 的增强模式，详见配置文件
 * 3、Swagger文档查看权限账户: admin 1234
 * 4、Knife4j 官网：https://doc.xiaominfo.com
 * 4、关于更多的信息，请参考 微信公众号【京茶吉鹿】
 *
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(info())
                .externalDocs(new ExternalDocumentation()
                        .description("京茶吉鹿开放文档")
                        .url("http://localhost:8886/docs"))
                .components(components());
    }


    private Info info(){
        return new Info()
                .title("京茶吉鹿")
                .version("v0.0.1")
                .description("京茶吉鹿接口文档（springboot3 + openapi3）")
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://localhost:8886"))
                .contact(new Contact()
                        .name("京茶吉鹿")
                        // .url("http://localost:8886")
                        .email("jc.jingchao@qq.com"))
                .termsOfService("http://localhost:8886");
    }

    private Components components(){
        return new Components()
                .addSecuritySchemes("Bearer Authorization",
                        new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT"))
                .addSecuritySchemes("Basic Authorization",
                        new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("basic"));

    }

    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/hello/*")
                .build();
    }

    @Bean
    public GroupedOpenApi userApi(){
        return GroupedOpenApi.builder()
                .group("user")
                .pathsToMatch("user")
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi(){
        return GroupedOpenApi.builder()
                .group("admin")
                .pathsToMatch("admin")
                // .addOpenApiCustomiser(openApi -> openApi.info(new Info().title("京茶吉鹿接口—Admin")))
                .build();
    }

}
