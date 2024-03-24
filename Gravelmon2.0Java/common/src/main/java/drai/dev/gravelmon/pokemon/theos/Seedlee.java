package drai.dev.gravelmon.pokemon.theos;

public class Seedlee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Seedlee() {
        super("Seedlee",
                Type.GRASS,
                new Stats(70,
                        30,
                        70,
                        50,
                        70,
                        20),
                List.of(Ability.RATTLED), Ability.EFFECT_SPORE,
                3, 18,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Seedlee are easily scared, and will often disguise themselves as plant sprouts when sensing anyone nearby. They can release a potent scent from their petals if predators get too close."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Seedlee");

    }


}
