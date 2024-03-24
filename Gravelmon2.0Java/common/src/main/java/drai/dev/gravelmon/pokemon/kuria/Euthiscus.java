package drai.dev.gravelmon.pokemon.kuria;

public class Euthiscus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Euthiscus() {
        super("Euthiscus",
                Type.GRASS,
                new Stats(50,
                        45,
                        50,
                        30,
                        70,
                        50),
                List.of(Ability.PICKUP,Ability.LEAF_GUARD), Ability.KLUTZ,
                3, 24,
                new Stats(0,0,0,0,1,0), 255,
                0.0,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Euthiscus are very sensitive Pokémon, so they tend to avoid interacting with others. If they find a berry they really like, they'll cling to it like it is the only thing they care about."),
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
           setLangFileName("Euthiscus");

    }


}
