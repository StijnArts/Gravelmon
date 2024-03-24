package drai.dev.gravelmon.pokemon.mastenia;

public class Wreckidna extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wreckidna() {
        super("Wreckidna",
                Type.GRASS,Type.ELECTRIC,
                new Stats(72,
                        126,
                        98,
                        78,
                        74,
                        84),
                List.of(Ability.OVERGROW), Ability.RECKLESS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their leaf-like quills are sharp and electrifying. There is no doubt that any Wreckidna will wreck anything in its path. While fueled by anger, they sometimes charge their opponents to protect their young. After their destruction, it is said to leave new soil where plants can grow."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROTOTILLER,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wreckidna");

    }


}
