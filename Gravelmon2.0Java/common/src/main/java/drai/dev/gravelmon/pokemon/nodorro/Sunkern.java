package drai.dev.gravelmon.pokemon.nodorro;

public class Sunkern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sunkern() {
        super("Sunkern",
                Type.GRASS,
                new Stats(30,
                        30,
                        30,
                        30,
                        30,
                        30),
                List.of(Ability.CHLOROPHYLL,Ability.SOLAR_POWER), Ability.EARLY_BIRD,
                3, 18,
                new Stats(0,0,0,1,0,0), 235,
                0.5,
                36, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sunkern");

    }


}
