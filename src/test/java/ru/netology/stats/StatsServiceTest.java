package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldAddUpSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expect = 180;
        long actual = service.getSumSales(sales);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void mustDivideByTwelve() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expect = 15;
        long actual = service.getAverageSum(sales);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expect = 9;
        int actual = service.minSalesDay(sales);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getMonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expect = 8;
        int actual = service.maxSalesDay(sales);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expect = 5;
        int actual = service.salesAboveAverage(sales);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expect = 5;
        int actual = service.salesBelowAverage(sales);

        Assertions.assertEquals(expect, actual);
    }
}

