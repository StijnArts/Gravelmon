package drai.dev.gravelmon.pokemon.mystis;

public class Conifear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conifear() {
        super("Conifear",
                Type.GRASS,Type.DARK,
                new Stats(90,
                        110,
                        90,
                        60,
                        50,
                        90),
                List.of(Ability.SNOW_CLOAK,Ability.TOUGH_CLAWS), Ability.PERMAFROST,
                109, 3629,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                172, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Evo CrunchSTAB Dark - Bramble Up Grass - Branch PokeSTAB Grass - FaceplantSTAB Grass - Forest's Curse Grass - Grass KnotSTAB Grass - Ingrain Grass - Leaf StormSTAB Grass - Leaf TurnSTAB Grass - Leaf TornadoSTAB Grass - LeafageSTAB Grass - Magical LeafSTAB Grass - Wood HammerSTAB Grass - Spiky Shield Grass - Razor LeafSTAB Grass - BiteSTAB Dark - Brutal SwingSTAB Dark - Darkest LariatSTAB Dark - Feint AttackSTAB Dark - Foul PlaySTAB Dark - Knock OffSTAB Dark - Lash OutSTAB Dark - Night SlashSTAB Dark - Parting Shot Dark - Sucker PunchSTAB Dark - Throat ChopSTAB Dark - Stomping Tantrum Ground - Avalanche Ice - Blizzard Ice - Frost Breath Ice - Ice Fang Ice - Ice Hammer Ice - Ice Punch Ice - Ice Blade Ice - Icy Charge Ice"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,1),
                        new MoveLearnSetEntry(Move.FACEPLANT,1),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,1),
                        new MoveLearnSetEntry(Move.ICYCHARGE,1),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.ICE_FANG,1),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,1),
                        new MoveLearnSetEntry(Move.LEAF_STORM,1),
                        new MoveLearnSetEntry(Move.FROST_BREATH,1),
                        new MoveLearnSetEntry(Move.ICEBLADE,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,1),
                        new MoveLearnSetEntry(Move.LEAFTURN,1),
                        new MoveLearnSetEntry(Move.LASH_OUT,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.DARKEST_LARIAT,1),
                        new MoveLearnSetEntry(Move.AVALANCHE,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,1),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.FOREST'SCURSE,1),
                        new MoveLearnSetEntry(Move.BLIZZARD,1),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conifear");

    }


}
