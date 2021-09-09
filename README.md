# Spring Cloud 学习

黑马程序员教学视频

## Spring Cloud Alibaba 版本选择

[版本说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)


## 新知识
### Spring Boot
* 将根模块的 parent 设置为 `spring-boot-starter-parent` 并指定其版本，它可以帮我们做好其他依赖的版本控制，无需
我们自己定义。因为它的 parent 是 `spring-boot-dependencies`，里面有各种依赖的管理。

### MyBatis
 * （`user-service`）外部配置 `mybatis.type-aliases-package` 是什么？
 * 主启动类上注解 `@MapperScan` 以定义 bean，否则 Spring 的 IoC 容器**自动装配**时不知道这个 mapper 的存在。 
只要是一个 bean 依赖另一个 bean 的情况，这个被依赖的 bean 一定得有相应的注解，
如 `@Component`，`@Configuration`，`@Service`和`@Mapper` 等。
 * （Order Service）如果实体类的字段名采用驼峰命名，而数据库表中的字段名是下划线形式的，则需要在 properties file 中
配置 `mybatis.configuration.map-underscore-to-camel-case`。