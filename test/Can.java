public class Can {

    private CanType canType;
    private double price;

    public Can(final CanType canType, final double price) {
        this.canType = canType;
        this.price = price;
    }

    /**
     * @return the canType
     */
    public CanType getCanType() {
        return canType;
    }

    /**
     * @param canType
     *            the canType to set
     */
    public void setCanType(CanType canType) {
        this.canType = canType;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
