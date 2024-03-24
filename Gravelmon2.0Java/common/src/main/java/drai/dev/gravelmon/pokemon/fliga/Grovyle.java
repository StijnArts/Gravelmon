package drai.dev.gravelmon.pokemon.fliga;

public class Grovyle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grovyle() {
        super("Grovyle",
                Type.ROCK,
                new Stats(50,
                        85,
                        65,
                        65,
                        45,
                        95),
                List.of(Ability.SAND_FORCE), Ability.UNBURDEN,
                0, 0,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                107, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of(""),
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
           setLangFileName("Grovyle");

    }


}
