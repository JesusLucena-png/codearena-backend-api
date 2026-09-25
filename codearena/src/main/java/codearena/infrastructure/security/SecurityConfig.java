package codearena.infrastructure.security;

/*
 * RUTA:
 * codearena.infrastructure.security.ExampleSecurityConfig
 *
 * CAPA:
 * Infrastructure
 *
 * RESPONSABILIDAD:
 * Configurar técnicamente Spring Security.
 *
 * En este ejemplo permitimos acceder a /api/examples/**
 * sin autenticación para poder probar el flujo de la
 * arquitectura hexagonal.
 *
 * En el CodeArena real posteriormente aquí configuraremos:
 * - JWT
 * - Autenticación
 * - Roles ADMIN y PLAYER
 * - Protección de endpoints
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/examples/**").permitAll()
                        .requestMatchers("/api/users/**").authenticated()
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}