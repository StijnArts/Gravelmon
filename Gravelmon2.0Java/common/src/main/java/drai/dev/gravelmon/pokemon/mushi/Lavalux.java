package drai.dev.gravelmon.pokemon.mushi;

public class Lavalux extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lavalux() {
        super("Lavalux",
                Type.BUG,Type.PSYCHIC,
                new Stats(39,
                        33,
                        32,
                        75,
                        64,
                        37),
                List.of(Ability.TINTED_LENS,Ability.OBLIVIOUS), Ability.PSYCHIC_SURGE,
                0, 0,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                36, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lavalux");

    }


}
