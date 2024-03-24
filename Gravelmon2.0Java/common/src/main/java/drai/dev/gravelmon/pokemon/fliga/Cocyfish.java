package drai.dev.gravelmon.pokemon.fliga;

public class Cocyfish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cocyfish() {
        super("Cocyfish",
                Type.DARK,Type.DRAGON,
                new Stats(108,
                        63,
                        93,
                        76,
                        92,
                        53),
                List.of(Ability.SOULABSORB,Ability.SIMPLE), Ability.GLUTTONY,
                20, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Cocyfish will loom over buildings and houses, waiting to consume the souls of the soon-to-be deceased. It's stomach glows with it's victims. To see a flock of them above any area is seen as a bad omen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,5),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.SCREECH,13),
                        new MoveLearnSetEntry(Move.SCARY_FACE,17),
                        new MoveLearnSetEntry(Move.CURSE,21),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,25),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,28),
                        new MoveLearnSetEntry(Move.JAW_LOCK,32),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,36),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,40),
                        new MoveLearnSetEntry(Move.DARK_PULSE,42),
                        new MoveLearnSetEntry(Move.ROAR,45),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,50),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,54),
                        new MoveLearnSetEntry(Move.SOULCHOMP,59),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,65)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cocyfish");

    }


}
