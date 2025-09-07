package com.prac.practical_programming.chapter01.sc1_1;

public class Food implements Calculable{
    private long price;
    private long originCost;        // 원가

    public long calculateRevenue() {
        return price;
    }

    public long calculateProfit() {
        return price - originCost;
    }
}
