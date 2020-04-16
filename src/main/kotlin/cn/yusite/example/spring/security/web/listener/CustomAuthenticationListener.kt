package cn.yusite.example.spring.security.web.listener

import org.springframework.context.ApplicationListener
import org.springframework.security.authentication.event.AuthenticationSuccessEvent
import org.springframework.stereotype.Component

/**
 * 授权成功监听器
 */
@Component
class CustomAuthenticationListener: ApplicationListener<AuthenticationSuccessEvent> {

    override fun onApplicationEvent(event: AuthenticationSuccessEvent) {

        println("授权成功")
    }
}