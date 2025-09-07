package com.prac.practical_programming.chapter01.sc1_1;

import java.util.List;

public class Store implements Calculable{
    private List<Calculable> orders;
    private long rentalFee; // 임대료

    public long calculateRevenue() {
        long revenue = 0;
        for(Calculable order : orders) {
            revenue += order.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Calculable order : orders) {
            income += order.calculateProfit();
        }
        return income - rentalFee;
    }
}
