package drai.dev.gravelmon.pokemon.terranov;

public class KushalaDaora extends drai.dev.gravelmon.pokemon.Pokemon {
    public KushalaDaora() {
        super("KushalaDaora",
                Type.FLYING,Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STEELY_SPIRIT), Ability.STEELY_SPIRIT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An Elder Dragon clad in metal plating. Enrobed in gale-strength winds, they whip up storms wherever they go. When enraged, they unleash devastating vortexes that send foes flying. Getting close to one is no mean feat."),
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
           setLangFileName("KushalaDaora");

    }


}
