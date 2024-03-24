package drai.dev.gravelmon.pokemon.fliga;

public class Vicera extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vicera() {
        super("Vicera",
                Type.WATER,Type.DARK,
                new Stats(72,
                        84,
                        70,
                        58,
                        52,
                        69),
                List.of(Ability.TORRENT), Ability.GUTS,
                14, 499,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Vicera are still as jolly as their previous evolution, but often times will be overtaken by a need to bite things, rather than having it be by accident. They still feel bad afterwards, however."),
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
           setLangFileName("Vicera");

    }


}
