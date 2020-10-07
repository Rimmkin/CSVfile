package ru.netology.bonus;

public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ?3:1;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
    public long calculateSum(long[] purchases){
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
}