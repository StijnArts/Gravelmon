package drai.dev.gravelmon.pokemon.kuria;

public class Psyzul extends drai.dev.gravelmon.pokemon.Pokemon {
    public Psyzul() {
        super("Psyzul",
                Type.FLYING,Type.PSYCHIC,
                new Stats(65,
                        55,
                        50,
                        88,
                        68,
                        60),
                List.of(Ability.KEEN_EYE,Ability.EARLY_BIRD), Ability.ALLSEEING,
                6, 146,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                122, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Psyzul are seen as the young geniuses of the sky. They outsmart predators so easily that some starve in the process of trying to catch it."),
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
           setLangFileName("Psyzul");

    }


}
