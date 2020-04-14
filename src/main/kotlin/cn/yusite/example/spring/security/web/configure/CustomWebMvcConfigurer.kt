package cn.yusite.example.spring.security.web.configure

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CustomWebMvcConfigurer: WebMvcConfigurer{

    override fun addViewControllers(registry: ViewControllerRegistry) {

        registry.addViewController("/hello").setViewName("hello")
        registry.addViewController("/home").setViewName("home")
        registry.addViewController("/").setViewName("home")
        registry.addViewController("/login").setViewName("login")
    }
}