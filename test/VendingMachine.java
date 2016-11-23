public class VendingMachine {

    private Can can;
    private double change;

    public void load(final Can can) {
        this.can = can;
    }

    public Can getCan(CanType canType, double price) {
        if (price == 0 || !canType.isAvaliable ) {
            return null;
        }
        return new Can(canType, price);
    }

    public double getChange(CanType canType, double price) {
        // TODO Auto-generated method stub
        return change;
    }

}
