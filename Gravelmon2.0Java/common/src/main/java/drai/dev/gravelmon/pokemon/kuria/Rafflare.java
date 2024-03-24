package drai.dev.gravelmon.pokemon.kuria;

public class Rafflare extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rafflare() {
        super("Rafflare",
                Type.FIRE,Type.POISON,
                new Stats(89,
                        85,
                        84,
                        116,
                        71,
                        85),
                List.of(Ability.SCORCHINGCOAT), Ability.SCORCHINGCOAT,
                45, 1761,
                new Stats(0,0,0,2,0,0), 45,
                0.125,
                208, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Rafflare");

    }


}
