package com.spring.oop.basic;

public class Person {

    String name;
    Dog myDog;

    Person(String name){
        this.name = name;
    }

    //강아지를 분양받는 기능
    void takeDog(PetShop shop){
        Dog dog = shop.giveDog(200000);

        if(dog != null){
            System.out.printf("%s가 %s를 분양받았습니다.\n", this.name, dog.name);

            this.myDog = dog;
        } else {
            System.out.println("돈 없어서 분양이 안된대 ㅠㅅㅠ");
        }


    }

    public String getMyDogName(){
        return myDog.name;
    }

    public String getMyDogKind(){
        return myDog.kind;
    }

}
