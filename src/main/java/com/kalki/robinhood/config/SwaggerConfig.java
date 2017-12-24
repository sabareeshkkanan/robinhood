package com.kalki.robinhood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.kalki.robinhood.api")).
                        paths(PathSelectors.any())
                .build();


        docket.directModelSubstitute(ZonedDateTime.class, Date.class);
        docket.host("api.robinhood.com");
        docket.protocols(Stream.of("https").collect(Collectors.toSet()));


        docket.securitySchemes(Collections.singletonList(oauth()));
        return docket;
    }

    public List<Parameter> apiAuthParam() {
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder.name("Authorization").modelRef(new ModelRef("string")).parameterType("header").description("Token dfdjnvdjn").required(true).build();
        List<Parameter> aParameters = new ArrayList<Parameter>();
        aParameters.add(aParameterBuilder.build());
        return aParameters;
    }

    @Bean
    public ApiKey oauth() {
        return new ApiKey("jwt", "Authorization", "header");
    }
}
