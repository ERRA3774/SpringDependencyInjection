package com.luigi.springframework.sfgdi.controllers;

import com.luigi.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController underTest;

    @BeforeEach
    void setUp() {
        underTest = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(underTest.getGreeting());
    }
}