import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Rahul Sharesth
 *
 */
public class VendingMachineTest {

    private VendingMachine vendingMachine = null;

    @Before
    public void setup() {
        vendingMachine = new VendingMachine();
        CanType.SEVENUP.setAvaliable(false);
    }

    @Test
    public void should_return_nothing() {
        Can can = vendingMachine.getCan(CanType.SEVENUP, 0);
        assertNull(can);
    }

    @Test
    public void should_return_pepsi() {
        Can can = vendingMachine.getCan(CanType.PEPSI, 100);
        assertEquals(CanType.PEPSI, can.getCanType());
    }

    @Test
    public void should_return_change() {
        double change = vendingMachine.getChange(CanType.PEPSI, 100);
        assertEquals(change, 0, 0);
    }

}
