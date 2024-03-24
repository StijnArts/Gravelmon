package drai.dev.gravelmon.pokemon.kuria;

public class Murmurino extends drai.dev.gravelmon.pokemon.Pokemon {
    public Murmurino() {
        super("Murmurino",
                Type.FIRE,Type.SOUND,
                new Stats(53,
                        66,
                        74,
                        83,
                        74,
                        30),
                List.of(Ability.ROARINGHORN), Ability.ROARINGHORN,
                11, 549,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                103, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of(""),
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
           setLangFileName("Murmurino");

    }


}
