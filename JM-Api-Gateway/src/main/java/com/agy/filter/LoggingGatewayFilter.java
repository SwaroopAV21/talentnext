package com.agy.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;
//after this we have to add in application.properties
@Component
public class LoggingGatewayFilter extends AbstractGatewayFilterFactory<LoggingGatewayFilter.Config> {
    
    private final Logger logger=LoggerFactory.getLogger(LoggingGatewayFilter.class);

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Config {
        //We can specify the configurations 
        private String basemsg;
        private boolean preLogger;
        private boolean postLogger;
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange,chain)->{
            //some pre processing
            if(config.isPreLogger()){
                logger.info("Pre filter message "+config.getBasemsg());
            }
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
                //post processing
                if(config.isPostLogger()){ 
                    logger.info("Post filter message "+config.getBasemsg());
                }
            }));};
    }


    public LoggingGatewayFilter(){
        super(Config.class);
    }
}
