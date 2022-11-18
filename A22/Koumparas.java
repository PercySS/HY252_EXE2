package csd.uoc.gr.A22;

public class Koumparas extends KoumparasADT {
    //      SETTERS
    public void setBills(int bills) {
        this.bills = bills;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public void setActiveCapacity(int activeCapacity) {
        this.activeCapacity = activeCapacity;
    }

    public void setIsBroken(boolean isBroken) {
        this.broken = isBroken;
    }

    public void setTotalWorth(double worth) {
        this.totalWorth = worth;
    }


    //      GETTERS
    public int getBills() {
        return this.bills;
    }

    public int getCoins() {
        return this.coins;
    }

    public int getTotalCapacity() {
        return this.totalCapacity;
    }

    public int getActiveCapacity() {
        return this.activeCapacity;
    }

    public boolean isBrokenKoumparas() {
        return this.broken;
    }

    public double getTotalWorth() {
        return this.totalWorth;
    }

    //      CONSTRUCTORS
    public Koumparas() {
        setIsBroken(false);
        setBills(0);
        setCoins(0);
        setTotalWorth(0);
        setTotalCapacity(1000);
        setActiveCapacity(0);
    }

    public Koumparas(int coins) {
        setIsBroken(false);
        setCoins(coins);
        setBills(0);
        setTotalWorth(coins);
        setTotalCapacity(1000);
        setActiveCapacity(coins);
    }

    public Koumparas(int coins, int bills) {
        setIsBroken(false);
        setCoins(coins);
        setBills(bills);
        setTotalWorth(bills + coins);
        setTotalCapacity(1000);
        setActiveCapacity(coins + bills);
    }


    //      OTHER METHODS

    // Methods like addCoin, addBill, addMoney is a good example for case that I have classes for a coin or a bill or superclass Money.
    public void addCoin(int coin) throws KoumparasIsFullException, KoumparasIsBrokenException {
        if (this.isBrokenKoumparas()) {
            throw new KoumparasIsBrokenException("You tried to put money in a broken piggy bank!");
        }
        if (getActiveCapacity() < getTotalCapacity()) {
            setCoins(getCoins() + coin);
            setActiveCapacity(getActiveCapacity() + coin);
        } else {
            throw new KoumparasIsFullException("The piggy bank is full!");
        }
    }

    public void addMoney(int coin, int bill) throws KoumparasIsFullException, KoumparasIsBrokenException {
        if (this.isBrokenKoumparas()) {
            throw new KoumparasIsBrokenException("You tried to put money in a broken piggy bank!");
        }
        if (getActiveCapacity() + 2 <= getTotalCapacity()) {
            setCoins(getCoins() + coin);
            setBills(getBills() + bill);
            setActiveCapacity(getActiveCapacity() + 2);
        } else {
            throw new KoumparasIsFullException("The piggy bank is full!");
        }
    }

    public void addBill(int bill) throws KoumparasIsFullException, KoumparasIsBrokenException {
        if (this.isBrokenKoumparas()) {
            throw new KoumparasIsBrokenException("You tried to put money in a broken piggy bank!");
        }
        if (getActiveCapacity() < getTotalCapacity()) {
            setCoins(getCoins() + bill);
            setActiveCapacity(getActiveCapacity() + 1);
        } else {
            throw new KoumparasIsFullException("The piggy bank is full!");
        }
    }

    public boolean isFullKoumparas() {
        return getActiveCapacity() == getTotalCapacity();
    }

    public double checkWorth() throws KoumparasIsNotBrokenException {
        if (this.broken) {
            return this.getTotalWorth();
        } else {
            throw new KoumparasIsNotBrokenException("You have to break the piggy bank first!");
        }
    }

    public void breakKoumparas() throws KoumparasIsBrokenException{
        if (!this.broken) {
            setIsBroken(true);
        } else {
            throw new KoumparasIsBrokenException("You cannot break the broken sir!");
        }
    }
}
