package com.spring.oop.basic;

import java.util.ArrayList;
import java.util.List;

public class PetShop {

    List<Dog> dogs;

    PetShop(){
        dogs = new ArrayList<>();
        dogs.add(new Dog("해피", "푸들"));
        dogs.add(new Dog("뽀삐", "시츄"));
        dogs.add(new Dog("초코", "진돗개"));
    }

    //강아지를 분양해서 주는 기능
    Dog giveDog(int money){
       if(money < 100000){
           System.out.println("분양할 수 없습니다.");
           return null;
       }

        Dog dog = dogs.remove(0);
        System.out.printf("[%s] 멍멍이가 분양되었습니다.\n", dog.name);

        return dog;
    }

}
