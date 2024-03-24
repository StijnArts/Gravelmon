package drai.dev.gravelmon.pokemon.mastenia;

public class Curseed extends drai.dev.gravelmon.pokemon.Pokemon {
    public Curseed() {
        super("Curseed",
                Type.GHOST,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE), Ability.CURSED_BODY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Curseed holds onto Tauntrunks dry leaves for dear life, hoping to return to life again. Whenever it lands in a water source it may grow once more. It can no longer weep due to its insides being all dried up."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.FOREST'SCURSE,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Curseed");

    }


}
