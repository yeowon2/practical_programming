package com.prac.practical_programming.chapter01.sc1_1;

import java.util.List;

public class Order implements Calculable{
    private List<Calculable> foods;
    private double transactionFeePercent = 0.03;    // 결제 수수료 3%

    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable food : foods) {
            revenue += food.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Calculable food : foods) {
            income += food.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}
