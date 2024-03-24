package drai.dev.gravelmon.pokemon.mushi;

public class Formillant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Formillant() {
        super("Formillant",
                Type.FIRE,Type.BUG,
                new Stats(74,
                        85,
                        85,
                        125,
                        60,
                        101),
                List.of(Ability.BLAZE), Ability.COMPOUND_EYES,
                0, 0,
                new Stats(0,0,0,3,0,0), 0,
                0.875,
                265, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Formillant");

    }


}
