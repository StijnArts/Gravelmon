package drai.dev.gravelmon.pokemon.fliga;

public class Astrowl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Astrowl() {
        super("Astrowl",
                Type.PSYCHIC,Type.FLYING,
                new Stats(74,
                        53,
                        55,
                        110,
                        107,
                        53),
                List.of(Ability.ANALYTIC,Ability.FRISK), Ability.MAGIC_GUARD,
                11, 0,
                new Stats(0,0,0,0,2,0), 45,
                0.5,
                155, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Astrowl have always been used for delivering messages, because they never forget the directions to places they have visited before. It's said they use the stars to guide themselves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.CHIRP,3),
                        new MoveLearnSetEntry(Move.GUST,6),
                        new MoveLearnSetEntry(Move.PIXIEDUST,10),
                        new MoveLearnSetEntry(Move.UPROAR,14),
                        new MoveLearnSetEntry(Move.PLUCK,17),
                        new MoveLearnSetEntry(Move.CONFUSION,22),
                        new MoveLearnSetEntry(Move.AIR_SLASH,25),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,30),
                        new MoveLearnSetEntry(Move.ROOST,35),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,39),
                        new MoveLearnSetEntry(Move.MIND_READER,44),
                        new MoveLearnSetEntry(Move.MOONLIGHT,51),
                        new MoveLearnSetEntry(Move.PSYCHIC,56),
                        new MoveLearnSetEntry(Move.MOONBLAST,62),
                        new MoveLearnSetEntry(Move.DURESS,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Astrowl");

    }


}
