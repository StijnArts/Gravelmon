package drai.dev.gravelmon.data.attributes;

import java.util.*;

public class Stats {
    private int HP;
    private int attack;
    private int defence;
    private int specialAttack;
    private int specialDefence;
    private int speed;

    public Stats(int HP, int attack, int defence, int specialAttack, int specialDefence, int speed) {
        this.HP = HP;
        this.attack = attack;
        this.defence = defence;
        this.specialAttack = specialAttack;
        this.specialDefence = specialDefence;
        this.speed = speed;
    }

    public Stats(Stats other, double factor) {
        this.HP = (int) (other.HP * factor);
        this.attack = (int) (other.attack * factor);
        this.defence = (int) (other.defence * factor);
        this.specialAttack = (int) (other.specialAttack * factor);
        this.specialDefence = (int) (other.specialDefence * factor);
        this.speed = (int) (other.speed * factor);
    }

    public Stats(int baseStatTotal, StatArchetype archetype, List<StatType> preferredStats) {
        this(new Stats(archetype, preferredStats), baseStatTotal / 600d);
    }

    public Stats(StatArchetype archetype, List<StatType> preferredStats){
        this.HP = archetype.hp;
        this.attack = archetype.attack;
        this.defence = archetype.defence;
        this.specialAttack = archetype.specialAttack;
        this.specialDefence = archetype.specialDefence;
        this.speed = archetype.speed;
        if(!preferredStats.isEmpty()){
            var impactedStats = Arrays.stream(StatType.values()).filter(statType -> !preferredStats.contains(statType)).toList();
            var impact = 20 / impactedStats.size();
            var remaining = 20 % impactedStats.size();
            for (var preferredStat: preferredStats) {
                this.impactStat(preferredStat, 20);
                for (var stat: impactedStats) {
                    this.impactStat(stat, impact * -1);
                }
                this.impactStat(impactedStats.get(0), remaining * -1);
            }
        }
    }

    private void impactStat(StatType preferredStat, int i) {
        switch (preferredStat){
            case HP -> this.HP += i;
            case ATTACK -> this.attack += i;
            case DEFENCE -> this.defence += i;
            case SPECIAL_ATTACK -> this.specialAttack += i;
            case SPECIAL_DEFENCE -> this.specialDefence += i;
            case SPEED -> this.speed += i;
        }
    }

    public int getHP() {
        return HP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public int getSpecialDefence() {
        return specialDefence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTotal() {
        return  HP + attack + defence + specialAttack + specialDefence + speed;
    }

    public boolean isEmpty() {
        return HP == 0 || attack == 0 || defence == 0 || specialAttack == 0 || specialDefence == 0 || speed == 0;
    }
}
