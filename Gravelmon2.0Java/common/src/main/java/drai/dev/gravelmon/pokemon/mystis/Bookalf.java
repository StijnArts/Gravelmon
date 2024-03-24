package drai.dev.gravelmon.pokemon.mystis;

public class Bookalf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bookalf() {
        super("Bookalf",
                Type.FAIRY,
                new Stats(60,
                        50,
                        50,
                        50,
                        70,
                        40),
                List.of(Ability.CUTE_CHARM), Ability.OBLIVIOUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bookalf");

    }


}
