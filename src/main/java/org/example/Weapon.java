
package org.example;

public enum Weapon {
    SWORD(25, 1.5),
    AXE(35, 0.8),
    BOW(15, 2.0),
    STAFF(20, 1.2);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}