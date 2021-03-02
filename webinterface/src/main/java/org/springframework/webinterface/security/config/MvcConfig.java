package org.springframework.webinterface.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configura as views da aplicação web (thymeleaf).
 * @author rodrigoalexandre
 *
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/rules").setViewName("rules");
        registry.addViewController("/consultancy").setViewName("consultancy");
        registry.addViewController("/industprocess").setViewName("industprocess");
        WebMvcConfigurer.super.addViewControllers(registry);

	}

}
