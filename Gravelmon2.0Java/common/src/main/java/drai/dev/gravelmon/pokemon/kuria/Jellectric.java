package drai.dev.gravelmon.pokemon.kuria;

public class Jellectric extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jellectric() {
        super("Jellectric",
                Type.ELECTRIC,Type.COSMIC,
                new Stats(90,
                        70,
                        60,
                        115,
                        115,
                        70),
                List.of(Ability.STATIC,Ability.STORM_DRAIN), Ability.LIQUIDCONDUCTION,
                20, 235,
                new Stats(0,0,0,2,1,0), 75,
                0.75,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Sometimes people mistake Jellectric for stars when stargazing. The electricty that it conducts within its body is strong enough to be felt throughout an entire star system."),
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
           setLangFileName("Jellectric");

    }


}
