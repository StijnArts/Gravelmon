package drai.dev.gravelmon.pokemon.mystis;

public class Cragrub extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cragrub() {
        super("Cragrub",
                Type.BUG,Type.ROCK,
                new Stats(50,
                        30,
                        80,
                        10,
                        20,
                        10),
                List.of(Ability.ROCK_HEAD), Ability.SWARM,
                5, 113,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                40, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cragrub");

    }


}
