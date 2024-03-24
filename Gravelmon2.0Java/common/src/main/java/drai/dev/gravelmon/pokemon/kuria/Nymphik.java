package drai.dev.gravelmon.pokemon.kuria;

public class Nymphik extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nymphik() {
        super("Nymphik",
                Type.BUG,
                new Stats(40,
                        60,
                        35,
                        30,
                        34,
                        72),
                List.of(Ability.COMPOUND_EYES,Ability.QUICK_FEET), Ability.VITAL_SPIRIT,
                3, 40,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Nymphick will stay awake day and night fighting its targets, even if it is outmatched. While they aren't exactly the strongest, nobody can say that they aren't trying."),
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
           setLangFileName("Nymphik");

    }


}
