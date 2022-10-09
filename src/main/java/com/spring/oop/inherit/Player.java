package com.spring.oop.inherit;

public class Player {

    private String nickName;    //닉네임
    private int level;          //레벨
    private int hp;             //체력

//    public Player(){
//        System.out.println("Player 기본 생성자 호출!");
//    }

    public Player(String nickName){
        System.out.println("Player 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }



    //캐릭터 상세 정보 보기
    public void info(){
        System.out.println("====== 캐릭터 정보 ======");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);

    }


}
