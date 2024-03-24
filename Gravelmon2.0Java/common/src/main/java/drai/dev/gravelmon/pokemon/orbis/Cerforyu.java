package drai.dev.gravelmon.pokemon.orbis;

public class Cerforyu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cerforyu() {
        super("Cerforyu",
                Type.NORMAL,Type.FIRE,
                new Stats(225,
                        75,
                        5,
                        5,
                        115,
                        45),
                List.of(Ability.WARMHANDS), Ability.WARMHANDS,
                10, 290,
                new Stats(2,0,0,0,0,0), 30,
                0.0,
                395, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("- PoundSTAB Normal - Defense Curl Normal 9 Refresh Normal 12 Double SlapSTAB Normal 16 Soft-Boiled Normal 20 Fire PunchSTAB Fire 23 Minimize Normal 28 Wake-Up Slap Fighting 33 Sunny Day Fire 39 Heal Pulse Psychic 57 Healing Wish Psychic 64 Double-EdgeSTAB Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.REFRESH,9),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,12),
                        new MoveLearnSetEntry(Move.SOFTBOILED,16),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,20),
                        new MoveLearnSetEntry(Move.MINIMIZE,23),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,28),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,33),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,39),
                        new MoveLearnSetEntry(Move.HEALING_WISH,57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,64)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cerforyu");

    }


}
