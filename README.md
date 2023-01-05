# SpringBoot-Swagger-Demo

> 项目说明：该demo为Spring Boot整合Swagger2、Swagger3（OpenAPI3）的参考案例，可供开发者参考即可快速使用。

|  模块名  |                             介绍                             |
| :------: | :----------------------------------------------------------: |
| swagger2 | springboot整合swagger2，其中使用了swagger-bootsstrap-ui和knife4j-spring-ui的UI界面，Swagger2Config配置文件的代码同时对Swagger3也实用（代码中有相关注释）。在pom中选择对应的资源即可。注意：如果项目启动报错，请关注SpringBoot的版本，在配置文件中有说明。 |
| knife4j  | knife4j整合了swagger3（也就是我们通常说的OpenAPI3），使用的SpringBoot版本为3，需要保持JDK版本在17及其以上。我们虽然在项目中引用的依赖为knife4j-openapi3-jakarta-spring-boot-starter，但是配置的方法完全跟 openapi3相同。我们使用knife4j主要是想使用一些她的炫酷技能（增强特性）和中意于她的外表（ui）。 |

