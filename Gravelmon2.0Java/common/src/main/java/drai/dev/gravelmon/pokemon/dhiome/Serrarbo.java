package drai.dev.gravelmon.pokemon.dhiome;

public class Serrarbo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Serrarbo() {
        super("Serrarbo",
                Type.ROCK,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CHLOROPHYLL), Ability.SOLAR_POWER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Older Serrarbo have sharper leaves and harder bark. They could survive intense forest fires."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Serrarbo");

    }


}
