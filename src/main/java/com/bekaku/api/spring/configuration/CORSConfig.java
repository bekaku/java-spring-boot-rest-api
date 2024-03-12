package com.bekaku.api.spring.configuration;

import com.bekaku.api.spring.util.ConstantData;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH", "OPTIONS")
                .allowedHeaders(
                        ConstantData.CACHE_CONTROL,
                        ConstantData.CONTENT_TYPE,
                        ConstantData.AUTHORIZATION,
                        ConstantData.ACCEPT_LANGUGE,
                        ConstantData.ACCEPT_APIC_LIENT
                )
                .exposedHeaders(ConstantData.CONTENT_DISPOSITION)
                .allowCredentials(true)
                .allowedOriginPatterns("*");
//                .allowedOrigins("http://localhost:9100");
    }
}
