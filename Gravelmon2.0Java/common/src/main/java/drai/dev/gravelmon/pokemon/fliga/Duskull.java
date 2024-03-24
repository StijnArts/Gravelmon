package drai.dev.gravelmon.pokemon.fliga;

public class Duskull extends drai.dev.gravelmon.pokemon.Pokemon {
    public Duskull() {
        super("Duskull",
                Type.STEEL,Type.GHOST,
                new Stats(20,
                        40,
                        80,
                        55,
                        80,
                        20),
                List.of(Ability.DAMP,Ability.WATER_ABSORB), Ability.DRIZZLE,
                8, 332,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                59, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
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
           setLangFileName("Duskull");

    }


}
