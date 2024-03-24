package drai.dev.gravelmon.pokemon.fliga;

public class Mitecron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mitecron() {
        super("Mitecron",
                Type.BUG,Type.ELECTRIC,
                new Stats(42,
                        21,
                        57,
                        63,
                        71,
                        18),
                List.of(Ability.GALVANIZE,Ability.STATIC), Ability.FUR_COAT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
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
           setLangFileName("Mitecron");

    }


}
