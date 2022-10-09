package com.spring.oop.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    @DisplayName("강아지를 정상적으로 분양받아야 한다.")
    void personTest(){

        //given : 테스트시 제공할 데이터
        Person kim = new Person("김철수");
        Person park = new Person("박영희");
        Person hong = new Person("홍길동");
        PetShop dogLover = new PetShop();


        //when : 테스트 상황
        kim.takeDog(dogLover);
        park.takeDog(dogLover);
        hong.takeDog(dogLover);

        //then : 테스트 결과
        assertEquals("해피", kim.getMyDogName());
        assertEquals("뽀삐", park.getMyDogName());
        assertEquals("초코", hong.getMyDogName());


    }
}