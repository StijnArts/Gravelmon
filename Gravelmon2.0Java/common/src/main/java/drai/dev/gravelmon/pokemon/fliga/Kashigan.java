package drai.dev.gravelmon.pokemon.fliga;

public class Kashigan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kashigan() {
        super("Kashigan",
                Type.FIRE,Type.FAIRY,
                new Stats(75,
                        65,
                        65,
                        95,
                        80,
                        100),
                List.of(Ability.MAGIC_BOUNCE,Ability.FLASH_FIRE), Ability.SUPER_LUCK,
                18, 0,
                new Stats(0,0,0,0,0,2), 45,
                0.875,
                240, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Scratch Normal - Tail Whip Normal - Lick Ghost - Moonlight Fairy 5 EmberSTAB Fire 11 Disarming VoiceSTAB Fairy 14 Flame ChargeSTAB Fire 17 Draining KissSTAB Fairy 20 Fire SpinSTAB Fire 25 Lucky Chant Normal 27 Cosmic Power Psychic 35 FlamethrowerSTAB Fire 38 Will-O-Wisp Fire 41 MoonblastSTAB Fairy 43 Sunny Day Fire 46 Calm Mind Psychic 49 Psyshock Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.MOONLIGHT,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,14),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,17),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,20),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,25),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,27),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,35),
                        new MoveLearnSetEntry(Move.WILLOWISP,38),
                        new MoveLearnSetEntry(Move.MOONBLAST,41),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,43),
                        new MoveLearnSetEntry(Move.CALM_MIND,46),
                        new MoveLearnSetEntry(Move.PSYSHOCK,49),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kashigan");

    }


}
