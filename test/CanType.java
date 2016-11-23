/**
 * 
 */

/**
 * @author Rahul Sharesth
 *
 */
public enum CanType {

    PEPSI, SEVENUP, BEER;

    boolean isAvaliable = true;

    public void setAvaliable(boolean isAvailable) {
        this.isAvaliable = isAvailable;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

}
