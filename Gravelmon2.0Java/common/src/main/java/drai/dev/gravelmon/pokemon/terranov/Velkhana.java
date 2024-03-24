package drai.dev.gravelmon.pokemon.terranov;

public class Velkhana extends drai.dev.gravelmon.pokemon.Pokemon {
    public Velkhana() {
        super("Velkhana",
                Type.ICE,Type.DRAGON,
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
                List.of("Few records of Velkhana exist, as such, they remain shrouded in mystery. Their icy breath is so cold that it can form massive spires and walls of ice out of nowhere. Some reports indicate that Velkhana will freeze their rivals in order to establish their domain."),
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
           setLangFileName("Velkhana");

    }


}
