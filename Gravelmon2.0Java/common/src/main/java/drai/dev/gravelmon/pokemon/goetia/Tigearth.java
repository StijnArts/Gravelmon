package drai.dev.gravelmon.pokemon.goetia;

public class Tigearth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tigearth() {
        super("Tigearth",
                Type.BUG,Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is said that a Terraintula who lives for 700 years becomes a Tigearth. Aggressive and crafty, folklore tells of a warrior who stopped Tigearth from preying on villages several times in his travels. The silk it lines its den with is harder than steel."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tigearth");

    }


}
