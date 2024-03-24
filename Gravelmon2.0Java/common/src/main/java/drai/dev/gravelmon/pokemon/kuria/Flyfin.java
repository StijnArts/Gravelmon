package drai.dev.gravelmon.pokemon.kuria;

public class Flyfin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flyfin() {
        super("Flyfin",
                Type.WATER,Type.STEEL,
                new Stats(53,
                        82,
                        52,
                        68,
                        60,
                        65),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                13, 391,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                103, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FLYING),
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
           setLangFileName("Flyfin");

    }


}
