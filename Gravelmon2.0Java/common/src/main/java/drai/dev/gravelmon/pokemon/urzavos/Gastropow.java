package drai.dev.gravelmon.pokemon.urzavos;

public class Gastropow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gastropow() {
        super("Gastropow",
                Type.ROCK,Type.FIGHTING,
                new Stats(80,
                        68,
                        102,
                        85,
                        75,
                        65),
                List.of(Ability.RECKLESS), Ability.RECKLESS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A Mon who carries the stones it could not pummel to pieces on its back. It is on a constant journey to train."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gastropow");

    }


}
