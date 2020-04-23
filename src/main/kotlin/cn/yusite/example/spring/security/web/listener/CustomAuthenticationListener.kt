package cn.yusite.example.spring.security.web.listener

import org.springframework.context.ApplicationListener
import org.springframework.context.event.EventListener
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent
import org.springframework.security.authentication.event.AuthenticationSuccessEvent
import org.springframework.security.web.authentication.AuthenticationFailureHandler
import org.springframework.stereotype.Component

/**
 * 授权成功监听器
 */
//@Component
//class CustomAuthenticationListener: ApplicationListener<AuthenticationSuccessEvent> {
//
//    override fun onApplicationEvent(event: AuthenticationSuccessEvent) {
//
//        println("授权成功")
//    }
//}

@Component
class CustomAuthenticationListener {

    @EventListener
    fun onApplicationEvent(event: AuthenticationSuccessEvent) {

        println("授权成功")
    }

    @EventListener
    fun onApplicationEvent(event: AuthenticationFailureBadCredentialsEvent) {

        println("凭证失败")
    }
}