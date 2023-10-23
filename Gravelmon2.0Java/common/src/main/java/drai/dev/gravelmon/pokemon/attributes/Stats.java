package drai.dev.gravelmon.pokemon.attributes;

public class Stats {
    private int HP;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public Stats(int HP, int attack, int defense, int specialAttack, int specialDefense, int speed) {
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public int getHP() {
        return HP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public int getSpeed() {
        return speed;
    }
}
