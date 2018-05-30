package by.ystar.union;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnionVersionOneTest {

    private static UnionAlg alg = new UnionAlg(10);

    @BeforeClass
    public static void beforeClassInitialization() {
        alg.union1(1, 2);
        alg.union1(6, 9);
        alg.union1(1, 9);

        alg.union1(3, 4);
        alg.union1(3, 7);
        alg.union1(4, 8);
    }

    @Test
    public void validateSuccessfullySearchForTenNumbers() {
        Assert.assertTrue("2 and 9 should be connected", alg.connected(2, 9));
    }

    @Test
    public void validateWhenNumbersAreNotConnected() {
        Assert.assertFalse("2 and 5 should not be connected", alg.connected(2, 5));
    }

    @Test
    public void validateWhenNumbersAreNotConnectedFromDifferentUnions() {
        Assert.assertFalse("2 and 3 should not be connected", alg.connected(2, 3));
    }

    @Test
    public void validateSearchWithThousandsNumbers() {
        UnionAlg object = new UnionAlg(60000);
        object.union1(3, 44000);
        object.union1(33, 55000);
        object.union1(55000, 56000);
        Assert.assertTrue("33 and 56000 should be connected", object.connected(33, 56000));
    }
}
