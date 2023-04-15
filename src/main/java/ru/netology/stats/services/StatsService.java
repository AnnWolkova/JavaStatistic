package ru.netology.stats.services;

import java.util.Arrays;


public class StatsService {

    public long getSumAll(long[] summ) {
        long sumAll = 0;
        for (long l : summ) {
            sumAll += l;


        }
//        for (int i = 0; i < summ.length; i++) {
//            sumAll += summ[i];
//        }
        return sumAll;


    }

    public long getAverageSum(long[] summ) // средняя сумма продаж в месяц
    {
        long averageSumm = getSumAll(summ) / 12; //либо можно поделить на summ.length;
        return averageSumm;

    }

    public int maxSales(long[] sales)
    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

    {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales)   // номер месяца, в котором был минимум продаж,
    // то есть осуществлены продажи на минимальную сумму;
    {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getSumMonthLowAverage(long[] summ) //  количество месяцев, сумма продаж в месяц у котррых меньше средней
    {
        long average = getAverageSum(summ); // номер месяца с продажей меньше средней
        int sumMonth = 0;
        for (int i = 0; i < summ.length; i++) {
            if (summ[i] < average) {
                sumMonth++;
            }


        }
        return sumMonth;

    }

    public int getSumMonthHighAverage(long[] summ) //  количество месяцев, сумма продаж в месяц у которых меньше средней
    {
        long average = getAverageSum(summ);
        int sumMonth = 0;
        for (int i = 0; i < summ.length; i++) {
            if (summ[i] > average) {
                sumMonth++;
            }


        }
        return sumMonth;
    }


}

