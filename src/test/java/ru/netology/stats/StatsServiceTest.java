package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    private long[] testMass = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    //1test
    @Test
    public void sum() {
        StatsService myService = new StatsService();
        var result = myService.sumSales(testMass);
        Assertions.assertEquals(180, result);
    }

    //2test
    @Test
    public void average() {
        StatsService myService = new StatsService();
        var result = myService.averageSales(testMass);
        Assertions.assertEquals(15, result);
    }

    //3test
    @Test
    public void max() {
        StatsService myService = new StatsService();

        var result = myService.maxSales(testMass);

        Assertions.assertEquals(8, result);
    }
    //4test

    @Test
    public void Sample() {
        StatsService myService = new StatsService();

        var result = myService.minSales(testMass);

        Assertions.assertEquals(9, result);
    }

    //5test
    @Test
    public void belowAverage() {
        StatsService myService = new StatsService();
        var result = myService.belowAverage(testMass);

        Assertions.assertEquals(5, result);
    }

    //6test
    @Test
    public void aboveAverage() {
        StatsService myService = new StatsService();
        var result = myService.aboveAverage(testMass);

        Assertions.assertEquals(5, result);
    }
}
