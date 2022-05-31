package com.hhhmemories.cloud.sercurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.hhhmemories.cloud.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// security 기본 login 페이지 x
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.httpBasic().disable();
		
		httpSecurity.authorizeRequests().antMatchers("/login","/singup","/resources/**").permitAll() // 로그인 권한은 누구나, resources파일도 모든권한
					.and()
						.formLogin()
						.loginPage("/member/login")
						.defaultSuccessUrl("/")
					.and()
						.logout()
						.logoutSuccessUrl("/index")//로그아웃 성공시 리다이렉트 주소
						.invalidateHttpSession(true) // 로그아웃 이후 세션 전체 삭제 여부
					.and()
			            .csrf().disable()		//로그인 창	
			       
			;
	}

	//비밀번호 암호화
	@Bean
	public PasswordEncoder getPasswordEncoder() {
	  return new BCryptPasswordEncoder();
	}
	
}