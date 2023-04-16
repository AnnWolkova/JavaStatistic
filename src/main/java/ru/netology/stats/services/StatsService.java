package ru.netology.stats.services;


public class StatsService {

    public long getSumAll(long[] summ) {
        long sumAll = 0;
        for (long l : summ) {
            sumAll += l;


        }
        return sumAll;


    }

    public long getAverageSum(long[] summ) {
        long averageSumm = getSumAll(summ) / 12;
        return averageSumm;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getSumMonthLowAverage(long[] summ) {
        long average = getAverageSum(summ);
        int sumMonth = 0;
        for (int i = 0; i < summ.length; i++) {
            if (summ[i] < average) {
                sumMonth++;
            }


        }
        return sumMonth;

    }

    public int getSumMonthHighAverage(long[] summ) {
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

