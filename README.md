# Spring IoC and Dependency Injection - Payment Service Project

This project demonstrates the basics of **Spring IoC (Inversion of Control)** and **Dependency Injection (DI)**, utilizing Spring Beans in a Java application. It implements a simple payment service with different payment methods, configured and managed by the Spring IoC container.

## Overview
- **IoC Container**: Manages dependencies among objects, allowing for flexible configurations and cleaner code.
- **Spring Beans**: Core Java classes (like `CreditCardPayment` and `DebitCardPayment`) managed by Spring's IoC container.
- **Dependency Injection**: Dependencies are injected via constructor and setter injection as specified in the `beans.xml` configuration.

## Project Setup
- **Maven Dependency**: Uses `spring-context` for IoC functionality.

  ```xml
  <dependencies>
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-context</artifactId>
          <version>5.3.25</version>
      </dependency>
  </dependencies>
