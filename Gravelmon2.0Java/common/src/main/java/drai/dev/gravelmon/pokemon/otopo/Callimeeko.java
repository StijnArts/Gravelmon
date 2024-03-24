package drai.dev.gravelmon.pokemon.otopo;

public class Callimeeko extends drai.dev.gravelmon.pokemon.Pokemon {
    public Callimeeko() {
        super("Callimeeko",
                Type.DARK,
                new Stats(60,
                        30,
                        55,
                        60,
                        75,
                        120),
                List.of(Ability.RUN_AWAY), Ability.EMERGENCY_EXIT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Callimeeko are extremely elusive and have only been seen a few times. It is an expert at blending into the shadows, with just its eyes revealing its whereabouts."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Callimeeko");

    }


}
