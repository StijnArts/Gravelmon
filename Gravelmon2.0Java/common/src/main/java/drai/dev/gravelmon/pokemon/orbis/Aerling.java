package drai.dev.gravelmon.pokemon.orbis;

public class Aerling extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aerling() {
        super("Aerling",
                Type.FLYING,Type.DRAGON,
                new Stats(45,
                        30,
                        40,
                        75,
                        50,
                        60),
                List.of(Ability.AIR_LOCK), Ability.WIND_RIDER,
                5, 10,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aerling");

    }


}
