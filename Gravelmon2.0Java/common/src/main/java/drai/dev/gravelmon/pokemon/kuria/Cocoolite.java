package drai.dev.gravelmon.pokemon.kuria;

public class Cocoolite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cocoolite() {
        super("Cocoolite",
                Type.BUG,Type.COSMIC,
                new Stats(55,
                        40,
                        90,
                        30,
                        60,
                        25),
                List.of(Ability.COMPOUND_EYES,Ability.UNSTABLE), Ability.SIGNALBOOST,
                8, 257,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                99, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Cocoolite are tiny data centers that intercept signals from all around them. They then forward these signals into the atmosphere, but no one knows where they're sending them."),
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
           setLangFileName("Cocoolite");

    }


}
