import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsNetologi;

public class LessMiddleTest {
    @Test
    public void lessMiddleTest9() {
        StatsNetologi service = new StatsNetologi();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualMonth = service.lessMiddle(sales);
        long expectedMonth = 5;
        Assertions.assertEquals(expectedMonth, actualMonth);

    }
}
