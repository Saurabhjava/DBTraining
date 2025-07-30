package com.db.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/home").permitAll()   // Public pages
                        .requestMatchers("/admin/**").hasRole("ADMIN")  // Admin only
                        .requestMatchers("/user/**").hasRole("USER")    // User only
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults()) // Modern way to enable HTTP Basic
                .csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("saurabh")
                .password("password")
                .roles("USER")
                .build();

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("Yash")
                .password("admin123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
    /*@Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails noRole = User.builder()
                .username("saurabh")
                .password(passwordEncoder.encode("pass123"))
                .build();

        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("admin123"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin, noRole);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
}
