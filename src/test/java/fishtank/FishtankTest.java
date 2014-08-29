package fishtank;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class FishtankTest {

    @Test(testName = "Parameters: 1 1 1 1 1")
    public void testCase1() throws Exception {
        Fishtank tank = new Fishtank();
        tank.initialize(new String[]{"1", "1", "1", "1", "1"});
        tank.run();
        Map<Size,Integer> fishInTank = tank.getFish();
        Assert.assertEquals(fishInTank.keySet().size(), 1);
        Assert.assertTrue(fishInTank.containsKey(Size.XLARGE));
        Assert.assertEquals(fishInTank.get(Size.XLARGE), Integer.valueOf(1));
        Assert.assertEquals(tank.getFishEaten(), 4);
        Assert.assertEquals(tank.getFishGrown(), 1);
    }

    @Test(testName = "Parameters: 10 4 7 2 0")
    public void testCase2() throws Exception {
        Fishtank tank = new Fishtank();
        tank.initialize(new String[] {"10", "4", "7", "2", "0"});
        tank.run();
        Map<Size,Integer> fishInTank = tank.getFish();
        Assert.assertEquals(fishInTank.keySet().size(), 1);
        Assert.assertTrue(fishInTank.containsKey(Size.LARGE));
        Assert.assertEquals(fishInTank.get(Size.LARGE), Integer.valueOf(7));
        Assert.assertEquals(tank.getFishEaten(), 16);
        Assert.assertEquals(tank.getFishGrown(), 15);
    }
}
