package drai.dev.gravelmon.pokemon.otopo;

public class Narcicle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Narcicle() {
        super("Narcicle",
                Type.WATER,Type.ICE,
                new Stats(80,
                        90,
                        70,
                        70,
                        70,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("It has the ability to swim at amazing speeds across water. Its long horn, which develops continually during its life, may puncture opponents."),
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
           setLangFileName("Narcicle");

    }


}
