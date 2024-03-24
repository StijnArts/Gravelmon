package drai.dev.gravelmon.pokemon.mushi;

public class Divernaut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Divernaut() {
        super("Divernaut",
                Type.WATER,
                new Stats(90,
                        75,
                        85,
                        53,
                        70,
                        38),
                List.of(Ability.TORRENT), Ability.HYDRATION,
                0, 0,
                new Stats(2,0,0,0,0,0), 0,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Divernaut");

    }


}
