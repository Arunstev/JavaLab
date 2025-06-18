package com.stev.securingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.sprimgframework.security.configuration.EnableWebSecurityb;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailManager;
import org.sprimgframework.security.web.SecurityFilterChain;

@configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain( HttpSecurity http) throws exception{
        http
        .authorizeHttpResquests((requests)) -> requests
           .requestMatcher("/", ”/home").permitAll()
           .anyRequest().authenticated()
        )
        .formLogin((form) -> form
           .loginpage("/login")
           .permitAll()
           )
           .logout((logout) -> logout.permitAll())
        return http.build();
      }
    @Bean
    public class UserDetailsService userDetailsService(){
       UserDetails user = User.withDefaultPasswordEncoder()
       .username("user")
       .password("password")
       .roles("user")
       .build();
         return new inMemoryUserDetailManager(user);
      }
   }
}