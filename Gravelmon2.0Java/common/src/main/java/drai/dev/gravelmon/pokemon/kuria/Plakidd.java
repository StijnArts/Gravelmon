package drai.dev.gravelmon.pokemon.kuria;

public class Plakidd extends drai.dev.gravelmon.pokemon.Pokemon {
    public Plakidd() {
        super("Plakidd",
                Type.WATER,Type.NORMAL,
                new Stats(82,
                        103,
                        80,
                        103,
                        80,
                        82),
                List.of(Ability.SWIFT_SWIM,Ability.HYDRATION), Ability.RAPIDSTREAM,
                9, 142,
                new Stats(0,1,0,1,0,0), 45,
                0.0,
                201, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
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
           setLangFileName("Plakidd");

    }


}
