package drai.dev.gravelmon.pokemon.kuria;

public class Ferociraptor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ferociraptor() {
        super("Ferociraptor",
                Type.ROCK,Type.DRAGON,
                new Stats(65,
                        135,
                        45,
                        75,
                        45,
                        115),
                List.of(Ability.STRONG_JAW,Ability.SAND_RUSH), Ability.SHEER_FORCE,
                19, 326,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
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
           setLangFileName("Ferociraptor");

    }


}
