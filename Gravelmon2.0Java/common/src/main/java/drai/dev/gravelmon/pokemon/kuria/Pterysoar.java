package drai.dev.gravelmon.pokemon.kuria;

public class Pterysoar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pterysoar() {
        super("Pterysoar",
                Type.ROCK,Type.FLYING,
                new Stats(80,
                        95,
                        55,
                        70,
                        55,
                        85),
                List.of(Ability.STRONG_JAW,Ability.SAND_FORCE), Ability.UNBURDEN,
                10, 226,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                144, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FLYING),
                List.of(""),
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
           setLangFileName("Pterysoar");

    }


}
