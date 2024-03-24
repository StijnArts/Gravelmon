package drai.dev.gravelmon.pokemon.kuria;

public class Biroo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Biroo() {
        super("Biroo",
                Type.NORMAL,
                new Stats(60,
                        56,
                        50,
                        40,
                        50,
                        69),
                List.of(Ability.RUN_AWAY,Ability.WIMP_OUT), Ability.SHADOW_TAG,
                4, 34,
                new Stats(1,0,0,0,0,1), 200,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It runs away from its own shadow most of the day, fearing something that we don't know. Some believe that the shadow is alive."),
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
           setLangFileName("Biroo");

    }


}
