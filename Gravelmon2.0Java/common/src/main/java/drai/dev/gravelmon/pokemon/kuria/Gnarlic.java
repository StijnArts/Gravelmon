package drai.dev.gravelmon.pokemon.kuria;

public class Gnarlic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gnarlic() {
        super("Gnarlic",
                Type.GRASS,Type.FIRE,
                new Stats(56,
                        61,
                        66,
                        91,
                        66,
                        75),
                List.of(Ability.LEVITATE), Ability.PRANKSTER,
                8, 42,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                151, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.GRASS),
                List.of("Often found roaming farms to aid farmers, Gnarlic scare away birds with bursts of flames. They like to hoard objects they finds in their nests."),
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
           setLangFileName("Gnarlic");

    }


}
