package com.prac.practical_programming.chapter01.sc1_2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private long money;

    // TDA 원칙에 따라 잔액이 물건의 가격보다 큰지 확인
    public boolean canAfford(long amount) {
        return money >= amount;
    }

    public void withdraw(long amount) {
        money -= amount;
    }
}
