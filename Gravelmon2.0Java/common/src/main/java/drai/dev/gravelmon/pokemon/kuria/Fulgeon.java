package drai.dev.gravelmon.pokemon.kuria;

public class Fulgeon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fulgeon() {
        super("Fulgeon",
                Type.LIGHT,
                new Stats(95,
                        110,
                        130,
                        65,
                        65,
                        60),
                List.of(Ability.VINDICTIVE,Ability.BULLY), Ability.LIGHTGUARD,
                7, 39,
                new Stats(0,0,2,0,0,0), 45,
                0.125,
                185, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Although small, Fulgeon can be very nasty to strangers. Often times they are extremely stuck up and see themselves above the world. They absorb light through their body gems."),
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
           setLangFileName("Fulgeon");

    }


}
