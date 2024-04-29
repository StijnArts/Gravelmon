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

    public Stats(Stats other, double factor) {
        this.HP = (int) (other.HP * factor);
        this.attack = (int) (other.attack * factor);
        this.defense = (int) (other.defense * factor);
        this.specialAttack = (int) (other.specialAttack * factor);
        this.specialDefense = (int) (other.specialDefense * factor);
        this.speed = (int) (other.speed * factor);
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

    public int getTotal() {
        return  HP + attack + defense + specialAttack + specialDefense + speed;
    }

    public boolean isEmpty() {
        return HP == 0 || attack == 0 || defense == 0 || specialAttack == 0 || specialDefense == 0 || speed == 0;
    }
}
