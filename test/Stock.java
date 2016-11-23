/**
 * 
 */

/**
 * @author Rahul Sharesth
 *
 */
public class Stock {

    private Can can;
    private int count;

    public Stock(Can can, int count) {
        this.can = can;
        this.count = count;
    }

    /**
     * @return the can
     */
    public Can getCan() {
        return can;
    }

    /**
     * @param can
     *            the can to set
     */
    public void setCan(Can can) {
        this.can = can;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count
     *            the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

}
