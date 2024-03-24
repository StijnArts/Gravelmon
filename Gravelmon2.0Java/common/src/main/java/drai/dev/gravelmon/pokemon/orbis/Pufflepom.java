package drai.dev.gravelmon.pokemon.orbis;

public class Pufflepom extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pufflepom() {
        super("Pufflepom",
                Type.FIGHTING,Type.FAIRY,
                new Stats(75,
                        115,
                        60,
                        55,
                        80,
                        110),
                List.of(Ability.COSTAR,Ability.COMPETITIVE), Ability.DANCER,
                14, 0,
                new Stats(0,2,0,0,0,0), 55,
                0.25,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Cheerleaders will use Pufflepom in dance routines due to their eye for co-ordination and moves. Pufflepoms on different teams are incredibly competitive to one another."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACROBATICS,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,9),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.ME_FIRST,17),
                        new MoveLearnSetEntry(Move.MEGA_KICK,23),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,27),
                        new MoveLearnSetEntry(Move.BOUNCE,30),
                        new MoveLearnSetEntry(Move.JUMP_KICK,31),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,34),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,41),
                        new MoveLearnSetEntry(Move.AXE_KICK,47),
                        new MoveLearnSetEntry(Move.VICTORY_DANCE,52),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.TROP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pufflepom");

    }


}
