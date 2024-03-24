package drai.dev.gravelmon.pokemon.mongratis;

public class Snowly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snowly() {
        super("Snowly",
                Type.ICE,Type.FLYING,
                new Stats(85,
                        60,
                        100,
                        60,
                        90,
                        75),
                List.of(Ability.SNOW_CLOAK,Ability.OVERCOAT), Ability.CLOUD_NINE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its wings are better suited to protection than flying. In bad weather, it shelters under its wings to stay warm. Its talons grip hard to rocks to keep from being blown away during harsh storms."),
                List.of(),
                List.of(                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snowly");

    }


}
