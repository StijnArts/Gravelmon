package drai.dev.gravelmon.pokemon.theos;

public class Miltank extends drai.dev.gravelmon.pokemon.Pokemon {
    public Miltank() {
        super("Miltank",
                Type.FAIRY,Type.NORMAL,
                new Stats(105,
                        80,
                        100,
                        40,
                        70,
                        95),
                List.of(Ability.HEALER), Ability.SERENE_GRACE,
                12, 755,
                new Stats(2,0,0,0,0,0), 0,
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
           setLangFileName("Miltank");

    }


}
