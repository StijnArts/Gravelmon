package drai.dev.data.attributes;
//Archetypes should assume a bst of 600
public enum StatArchetype {
    FAST_SPECIAL_ATTACKER(90, 50, 95, 135, 95, 135),
    FAST_PHYSICAL_ATTACKER(90, 135, 95, 50, 95, 135),
    BULKY_SPECIAL_ATTACKER(135, 50, 105, 115, 135, 60),
    BULKY_PHYSICAL_ATTACKER(135, 115, 135, 50, 105, 60),
    PHYSICAL_ATTACKER(110, 135, 95, 60, 105, 95),
    SPECIAL_ATTACKER(110, 60, 95, 135, 105, 95),
    MIXED_ATTACKER(105, 110, 95, 110, 95, 85),
    BULKY_SUPPORT(95, 95, 135, 80, 115, 80),
    FAST_SUPPORT(85, 85, 105, 80, 85, 150),
    SLOW_BULKY_PHYSICAL_ATTACKER(135, 135, 135, 50, 115, 30),
    SLOW_BULKY_SPECIAL_ATTACKER(135, 50, 135, 135, 115, 30),
    SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER(135, 50, 155, 135, 95, 30),
    FAST_SPECIAL_WALL(135, 50, 65, 75, 155, 110),
    FAST_PHYSICAL_WALL(135, 75, 155, 50, 65, 110),
    SPECIAL_WALL(165, 50, 75, 75, 195, 30),
    PHYSICAL_WALL(165, 75, 195, 50, 50, 30),
    MIXED_WALL(135, 60, 195, 45, 195, 30),
    ALL_ROUND(100, 100, 100, 100, 100, 100);


    StatArchetype(int hp, int attack, int defence, int specialAttack, int specialDefence, int speed) {
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.specialAttack = specialAttack;
        this.specialDefence = specialDefence;
        this.speed = speed;
    }

    public int hp, attack, defence, specialAttack, specialDefence, speed;

    public static StatArchetype findClosestArchetype(Stats pokemonStats) {
        StatArchetype closestArchetype = null;
        double minDistance = Double.MAX_VALUE;

        for (StatArchetype archetype : StatArchetype.values()) {
            Stats archetypeStats = new Stats(archetype.hp, archetype.attack, archetype.defence, archetype.specialAttack, archetype.specialDefence, archetype.speed);
            double distance = calculateDistance(pokemonStats, archetypeStats);

            if (distance < minDistance) {
                minDistance = distance;
                closestArchetype = archetype;
            }
        }

        return closestArchetype;
    }

    public static double calculateDistance(Stats stats1, Stats stats2) {
        return Math.sqrt(
                Math.pow(stats1.getHP() - stats2.getHP(), 2) +
                        Math.pow(stats1.getAttack() - stats2.getAttack(), 2) +
                        Math.pow(stats1.getDefence() - stats2.getDefence(), 2) +
                        Math.pow(stats1.getSpecialAttack() - stats2.getSpecialAttack(), 2) +
                        Math.pow(stats1.getSpecialDefence() - stats2.getSpecialDefence(), 2) +
                        Math.pow(stats1.getSpeed() - stats2.getSpeed(), 2)
        );
    }
}
