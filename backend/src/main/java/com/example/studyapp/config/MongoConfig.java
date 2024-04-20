// package com.example.studyapp.config;

// import com.mongodb.client.MongoClients;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
// import com.mongodb.client.MongoClient;

// @Configuration
// public class MongoConfig extends AbstractMongoClientConfiguration {

//     @Override
//     protected String getDatabaseName() {
//         return "study-app";
//     }

//     @Override
//     public MongoClient mongoClient() {
//         return MongoClients.create("mongodb://localhost:27017");
//     }
// }








// package com.example.studyapp.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.messaging.simp.config.MessageBrokerRegistry;
// import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
// import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
// import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


// @Configuration
// @EnableWebSocketMessageBroker
// public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {



//     @Override
//     public void registerStompEndpoints(StompEndpointRegistry registry) {
//         registry.addEndpoint("/ws").withSockJS();
//     }

//     @Override
//     public void configureMessageBroker(MessageBrokerRegistry registry) {
//         registry.setApplicationDestinationPrefixes("/frontend/");
//         registry.enableSimpleBroker("/topic");
//     }

// }





























// package com.example.studyapp.WebSocket;

// import java.util.concurrent.CopyOnWriteArrayList;

// import org.springframework.web.socket.CloseStatus;
// import org.springframework.web.socket.WebSocketMessage;
// import org.springframework.web.socket.WebSocketSession;
// import org.springframework.web.socket.handler.TextWebSocketHandler;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// public class MyWebSocketHandler extends TextWebSocketHandler {

//     private static final Logger logger = LoggerFactory.getLogger(MyWebSocketHandler.class);
    

//     // Define a thread-safe collection to store connected sessions
//     private final CopyOnWriteArrayList<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

//     @Override
//     public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//         logger.info("Nouvelle connexion WebSocket établie: {}", session.getId());
//         sessions.add(session); // Add the new session to the collection
//     }

//     @Override
//     public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
//     logger.info("Message recu du client {} : {}", session.getId(), message.getPayload());

//     // Extract and process the message based on its format
//     session.sendMessage(message);
//     for (WebSocketSession otherSession : sessions) {
//         if (!session.equals(otherSession)) {
//             otherSession.sendMessage(message);
//         }
//     }
//         logger.info("Message recu du client {} : {}", session.getId(), message.getPayload());
//     }



//     @Override
//     public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
//         logger.error("Erreur de transport WebSocket pour la session {}", session.getId(), exception);
//         sessions.remove(session); // Remove the session in case of errors
//     }

//     @Override
//     public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
//         logger.info("Connexion WebSocket fermée: {}", session.getId());
//         sessions.remove(session); // Remove the session when it closes
//     }
// }

