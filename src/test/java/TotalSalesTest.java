import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsNetologi;

public class TotalSalesTest {
    @Test
    public void testSales() {
        StatsNetologi service = new StatsNetologi();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSales = service.sumSales(sales);
        long actualSales = 180;
        Assertions.assertEquals(expectedSales, actualSales);


    }
}
