package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochProbopass extends drai.dev.data.pokemon.Pokemon {
    public EpochProbopass(String name, Aspect aspect) {
        super(name, aspect, "EpochProbopass",
                Type.GRASS,Type.PSYCHIC,
                new Stats(60,
                        105,
                        95,
                        60,
                        115,
                        90),
                List.of(Ability.NATURAL_CURE,Ability.PICKPOCKET), Ability.CHLOROPHYLL,
                14, 3400,
                new Stats(0,1,0,0,0,0), 100,
                0.5,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is seen as a spiritual elder within its local tribe because its psychic potential allows it to command the respect and obedience of its compatriots."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,34),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,20),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,11),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,51),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,30),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,47),
                        new MoveLearnSetEntry(Move.BULLET_SEED,14),
                        new MoveLearnSetEntry(Move.BATTLE_CRY,23),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,55),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,8),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,39),
                        new MoveLearnSetEntry(Move.GROWTH,4),
                        new MoveLearnSetEntry(Move.SYNTHESIS,27),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,58),
                        new MoveLearnSetEntry(Move.PSYBEAM,17),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,43),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.ANCIENTGLARE,"tm"),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BLOODRITUAL,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.CHIDORI,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GOBLINSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MINDDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MIXEDWAVES,"tm"),
                        new MoveLearnSetEntry(Move.MOSSYPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NATURESWRATH,"tm"),
                        new MoveLearnSetEntry(Move.NECTARTAP,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE, Biome.IS_TROPICAL_ISLAND)
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
           setLangFileName("Probopass");

    }


}
