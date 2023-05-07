import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsNetologi;


public class MiddlePurchaseTest {
    @Test
    public void testMiddle() {
        StatsNetologi service = new StatsNetologi();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSales = service.middlePurchase(sales);
        long actualSales = 15;
        Assertions.assertEquals(expectedSales, actualSales);
    }
}

