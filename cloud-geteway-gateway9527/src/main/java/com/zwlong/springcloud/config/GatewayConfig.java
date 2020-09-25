package com.zwlong.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 龙振威
 * @Date 2020/9/22 22:38
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes= builder.routes();
        routes.route("path_route_zwlong",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes= builder.routes();
        routes.route("path_route_zwlong2",r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator3(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes= builder.routes();
        routes.route("path_route_zwlong3",r -> r.path("/mil").uri("http://news.baidu.com/mil")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator4(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes= builder.routes();
        routes.route("path_route_zwlong4",r -> r.path("/finance").uri("http://news.baidu.com/finance")).build();
        return routes.build();
    }
    @Bean
    public RouteLocator customRouteLocator5(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes= builder.routes();
        routes.route("path_route_zwlong5",r -> r.path("/ent").uri("http://news.baidu.com/ent")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator6(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes= builder.routes();
        routes.route("path_route_zwlong6",r -> r.path("/sports").uri("http://news.baidu.com/sports")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator7(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes= builder.routes();
        routes.route("path_route_zwlong7",r -> r.path("/lady").uri("http://news.baidu.com/lady")).build();
        return routes.build();
    }
}
