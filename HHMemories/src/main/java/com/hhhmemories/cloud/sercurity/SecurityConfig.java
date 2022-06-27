package com.hhhmemories.cloud.sercurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	// security 기본 login 페이지 x
	@Override
	public void configure(WebSecurity web) throws Exception {
		
		web.ignoring().antMatchers("/css/**","/js/**","/img/**","/lib/**");
	}
	
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.httpBasic().disable();
		
		httpSecurity.csrf().disable()		//csrf 토큰 비활성화
					.authorizeRequests()
					.antMatchers("/","/js/**","/css/**","/image/**").permitAll() // 로그인 권한은 누구나, resources파일도 모든권한
					.and()
						.formLogin()
						.loginPage("/login/login")
						.defaultSuccessUrl("/")
					.and()
		                .logout()
		                .logoutRequestMatcher(new AntPathRequestMatcher("/login/logout"))
		                .logoutSuccessUrl("/index")//로그아웃 성공시 리다이렉트 주소
		                .invalidateHttpSession(true)// 로그아웃 이후 세션 전체 삭제 여부
		                .deleteCookies("JSESSIONID","remember-me") //JSESSIONID, rememeber-me 쿠키 삭제
					.and()
						.rememberMe() //로그인 유지
						.alwaysRemember(false) //항상 기억할 것인지 여부
						.rememberMeParameter("remember-me")
						.tokenValiditySeconds(43200) //12시간 유지
			;
	}

	//비밀번호 암호화
	@Bean
	public PasswordEncoder getPasswordEncoder() {
	  return new BCryptPasswordEncoder();
	}
	
}