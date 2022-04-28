package com.luigi.springframework.sfgdi.controllers;

import com.luigi.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController underTest;

    @BeforeEach
    void setUp() {
        underTest = new SetterInjectedController();
        underTest.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(underTest.getGreeting());
    }
}