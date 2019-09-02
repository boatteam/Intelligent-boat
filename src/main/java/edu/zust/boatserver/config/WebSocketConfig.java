package edu.zust.boatserver.config;

import edu.zust.boatserver.handler.BoatWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by HASEE on 2019/8/28
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(boatWebSocketHandler(), "/boat")
                .setAllowedOrigins("*")
                .withSockJS();
    }

    @Bean
    public BoatWebSocketHandler boatWebSocketHandler(){
        return new BoatWebSocketHandler();
    }
}
