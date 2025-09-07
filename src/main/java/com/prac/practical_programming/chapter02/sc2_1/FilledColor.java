package com.prac.practical_programming.chapter02.sc2_1;

import lombok.Getter;

import java.awt.*;

@Getter
public class FilledColor {
    public final int r;
    public final int g;
    public final int b;
    public final Shape shape;   // FilledColor는 지정된 Shape에 들어가는 색상을 의미하는 클래스

    public FilledColor(int r, int g, int b, Shape shape) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.shape = shape;
    }
}
