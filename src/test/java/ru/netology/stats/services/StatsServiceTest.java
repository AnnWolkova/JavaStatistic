package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test

    public void testSumAllStats() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSumAll(summ);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test

    public void testAverageSummStats() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;  //8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;
        long actualAverageSum = service.getAverageSum(summ);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);

    }

    @Test
    public void testNumberMonthMaxSales() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonth = 8;
        int actualNumberMonth = service.maxSales(summ);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);

    }

    @Test

    public void testNumberMonthMinSales() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonth = 9;
        int actualNumberMonth = service.minSales(summ);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);

    }

    @Test

    public void testSumMonthLowAverage() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMonthLowAverage = 5;
        int actualSumMonthLowAverage = service.getSumMonthLowAverage(summ);

        Assertions.assertEquals(expectedSumMonthLowAverage, actualSumMonthLowAverage);

    }

    @Test
    public void testSumMonthHighAverage() {
        StatsService service = new StatsService();

        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMonthHighAverage = 5;
        int actualSumMonthHighAverage = service.getSumMonthLowAverage(summ);

        Assertions.assertEquals(expectedSumMonthHighAverage, actualSumMonthHighAverage);
    }
}
