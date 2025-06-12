package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochDodrio extends drai.dev.data.pokemon.Pokemon {
    public EpochDodrio(String name, Aspect aspect) {
        super(name, aspect, "EpochDodrio",
                Type.COSMIC,Type.FLYING,
                new Stats(80,
                        60,
                        60,
                        105,
                        100,
                        85),
                List.of(Ability.EARLY_BIRD,Ability.COMPETITIVE), Ability.DISHEARTEN,
                18, 852,
                new Stats(0,0,0,0,0,2), 100,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It is rumoured that each of its heads are simultaneously looking into different timelines and universes to anticipate enemy attacks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AERIALPULSE,44),
                        new MoveLearnSetEntry(Move.STARSALIGNED,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,29),
                        new MoveLearnSetEntry(Move.SWIFT,10),
                        new MoveLearnSetEntry(Move.MOONBLAST,51),
                        new MoveLearnSetEntry(Move.BLACKOUT,13),
                        new MoveLearnSetEntry(Move.RADIATION,4),
                        new MoveLearnSetEntry(Move.TWINSTARS,37),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,23),
                        new MoveLearnSetEntry(Move.PSYCHIC,41),
                        new MoveLearnSetEntry(Move.TEMPESTFLARE,55),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,59),
                        new MoveLearnSetEntry(Move.STARFALL,19),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,33),
                        new MoveLearnSetEntry(Move.CONFUSION,7),
                        new MoveLearnSetEntry(Move.TURBULENCE,16),
                        new MoveLearnSetEntry(Move.PSYBEAM,26),
                        new MoveLearnSetEntry(Move.MOONLIGHT,47),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.STARDUST,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHIDORI,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.COSMICAVATAR,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIXEDWAVES,"tm"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.MOONSTONERAY,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLARECLIPSE,"tm"),
                        new MoveLearnSetEntry(Move.STARDUSTREVERIE,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TURBULENCE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dodrio");

    }


}
