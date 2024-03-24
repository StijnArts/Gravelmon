package drai.dev.gravelmon.pokemon.kuria;

public class Edglet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Edglet() {
        super("Edglet",
                Type.DARK,Type.FLYING,
                new Stats(48,
                        67,
                        50,
                        30,
                        36,
                        55),
                List.of(Ability.RIVALRY,Ability.KEEN_EYE), Ability.STEELWORKER,
                4, 54,
                new Stats(0,2,0,0,0,0), 250,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Edglet are fierce and territorial. When born, they begin to grow a sharp horn-like appendage on their head that is sharp enough to slice an Onix in half."),
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
           setLangFileName("Edglet");

    }


}
