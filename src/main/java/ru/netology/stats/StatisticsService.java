package ru.netology.stats;

public class StatisticsService {

    public long findSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public long findMin(long[] incomes) {
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

}
