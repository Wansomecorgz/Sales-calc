package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calcAverage(int[] sales) {
        int sum = calcSum(sales);
        int average = sum / sales.length;
        return average;
    }

    public int findTopMonth(int[] sales) {
        int topMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[topMonth]) {
                topMonth = month;
            }
            month = month + 1;
        }
        return topMonth + 1;
    }

    public int findBottomMonth(int[] sales) {
        int bottomMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[bottomMonth]) {
                bottomMonth = month;
            }
            month = month + 1;
        }
        return bottomMonth + 1;
    }

    public int calcNumberLessAverage(int[] sales) {
        int number = 0;
        int average = calcAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                number = number + 1;
            }
        }
        return number;

    }

    public int calcNumberMoreAverage(int[] sales) {
        int number = 0;
        int average = calcAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                number = number + 1;
            }
        }
        return number;
    }
}
