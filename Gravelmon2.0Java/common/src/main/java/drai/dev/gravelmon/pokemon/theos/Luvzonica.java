package drai.dev.gravelmon.pokemon.theos;

public class Luvzonica extends drai.dev.gravelmon.pokemon.Pokemon {
    public Luvzonica() {
        super("Luvzonica",
                Type.FLYING,Type.GROUND,
                new Stats(65,
                        95,
                        95,
                        70,
                        70,
                        75),
                List.of(Ability.BIG_PECKS,Ability.QUICK_FEET), Ability.GUTS,
                15, 210,
                new Stats(0,1,1,0,0,0), 0,
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
           setLangFileName("Luvzonica");

    }


}
