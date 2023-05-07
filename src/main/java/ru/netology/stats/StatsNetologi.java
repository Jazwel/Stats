package ru.netology.stats;

public class StatsNetologi {
    public long sumSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }


    public long middlePurchase(long[] sales) {
        long midPurch = sumSales(sales) / sales.length;
        return midPurch;


    }

    public int maxPrice(long[] sales) {
        int maxSell = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSell]) {
                maxSell = i;
            }
        }
        return maxSell + 1;
    }

    public int minPrice(long[] sales) {
        int minSell = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSell]) {
                minSell = i;
            }
        }
        return minSell + 1;
    }

    public int lessMiddle(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale < middlePurchase(sales)) {
                months++;
            }
        }
        return months;
    }

    public int moreMiddle(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale > middlePurchase(sales)) {
                months++;
            }

        }
        return months;
    }


}





