package drai.dev.gravelmon.pokemon.orbis;

public class Shadovizor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shadovizor() {
        super("Shadovizor",
                Type.DARK,
                new Stats(55,
                        95,
                        30,
                        95,
                        50,
                        140),
                List.of(Ability.SHADOW_TAG), Ability.SHADOW_TAG,
                19, 10,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                178, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Born to life from malevolent shadows, Shadovizor can only move freely in the dark. During the day, it travels along walls and floors, disguising itself as a persons shadow."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BEAT_UP,1),
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.SNATCH,1),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shadovizor");

    }


}
