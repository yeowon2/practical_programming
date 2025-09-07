package com.prac.practical_programming.chapter01.sc1_2;

public class Shop {
    public void sell(Account account, Product product) {
        if (account.canAfford(product.getPrice())) {
            account.withdraw(product.getPrice());
            System.out.println(product.getName() + "를 구매했습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
