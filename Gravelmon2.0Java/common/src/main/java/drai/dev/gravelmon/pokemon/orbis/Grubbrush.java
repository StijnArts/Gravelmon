package drai.dev.gravelmon.pokemon.orbis;

public class Grubbrush extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grubbrush() {
        super("Grubbrush",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 20,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- Doodle Normal 10 Struggle BugSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOODLE,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grubbrush");

    }


}
