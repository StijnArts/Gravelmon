package drai.dev.gravelmon.pokemon.mystis;

public class Ampupoda extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ampupoda() {
        super("Ampupoda",
                Type.WATER,Type.GHOST,
                new Stats(70,
                        125,
                        55,
                        75,
                        55,
                        60),
                List.of(Ability.CLEAR_BODY,Ability.HYPER_CUTTER), Ability.COMPOUND_EYES,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.BUG),
                List.of("- CrabhammerSTAB Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRABHAMMER,1),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ampupoda");

    }


}
