package ru.netology.stats;

//номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int moreAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        int moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) {
                moreSales ++;
            }
        }
        return moreSales;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int lessAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        int lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) {
                lessSales ++;
            }
        }
        return lessSales;
    }
}
