package drai.dev.gravelmon.pokemon.terranov;

public class Ceadeus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ceadeus() {
        super("Ceadeus",
                Type.WATER,Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legendary elder dragons known as both 'shining giants of the depths' and 'great sea dragons.' Not confirmed to exist until recently. The Moga quakes were due to a Ceadeus butting its abnormally long horns into the earth."),
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
           setLangFileName("Ceadeus");

    }


}
