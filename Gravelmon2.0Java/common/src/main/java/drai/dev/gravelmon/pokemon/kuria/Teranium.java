package drai.dev.gravelmon.pokemon.kuria;

public class Teranium extends drai.dev.gravelmon.pokemon.Pokemon {
    public Teranium() {
        super("Teranium",
                Type.WATER,Type.STEEL,
                new Stats(91,
                        119,
                        82,
                        88,
                        105,
                        70),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                55, 1421,
                new Stats(0,1,0,0,1,0), 45,
                0.875,
                221, ExperienceGroup.SLOW,
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
           setLangFileName("Teranium");

    }


}
