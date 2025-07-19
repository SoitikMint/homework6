package ru.netology.stats;

public class StatsService {

    public long getSumSales(long[] sales) {
        long sumSales = 0;

        for (long sum : sales) {
            sumSales = sum + sumSales;
        }
        return sumSales;
    }


    public long getAverageSum(long[] sales) {

        long sumSales = getSumSales(sales);
        return sumSales / 12;
    }


    public int minSalesDay(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


    public int maxSalesDay(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesAboveAverage(long[] sales) {
        long average = getAverageSum(sales);
        int higherMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                higherMedium += 1;
            }
        }
        return higherMedium;
    }

    public int salesBelowAverage(long[] sales) {

        int lowerMedium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSum(sales)) {
                lowerMedium = lowerMedium + 1;
            }
        }
        return lowerMedium;
    }
}
