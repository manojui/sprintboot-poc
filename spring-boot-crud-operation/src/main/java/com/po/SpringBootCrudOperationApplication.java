package com.po;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableWebSecurity
public class SpringBootCrudOperationApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootCrudOperationApplication.class, args);
}
}
