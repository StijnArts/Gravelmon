package drai.dev.gravelmon.pokemon.ottora;

public class Bunbush extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bunbush() {
        super("Bunbush",
                Type.GRASS,
                new Stats(60,
                        55,
                        55,
                        80,
                        75,
                        85),
                List.of(Ability.OVERGROW), Ability.MISTY_SURGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Whilst Hopling are still playful, Bunbush gain a more regal sense of protection. It will not hesitate to get aggressive with people destroying the environment."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTTORA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bunbush");

    }


}
