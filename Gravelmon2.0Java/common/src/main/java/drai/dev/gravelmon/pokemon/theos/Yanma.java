package drai.dev.gravelmon.pokemon.theos;

public class Yanma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Yanma() {
        super("Yanma",
                Type.BUG,Type.DRAGON,
                new Stats(65,
                        75,
                        45,
                        65,
                        45,
                        95),
                List.of(Ability.PRESSURE,Ability.TINTED_LENS), Ability.ADAPTABILITY,
                12, 380,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Yanma are quiet rare to find in the wild. It's said only experienced trainers can handle them."),
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
           setLangFileName("Yanma");

    }


}
