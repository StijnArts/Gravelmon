package drai.dev.gravelmon.pokemon.cyare;

public class Orukul extends drai.dev.gravelmon.pokemon.Pokemon {
    public Orukul() {
        super("Orukul",
                Type.ROCK,Type.PSYCHIC,
                new Stats(32,
                        55,
                        113,
                        123,
                        95,
                        67),
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Orukul are peaceful Pokemon, composed completely of sentient ore. Because they don't age, they've been around longer than every Pokemon As such, are incredibly intelligent and have boundless wisdom of the past."),
                List.of(),
                List.of(                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Orukul");

    }


}
