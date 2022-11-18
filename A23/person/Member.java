package csd.uoc.gr.A23.person;

import csd.uoc.gr.A23.armor.Gun;
import csd.uoc.gr.A23.exception.DeadCharacterException;
import csd.uoc.gr.A23.utilities.Utilities;

public abstract class Member extends GunCarrier implements Character {
    private final String name;
    private int health;
    private final boolean bodyArmor;
    private final int iq;
    private final int physicalStrength;


    public Member(String name, int health, Gun gun, boolean bodyArmor, int iq, int physicalStrength) {
        super(gun);
        this.name = name;
        this.health = health;
        this.bodyArmor = bodyArmor;
        this.iq = iq;
        this.physicalStrength = physicalStrength;
    }

    public int getHealth() { return this.health; }

    public String getName() {
        return this.name;
    }

     public boolean isAlive() { return this.getHealth() > 0; }

    public boolean hasBodyArmor() {
        return this.bodyArmor;
    }

    public void damageHealth(int damage) {
        this.health -= damage;
    }

    public int calculateAtomicPower() { return this.iq + this.physicalStrength; }

    public void fight(Character adversary) throws DeadCharacterException {
        if (!this.isAlive()) { throw new DeadCharacterException("You dead ong!"); }

        int dmg = 0;
        int gunDmg = this.getGun().getPower();

        if (adversary instanceof Member) {
            if (adversary instanceof Insider) {
                dmg = 2;
            } else {
                if (hasBodyArmor()) {
                    dmg = gunDmg/2 + (this.calculateAtomicPower() + adversary.calculateAtomicPower()) + this.handleHostage();
                } else {
                   dmg = gunDmg + (this.calculateAtomicPower() - adversary.calculateAtomicPower()) + this.handleHostage();
                }
            }
        }
        adversary.damageHealth(dmg);
    }

    public int handleHostage() { return Utilities.getRandomVal(-2, 2); }
}
