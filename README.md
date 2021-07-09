# Microserviços usando Spring Clound

Projeto que visa em cadastrar produtos de uma loja e apresentar para o cliente poder colocar em um carrinho. Este projeto tem dois dominios: o carrinho de compras e o catálogo de produtos.

## Anotações

> Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server. 
> 
> [Spring Boot - Eureka Server](https://www.tutorialspoint.com/spring_boot/spring_boot_eureka_server.htm)

> Spring Cloud provides tools for developers to quickly build some of the common patterns in distributed systems (e.g. configuration management, service discovery, circuit breakers, intelligent routing, micro-proxy, control bus, one-time tokens, global locks, leadership election, distributed sessions, cluster state). Coordination of distributed systems leads to boiler plate patterns, and using Spring Cloud developers can quickly stand up services and applications that implement those patterns. They will work well in any distributed environment, including the developer’s own laptop, bare metal data centres, and managed platforms such as Cloud Foundry.
> [Spirng Cloud](https://spring.io/projects/spring-cloud)