package com.spring.oop.basic;

public class Dog {
    //필드
    String name;
    String kind;
    int age;

    //생성자(함수)
    Dog(String name, String kind){
        System.out.println("멍멍이 출생신고함!");
        this.name = name;
        this.kind = kind;
        this.age = 1;
    }

    //메서드
    void bite(String target){
        System.out.printf("%s 멍멍이는 %s를 꺠물어요~\n", name, target);
    }

    void introduce(){
        System.out.printf("내 이름은 %s고 나는 %s종이야~~\n", name, kind);
        System.out.printf("나이는 %d세란다~\n", age);
        System.out.println("=============================");
    }
}
