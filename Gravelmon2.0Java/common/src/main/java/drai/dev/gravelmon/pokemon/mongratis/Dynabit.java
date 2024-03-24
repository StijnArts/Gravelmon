package drai.dev.gravelmon.pokemon.mongratis;

public class Dynabit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dynabit() {
        super("Dynabit",
                Type.ELECTRIC,
                new Stats(85,
                        51,
                        34,
                        68,
                        85,
                        117),
                List.of(Ability.OWN_TEMPO,Ability.QUICK_FEET), Ability.MOTOR_DRIVE,
                6, 95,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Both its legs can spin independently from its body. It loves running up hills and rolling down them."),
                List.of(),
                List.of(                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dynabit");

    }


}
