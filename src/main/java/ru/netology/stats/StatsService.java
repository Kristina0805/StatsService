package ru.netology.stats;


public class StatsService {
    //1 метод
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //2 метод
    public float averageSales(long[] sales) {
        float result = sumSales(sales) / sales.length;
        return result;
    }

    //3 метод
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;

    }

    //4 метод
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5 метод
    public int belowAverage(long[] sales) {
        int countMonths = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                countMonths = countMonths + 1;
            }
        }
        return countMonths;
    }

    //6 метод
    public int aboveAverage(long[] sales) {
        int countMonths = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                countMonths = countMonths + 1;
            }
        }
        return countMonths;
    }
}
