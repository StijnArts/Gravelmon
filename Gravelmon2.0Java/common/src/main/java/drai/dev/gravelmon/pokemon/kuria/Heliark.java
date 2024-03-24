package drai.dev.gravelmon.pokemon.kuria;

public class Heliark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Heliark() {
        super("Heliark",
                Type.WATER,Type.GHOST,
                new Stats(39,
                        82,
                        63,
                        51,
                        94,
                        61),
                List.of(Ability.WINDUP), Ability.WINDUP,
                6, 28,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                86, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_2),
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
           setLangFileName("Heliark");

    }


}
