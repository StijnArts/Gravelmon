package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochOranguru extends drai.dev.data.pokemon.Pokemon {
    public EpochOranguru(String name, Aspect aspect) {
        super(name, aspect, "EpochOranguru",
                Type.COSMIC,Type.LIGHT,
                new Stats(90,
                        60,
                        80,
                        60,
                        110,
                        90),
                List.of(Ability.PRECISION,Ability.ANALYTIC), Ability.DAZZLING,
                15, 760,
                new Stats(0,0,0,0,2,0), 45,
                0.5,
                172, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is able to detect celestial bodies even in daylight or when obfuscated through light pollution with its powerful telescope."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METEORSHOWER,13),
                        new MoveLearnSetEntry(Move.DEFOG,16),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,10),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,31),
                        new MoveLearnSetEntry(Move.BLINDINGFLASH,46),
                        new MoveLearnSetEntry(Move.SWIFT,7),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,43),
                        new MoveLearnSetEntry(Move.STARGAZE,22),
                        new MoveLearnSetEntry(Move.SUPERNOVA,25),
                        new MoveLearnSetEntry(Move.STARDUSTREVERIE,34),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,40),
                        new MoveLearnSetEntry(Move.BIG_BANG,60),
                        new MoveLearnSetEntry(Move.RADIATION,1),
                        new MoveLearnSetEntry(Move.FLASH,19),
                        new MoveLearnSetEntry(Move.PSYCHIC,49),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,28),
                        new MoveLearnSetEntry(Move.LUMINESCENCE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,4),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,40),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,37),
                        new MoveLearnSetEntry(Move.DIVINEVISION,56),
                        new MoveLearnSetEntry(Move.INSTRUCT,52),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.COSMICAVATAR,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DIVINEPUNISHMENT,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FAIRYTALE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HEAVENSKNUCKLE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.METEORDRIVE,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLARECLIPSE,"tm"),
                        new MoveLearnSetEntry(Move.STARDUSTREVERIE,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.STARSALIGNED,"egg"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"egg"),
                        new MoveLearnSetEntry(Move.ASTRAL_BARRAGE,"egg"),
                        new MoveLearnSetEntry(Move.QUICKSPELL,"egg"),
                        new MoveLearnSetEntry(Move.PSYSTRIKE,"egg")),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(31).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Oranguru");

    }


}
