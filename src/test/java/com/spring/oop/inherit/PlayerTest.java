package com.spring.oop.inherit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void playerTest(){

        Warrior w = new Warrior("주차왕파킹");

        w.info();

    }

}