package drai.dev.gravelmon.pokemon.nodorro;

public class Moistone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moistone() {
        super("Moistone",
                Type.ROCK,Type.WATER,
                new Stats(60,
                        65,
                        60,
                        80,
                        95,
                        70),
                List.of(Ability.STORM_DRAIN), Ability.DRIZZLE,
                13, 800,
                new Stats(0,0,0,1,1,0), 10,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
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
           setLangFileName("Moistone");

    }


}
