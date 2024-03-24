package drai.dev.gravelmon.pokemon.fliga;

public class Bowvine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bowvine() {
        super("Bowvine",
                Type.GRASS,Type.NORMAL,
                new Stats(110,
                        125,
                        85,
                        45,
                        55,
                        80),
                List.of(Ability.RECKLESS,Ability.NATURAL_CURE), Ability.CUD_CHEW,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- TackleSTAB Normal - LeafageSTAB Grass - Growl Normal 5 Sand Attack Ground 9 Bullet SeedSTAB Grass 12 BideSTAB Normal 16 HeadbuttSTAB Normal 20 Leech Seed Grass 24 Growth Normal 29 High Horsepower Ground 35 Fruit Munch Grass 39 Head ChargeSTAB Normal 44 Spiky Shield Grass 47 Zen Headbutt Psychic 52 Wood HammerSTAB Grass 56 Nature's Call Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.BULLET_SEED,9),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.HEADBUTT,16),
                        new MoveLearnSetEntry(Move.LEECH_SEED,20),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,29),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,35),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,39),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,44),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,47),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,52),
                        new MoveLearnSetEntry(Move.NATURE'SCALL,56)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bowvine");

    }


}