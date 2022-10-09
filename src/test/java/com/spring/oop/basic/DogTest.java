package com.spring.oop.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    //테스트 이름은 단언(Assertion)기법을 사용한다.
    @Test
    @DisplayName("강아지 정확하게 생성되어야 한다.")
    void createTest(){

        Dog poppy = new Dog("뽀삐", "시츄");
        System.out.println("poppy = " + poppy);
        poppy.bite("저녀석");
        poppy.introduce();

        Dog happy = new Dog("해피","푸들");
        System.out.println("happy = " + happy);
        happy.bite("이녀석");
        happy.introduce();


    }
}