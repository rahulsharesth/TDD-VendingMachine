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
        final Can loadPepsiCan = new Can(CanType.PEPSI, 100);
        vendingMachine.load(loadPepsiCan);
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
        Can can = vendingMachine.getCan(CanType.PEPSI, 120);
        double change = vendingMachine.getChange();
        assertEquals(change, 20, 0);
    }
    
    @Test
    public void should_return_no_change() {
        double change = vendingMachine.getChange();
        assertEquals(change, 0, 0);
    }

}
