package drai.dev.gravelmon.pokemon.kuria;

public class Oceadon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Oceadon() {
        super("Oceadon",
                Type.WATER,Type.GHOST,
                new Stats(109,
                        117,
                        93,
                        66,
                        104,
                        41),
                List.of(Ability.WINDUP), Ability.WINDUP,
                25, 2909,
                new Stats(2,0,0,0,1,0), 45,
                0.875,
                208, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Oceadon");

    }


}
