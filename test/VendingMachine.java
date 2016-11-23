import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Can> cans = new ArrayList<Can>();

    public Can getCan(CanType canType, double price) {

        if (price == 0 || !canType.isAvaliable) {
            return null;
        }
        return new Can(canType, price);
    }

    public double getChange(CanType canType, double price) {
        // TODO Auto-generated method stub
        return 0;
    }

}
