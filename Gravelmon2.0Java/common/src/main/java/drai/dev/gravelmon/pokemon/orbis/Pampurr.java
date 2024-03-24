package drai.dev.gravelmon.pokemon.orbis;

public class Pampurr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pampurr() {
        super("Pampurr",
                Type.PSYCHIC,Type.NORMAL,
                new Stats(45,
                        35,
                        40,
                        60,
                        75,
                        70),
                List.of(Ability.FLUFFY,Ability.KLUTZ), Ability.FUR_COAT,
                4, 0,
                new Stats(0,0,0,0,1,0), 100,
                0.33,
                150, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Pampurr have great pride in their white fluffy coats, they keep it immaculate at all costs. They require a great deal of care and pampering to keep them healthy. The orb on their necks contain a mystical power that is said to bring immense luck to those who polish it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.PSYBEAM,1),
                        new MoveLearnSetEntry(Move.REST,1),
                        new MoveLearnSetEntry(Move.RETURN,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pampurr");

    }


}
