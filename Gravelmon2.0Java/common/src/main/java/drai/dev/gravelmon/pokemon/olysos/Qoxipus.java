package drai.dev.gravelmon.pokemon.olysos;

public class Qoxipus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Qoxipus() {
        super("Qoxipus",
                Type.WATER,Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.GLUTTONY,Ability.OBLIVIOUS), Ability.DRIZZLE,
                5, 336,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("The outer layer of its skin is covered with a poisonous liquid coming from devouring the toxic silt of the waters. It wouldn't be wise to touch."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Qoxipus");

    }


}
