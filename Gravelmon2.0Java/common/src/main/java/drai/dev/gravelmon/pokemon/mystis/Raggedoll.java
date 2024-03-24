package drai.dev.gravelmon.pokemon.mystis;

public class Raggedoll extends drai.dev.gravelmon.pokemon.Pokemon {
    public Raggedoll() {
        super("Raggedoll",
                Type.NORMAL,
                new Stats(80,
                        50,
                        90,
                        50,
                        80,
                        30),
                List.of(Ability.SIMPLE,Ability.COTTON_DOWN), Ability.PERISH_BODY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                133, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When the tag on its head is pulled, stuffing comes flying out of its seams. This doesn't hurt the Pokemon, fortunately."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOLD_HANDS,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,9),
                        new MoveLearnSetEntry(Move.STOMP,10),
                        new MoveLearnSetEntry(Move.PLAY_NICE,14),
                        new MoveLearnSetEntry(Move.HEADBUTT,17),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,24),
                        new MoveLearnSetEntry(Move.ENCORE,28),
                        new MoveLearnSetEntry(Move.CURSE,30),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,32),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,34),
                        new MoveLearnSetEntry(Move.BODY_SLAM,38),
                        new MoveLearnSetEntry(Move.PERISH_SONG,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,45),
                        new MoveLearnSetEntry(Move.SLACK_OFF,49),
                        new MoveLearnSetEntry(Move.THRASH,53),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,55),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Raggedoll");

    }


}
