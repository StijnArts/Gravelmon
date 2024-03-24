package drai.dev.gravelmon.pokemon.mastenia;

public class Tidaltar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tidaltar() {
        super("Tidaltar",
                Type.WATER,Type.DRAGON,
                new Stats(106,
                        110,
                        90,
                        124,
                        90,
                        80),
                List.of(Ability.DRIZZLE), Ability.UNNERVE,
                23, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tidaltar");

    }


}