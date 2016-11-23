import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private Map<CanType, Stock> stocks = new HashMap<CanType, Stock>();;
    private double change;

    public void load(final Can can, final Stock stock) {
        this.stocks.put(can.getCanType(), stock);
    }

    public Can getCan(CanType canType, double price) {
        if (price == 0 || !stocks.containsKey(canType) || stocks.get(canType).getCan().getPrice() > price) {
            return null;
        }
        this.change = price - stocks.get(canType).getCan().getPrice();
        return new Can(canType, price);
    }

    public double getChange() {
        return change;
    }

}
