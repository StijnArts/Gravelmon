package drai.dev.gravelmon.pokemon.goetia;

public class Gargorgon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gargorgon() {
        super("Gargorgon",
                Type.DRAGON,Type.GHOST,
                new Stats(100,
                        65,
                        85,
                        105,
                        85,
                        130),
                List.of(Ability.PETRIFY), Ability.RELENTLESS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An ancient hero sealed it inside a labyrinth to stop its reign of terror. Each of its heads acts independently to annihilate anything it sees."),
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
           setLangFileName("Gargorgon");

    }


}
