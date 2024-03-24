package drai.dev.gravelmon.pokemon.otopo;

public class Tasmaniac extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tasmaniac() {
        super("Tasmaniac",
                Type.FIRE,Type.DARK,
                new Stats(70,
                        80,
                        70,
                        50,
                        60,
                        75),
                List.of(Ability.FLAME_BODY,Ability.VITAL_SPIRIT), Ability.ANGER_POINT,
                10, 739,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its fierce and territorial nature makes it a formidable opponent, but a loyal companion to those it considers part of its pack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,3),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,9),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.FIRE_FANG,15),
                        new MoveLearnSetEntry(Move.TAUNT,18),
                        new MoveLearnSetEntry(Move.ROAR,21),
                        new MoveLearnSetEntry(Move.FLAME_BURST,24),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,27),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,30),
                        new MoveLearnSetEntry(Move.INFERNO,33),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,36),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,39),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,42),
                        new MoveLearnSetEntry(Move.CRUNCH,45),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,48),
                        new MoveLearnSetEntry(Move.DARK_VOID,51),
                        new MoveLearnSetEntry(Move.OUTRAGE,57)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tasmaniac");

    }


}
