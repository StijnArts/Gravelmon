package drai.dev.gravelmon.pokemon.fliga;

public class Lancarot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lancarot() {
        super("Lancarot",
                Type.POISON,Type.FIGHTING,
                new Stats(100,
                        130,
                        80,
                        120,
                        80,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,2,0,1,0,0), 35,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lancarot");

    }


}
