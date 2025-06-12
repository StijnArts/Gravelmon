package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochBeheeyem extends drai.dev.data.pokemon.Pokemon {
    public EpochBeheeyem(String name, Aspect aspect) {
        super(name, aspect, "EpochBeheeyem",
                Type.COSMIC,Type.DARK,
                new Stats(115,
                        70,
                        95,
                        40,
                        50,
                        115),
                List.of(Ability.GENIUS,Ability.IMMUNITY), Ability.FULL_METAL_BODY,
                10, 345,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("The eye on its head is supposed to act as a one-way camera that allows its masters from another planet to surveil and study the Orion Region."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SIPHON,6),
                        new MoveLearnSetEntry(Move.MIND_READER,50),
                        new MoveLearnSetEntry(Move.DARKWHISPERS,1),
                        new MoveLearnSetEntry(Move.SCHIZOPHRENIA,26),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,46),
                        new MoveLearnSetEntry(Move.RADIOWAVES,10),
                        new MoveLearnSetEntry(Move.SOLARECLIPSE,34),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,46),
                        new MoveLearnSetEntry(Move.BIG_BANG,54),
                        new MoveLearnSetEntry(Move.RADIATION,1),
                        new MoveLearnSetEntry(Move.DARK_VOID,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,38),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.SATELLITERAY,30),
                        new MoveLearnSetEntry(Move.BLACK_HOLE,42),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,46),
                        new MoveLearnSetEntry(Move.VOIDDRIFT,4),
                        new MoveLearnSetEntry(Move.PSYBEAM,14),
                        new MoveLearnSetEntry(Move.PHOBIA,22),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,50),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,18),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BLOODRITUAL,"tm"),
                        new MoveLearnSetEntry(Move.BOMBARDMENT,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CLUSTERROCKETS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.COSMICAVATAR,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GOLDENBULLET,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.MAGNETICCANNON,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.METEORDRIVE,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MISSILESHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIXEDWAVES,"tm"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.OVERCLOCK,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLARECLIPSE,"tm"),
                        new MoveLearnSetEntry(Move.STARDUSTREVERIE,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(43)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Beheeyem");

    }


}
