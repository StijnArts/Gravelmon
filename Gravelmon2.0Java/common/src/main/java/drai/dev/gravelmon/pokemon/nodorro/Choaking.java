package drai.dev.gravelmon.pokemon.nodorro;

public class Choaking extends drai.dev.gravelmon.pokemon.Pokemon {
    public Choaking() {
        super("Choaking",
                Type.ROCK,Type.FIRE,
                new Stats(65,
                        120,
                        140,
                        85,
                        115,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 2100,
                new Stats(0,1,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Choaking");

    }


}
