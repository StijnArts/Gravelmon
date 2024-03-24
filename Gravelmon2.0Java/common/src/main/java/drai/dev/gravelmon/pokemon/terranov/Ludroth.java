package drai.dev.gravelmon.pokemon.terranov;

public class Ludroth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ludroth() {
        super("Ludroth",
                Type.WATER,
                new Stats(30,
                        70,
                        40,
                        55,
                        80,
                        70),
                List.of(Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ludroth");

    }


}
