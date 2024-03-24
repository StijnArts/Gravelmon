package drai.dev.gravelmon.pokemon.kuria;

public class Drajinn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drajinn() {
        super("Drajinn",
                Type.DRAGON,
                new Stats(70,
                        100,
                        110,
                        90,
                        110,
                        40),
                List.of(Ability.STURDY), Ability.SOLID_ROCK,
                12, 474,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Drajinn have outgrown their home, but are now stuck and unable to fully emerge. Despite this, they will still live their lives as if there's nothing wrong."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drajinn");

    }


}
