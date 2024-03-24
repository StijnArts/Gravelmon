package drai.dev.gravelmon.pokemon.ottora;

public class Floodle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Floodle() {
        super("Floodle",
                Type.WATER,Type.NORMAL,
                new Stats(56,
                        45,
                        29,
                        45,
                        65,
                        45),
                List.of(Ability.HEALER,Ability.SWIFT_SWIM), Ability.WATER_ABSORB,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Floodle");

    }


}
