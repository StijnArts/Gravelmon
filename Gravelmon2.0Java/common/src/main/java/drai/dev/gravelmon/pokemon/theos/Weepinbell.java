package drai.dev.gravelmon.pokemon.theos;

public class Weepinbell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Weepinbell() {
        super("Weepinbell",
                Type.GRASS,Type.DARK,
                new Stats(70,
                        95,
                        60,
                        70,
                        45,
                        50),
                List.of(Ability.INTIMIDATE), Ability.GLUTTONY,
                10, 64,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Weepinbell");

    }


}
