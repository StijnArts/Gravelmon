package drai.dev.gravelmon.pokemon.nodorro;

public class Afripup extends drai.dev.gravelmon.pokemon.Pokemon {
    public Afripup() {
        super("Afripup",
                Type.DARK,Type.GROUND,
                new Stats(50,
                        79,
                        45,
                        40,
                        40,
                        51),
                List.of(Ability.INTIMIDATE), Ability.ANGER_POINT,
                4, 25,
                new Stats(0,1,0,0,0,0), 170,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The red dust on their paws is caused by the orange-red iron oxide that's in abundance in their habitat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.SAND_TOMB,11),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,15),
                        new MoveLearnSetEntry(Move.CRUNCH,23)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Afripup");

    }


}
