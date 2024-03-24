package drai.dev.gravelmon.pokemon.mastenia;

public class Magnozone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magnozone() {
        super("Magnozone",
                Type.FLYING,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CLOUD_NINE), Ability.WIND_RIDER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Magnozone cloaks itself among clouds and around ancient civilisations in the sky. Its memory is unlimited; yet, everything that it is documenting is chosen very carefully. Its magnet-like hands has green fingertips and can revive any harmed vegetation."),
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
           setLangFileName("Magnozone");

    }


}
