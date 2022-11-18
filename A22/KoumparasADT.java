package csd.uoc.gr.A22;

/**
 * @author : Dimitrios Makrogiannis csd4676
 */

public abstract class KoumparasADT {
    protected int coins;
    protected int bills;
    protected int totalCapacity;
    protected int activeCapacity;
    protected double totalWorth;
    protected boolean broken;


    //      SETTERS
    /**
     * This method is a mutative transformer.
     * @pre : valid instance of int.
     * @post : Sets the attribute bills to the int given.
     * @param bills all the bills put in the instance of Koumparas.
     */
    public abstract void setBills(int bills);

    /**
     * This method is a mutative transformer.
     * @pre : valid instance of int.
     * @post : Sets the attribute coins to the int given.
     * @param coins all the coins put in the instance of Koumparas.
     */
    public abstract void setCoins(int coins);

    /**
     * This method is a mutative transformer.
     * @pre : valid instance of int.
     * @post : Sets the attribute of totalCapacity to the int given.
     * @param totalCapacity the total capacity of an instance Koumparas.
     */
    public abstract void setTotalCapacity(int totalCapacity);

    /**
     * This method is a mutative transformer.
     * @pre : valid instance of int.
     * @post : Sets the attribute activeCapacity to the int given.
     * @param activeCapacity the current capacity of the instance Koumparas.
     */
    public abstract void setActiveCapacity(int activeCapacity);

    /**
     * This method is a mutative transformer.
     * @pre : valid instance of bool.
     * @post : Sets the attribute isBroken to the bool given.
     * @param isBroken the current condition of the instance Koumparas.
     */
    public abstract void setIsBroken(boolean isBroken);

    /**
     * This method is a mutative transformer.
     * @pre : Valid instance of double.
     * @post : Sets the attribute worth to the double given.
     * @param worth the worth of the money in the instance of Koumparas.
     */
    public abstract void setTotalWorth(double worth);


    //      GETTERS
    /**
     * Accessor
     * @pre : void.
     * @post : gets the value of attribute bills.
     * @return bills.
     */
    public abstract int getBills();

    /**
     * Accessor
     * @pre : void.
     * @post : gets the value of attribute coins.
     * @return coins.
     */
    public abstract int getCoins();

    /**
     * Accessor
     * @pre : void.
     * @post : gets the value of attribute totalCapacity.
     * @return totalCapacity.
     */
    public abstract int getTotalCapacity();

    /**
     * Accessor
     * @pre : void.
     * @post : gets the value of attribute activeCapacity.
     * @return activeCapacity.
     */
    public abstract int getActiveCapacity();

    /**
     * Accessor
     * @pre : void.
     * @post : gets the value of attribute isBroken.
     * @return isBroken.
     */
    public abstract boolean isBrokenKoumparas();

    /**
     * Accessor
     * @pre : void.
     * @post : gets the value of attribute totalWorth.
     * @return totalWorth.
     */
    public abstract double getTotalWorth();

    //      CONSTRUCTORS
    /**
     * Is a constructor.
     * @pre :
     * @post : making a default instance of class Koumparas.
     */
    public void Koumparas() {}

    /**
     * Is a constructor.
     * @pre : valid instance of int.
     * @post : making an instance of Koumparas with coins inside.
     * @param coins the first coins put in koumparas.
     */
    public void Koumparas(int coins) {}

    /**
     * Is a constructor.
     * @pre : valid instances of int.
     * @post : making an instance of Koumparas with coins and bills inside.
     * @param coins the first coins put in Koumparas.
     * @param bills the first bills put in Koumparas.
     */
    public void Koumparas(int coins, int bills) {}


    //      OTHER METHODS
    /**
     * Transformer
     * @pre : valid instance of int.
     * @post : adds int to attribute coins, adds int to the total capacity.
     * @param coin the coins put in instance of Koumparas.
     * @throws KoumparasIsFullException Koumparas is full, we cannot put anything in.
     * @throws KoumparasIsBrokenException Koumparas is in broken condition, we cannot put anything in.
     */
    public abstract void addCoin (int coin) throws KoumparasIsFullException, KoumparasIsBrokenException;

    /**
     * Transformer
     * @pre : valid instance of int.
     * @post : adds int to attribute bills, adds int to total capacity.
     * @param bill the bills put in instance of Koumparas.
     * @throws KoumparasIsFullException Koumparas is full, we cannot put anything in.
     * @throws KoumparasIsBrokenException Koumparas is in broken condition, we cannot put anything in.
     */
    public abstract void addBill (int bill) throws KoumparasIsFullException, KoumparasIsBrokenException;

    /**
     * Transformer
     * @pre : valid instances of int.
     * @post : adds ints to the corresponding attributes, adds ints to the total capacity.
     * @param coin the coins put in the instance of Koumparas.
     * @param bill the bills put in the instance of Koumparas.
     * @throws KoumparasIsFullException Koumparas is full, we cannot put anything in.
     * @throws KoumparasIsBrokenException Koumparas is in broken condition, we cannot put anything in.
     */
    public abstract void addMoney (int coin, int bill) throws KoumparasIsFullException, KoumparasIsBrokenException;

    /**
     * Observer
     * @pre : void.
     * @post : Informs if the Koumparas is full or not.
     * @return true if Koumparas is full or false If it is not.
     */
    public abstract boolean isFullKoumparas();

    /**
     * Accessor
     * @pre : void.
     * @post : Gives the totalWorth to the user.
     * @return the totalWorth of coins and bills in the Koumparas instance.
     * @throws KoumparasIsNotBrokenException Koumparas must be in broken condition in order to check the worth.
     */
    public abstract double checkWorth() throws KoumparasIsNotBrokenException;

    /**
     * Transformer
     * @pre : void.
     * @post : the attribute isBroken is changed to true.
     * @throws KoumparasIsBrokenException Koumparas must not be in broken condition in order to be broken.
     */
    public abstract void breakKoumparas() throws KoumparasIsBrokenException;



}
