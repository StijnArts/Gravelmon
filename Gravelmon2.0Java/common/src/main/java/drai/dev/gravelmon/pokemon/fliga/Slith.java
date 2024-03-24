package drai.dev.gravelmon.pokemon.fliga;

public class Slith extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slith() {
        super("Slith",
                Type.DRAGON,
                new Stats(37,
                        53,
                        35,
                        54,
                        36,
                        85),
                List.of(Ability.POISON_TOUCH), Ability.REGENERATOR,
                5, 0,
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
           setLangFileName("Slith");

    }


}