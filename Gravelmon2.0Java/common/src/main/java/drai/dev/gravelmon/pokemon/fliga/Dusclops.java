package drai.dev.gravelmon.pokemon.fliga;

public class Dusclops extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dusclops() {
        super("Dusclops",
                Type.STEEL,Type.GHOST,
                new Stats(40,
                        50,
                        120,
                        100,
                        120,
                        25),
                List.of(Ability.PRESSURE,Ability.WATER_ABSORB), Ability.DRIZZLE,
                16, 582,
                new Stats(0,0,1,0,1,0), 90,
                0.5,
                159, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("WIP"),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dusclops");

    }


}
