package csd.uoc.gr.A23.armor;

public abstract class Gun {
    private final int power;

    public Gun(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
