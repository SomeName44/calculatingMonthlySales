package ru.netology.stats.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceTest {

    @Test // 1. Сумма всех продаж
    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.calculateSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test // 2. Средняя сумма продаж в месяц
    public void shouldFindMiddleSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;

        long actualSum = service.middleSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 8;
        long actualASum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualASum);
    }

    @Test // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 9;
        long actualSum = service.minSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test // 5. Количество месяцев, в которых продажи были ниже среднего
    public void shouldFindMonthSlowMiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        long actualSum = service.monthSlowMiddleSales(sales);

        Assertions.assertEquals(expectedMonth, actualSum);
    }

    @Test // 6. Количество месяцев, в которых продажи были выше среднего
    public void shouldFindAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        long actualSum = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedMonth, actualSum);
    }

}
