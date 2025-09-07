package com.prac.practical_programming.chapter02.sc2_1;

public class AlphaColor extends Color {
    // 상속된 클래스의 멤버 변수가 불변이 아닐 수 있음
    public int a;

    public AlphaColor(int r, int g, int b, int a) {
        super(r, g, b);
        this.a = a;
    }
}
