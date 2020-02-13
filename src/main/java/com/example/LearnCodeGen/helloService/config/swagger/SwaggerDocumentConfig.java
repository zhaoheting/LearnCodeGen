package com.example.LearnCodeGen.helloService.config.swagger;

import com.example.LearnCodeGen.LearnCodeGenApplication;
import com.google.common.base.Predicate;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.withMethodAnnotation;

@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses = LearnCodeGenApplication.class)
public class SwaggerDocumentConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Learn how to use swagger.")
                .description("the description of apiinfo.")
                .contact(new Contact("zht", "url in contact.", "heting.zhao@www.com."))
                .version("1.0.0")
                .build();
    }

    //若不配置，就使用springboot默认的docket bean实例
    @Bean
    public Docket customImplement() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(not(withMethodAnnotation(SwaggerCustonIgnore.class)))
                .apis(withMethodAnnotation(ApiOperation.class))
//                .paths(allowPaths())
                .paths(PathSelectors.any())
                .build();
    }

    private Predicate<String> allowPaths() {
        return or(
                regex("/user.*"),
                regex("/role.*")
        );
    }
}
