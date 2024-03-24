package drai.dev.gravelmon.pokemon.theos;

public class Chippunch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chippunch() {
        super("Chippunch",
                Type.FIGHTING,
                new Stats(80,
                        110,
                        80,
                        55,
                        75,
                        95),
                List.of(Ability.CHEEK_POUCH), Ability.IRON_FIST,
                16, 150,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Chippunch always store berries in their cheeks to give them an energy boost during battle. Their tail is incredibly strong often acting as a third fist."),
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
           setLangFileName("Chippunch");

    }


}
