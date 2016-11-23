import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private Map<CanType, Can> cans = new HashMap<CanType, Can>();;
    private double change;

    public void load(final Can can, final Stock stock) {
        this.cans.put(can.getCanType(), can);
    }

    public Can getCan(CanType canType, double price) {
        if (price == 0 || !cans.containsKey(canType) ||  cans.get(canType).getPrice() >  price) {
            return null;
        }
        this.change = price - cans.get(canType).getPrice();
        return new Can(canType, price);
    }

    public double getChange() {
        return change;
    }

}
