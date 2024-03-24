package drai.dev.gravelmon.pokemon.mystis;

public class Mirawing extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mirawing() {
        super("Mirawing",
                Type.PSYCHIC,Type.FLYING,
                new Stats(70,
                        60,
                        75,
                        130,
                        75,
                        100),
                List.of(Ability.SUPER_LUCK), Ability.SUPER_LUCK,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                230, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mirawing is the form Psyclaw takes when it fully realises its power for good. They shrink in size to grow wings, and use them to fly and bring light to everyone."),
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
           setLangFileName("Mirawing");

    }


}
