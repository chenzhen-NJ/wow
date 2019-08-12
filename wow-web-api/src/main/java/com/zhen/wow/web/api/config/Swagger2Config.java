package com.zhen.wow.web.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Comment 配置swagger
 * @Author CHENZHEN
 * @Date 2019/8/12 14:34
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

	@Bean
	public Docket createRestApi () {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				//扫描包路径
				.apis(RequestHandlerSelectors.basePackage("com.zhen.wow.web.api")).paths(PathSelectors.any()).build();
	}

	/**
	 * 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
	 */
	private ApiInfo apiInfo () {
		return new ApiInfoBuilder()
				//页面标题
				.title("wow restful api")
				//描述
				.description("接口文档")
				//版本号
				.version("1.0").build();
	}
}
