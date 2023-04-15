package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test // Первый тест: на поиск соответствия между реальной и ожидаемой суммой всех продаж

    public void testSumAllStats() // сумма всех продаж;
    {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;  //8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;
        long actualSum = service.getSumAll(summ);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test // Второй тест: на поиск соответствия между реальной и ожидаемой средней суммой продаж в месяц

    public void testAverageSummStats() // средняя сумма продаж в месяц;
    {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;  //8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;
        long actualAverageSum = service.getAverageSum(summ);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);

    }

    @Test
    // Третий тест: поиск соответствия между реальным и ожидаемым номером последнего месяца, в котором был максимум продаж
    public void testNumberMonthMaxSales() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonth = 8;
        int actualNumberMonth = service.maxSales(summ);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);

    }

    @Test
    // Четвертый тест: поиск соответствия между реальным и ожидаемым номером месяца, в котором был минимум продаж
    public void testNumberMonthMinSales() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonth = 9;
        int actualNumberMonth = service.minSales(summ);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);

    }

    @Test
    // Пятый тест: поиск соответствия между реальной и ожидаемой количеством месяцев, у которых продажи были меньше средней суммы всех продаж
    public void testSumMonthLowAverage() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMonthLowAverage = 5;
        int actualSumMonthLowAverage = service.getSumMonthLowAverage(summ);

        Assertions.assertEquals(expectedSumMonthLowAverage, actualSumMonthLowAverage);

    }

    @Test
    // Шестой тест: поиск соответствия между реальной и ожидаемой количеством месяцев, у которых продажи были больше средней суммы от всех продаж
    public void testSumMonthHighAverage() {
        StatsService service = new StatsService();
        long[] summ = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMonthHighAverage = 5;
        int actualSumMonthHighAverage = service.getSumMonthLowAverage(summ);

        Assertions.assertEquals(expectedSumMonthHighAverage, actualSumMonthHighAverage);

    }
}
