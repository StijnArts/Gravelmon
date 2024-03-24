package drai.dev.gravelmon.pokemon.fliga;

public class Sceptile extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sceptile() {
        super("Sceptile",
                Type.ROCK,
                new Stats(70,
                        105,
                        85,
                        85,
                        65,
                        120),
                List.of(Ability.SAND_FORCE), Ability.UNBURDEN,
                0, 0,
                new Stats(0,0,0,0,0,3), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("- Stone EdgeSTAB Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STONE_EDGE,1)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sceptile");

    }


}
