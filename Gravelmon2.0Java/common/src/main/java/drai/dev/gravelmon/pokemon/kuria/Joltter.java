package drai.dev.gravelmon.pokemon.kuria;

public class Joltter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Joltter() {
        super("Joltter",
                Type.ELECTRIC,
                new Stats(60,
                        68,
                        48,
                        45,
                        61,
                        60),
                List.of(Ability.MOTOR_DRIVE,Ability.STATICTOUCH), Ability.GALVANIZE,
                4, 136,
                new Stats(0,0,0,1,0,0), 100,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Joltter stay close to their family throughout most of their young life. If one gets seperated from its pack, it will bury itself in the dirt until someone comes to save it."),
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
           setLangFileName("Joltter");

    }


}
