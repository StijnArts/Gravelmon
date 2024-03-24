package drai.dev.gravelmon.pokemon.theos;

public class Hoonoes extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoonoes() {
        super("Hoonoes",
                Type.GHOST,
                new Stats(60,
                        30,
                        45,
                        65,
                        60,
                        50),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.LEVITATE,
                10, 5,
                new Stats(0,0,0,1,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hoonoes like to hide in the shadows making loud noises to scare people passing by. It's said they can fortell when someone will die."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoonoes");

    }


}
