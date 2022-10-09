package com.spring.oop.encap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carTest(){

        Car car = new Car("포르쉐911", 320);

        car.on();

        for (int i = 0; i < 10; i++) {
            car.accelerator();
        }

    }

}