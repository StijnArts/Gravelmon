package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochLunatone extends drai.dev.data.pokemon.Pokemon {
    public EpochLunatone(String name, Aspect aspect) {
        super(name, aspect, "EpochLunatone",
                Type.ICE,Type.COSMIC,
                new Stats(70,
                        55,
                        65,
                        85,
                        110,
                        100),
                List.of(Ability.ICE_BODY,Ability.CLEAR_BODY), Ability.CLOUD_NINE,
                10, 1680,
                new Stats(0,0,0,2,0,0), 100,
                -1.0,
                154, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It is said to have come from a comet that breached the Earth's atmosphere. It emits a powerful frozen aura when it senses danger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,37),
                        new MoveLearnSetEntry(Move.STARSALIGNED,49),
                        new MoveLearnSetEntry(Move.BLIZZARD,61),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,57),
                        new MoveLearnSetEntry(Move.SWIFT,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,53),
                        new MoveLearnSetEntry(Move.SOLARECLIPSE,33),
                        new MoveLearnSetEntry(Move.ICY_WIND,5),
                        new MoveLearnSetEntry(Move.HYPNOSIS,9),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,13),
                        new MoveLearnSetEntry(Move.STARFALL,17),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,29),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.POWER_GEM,25),
                        new MoveLearnSetEntry(Move.GLACIATE,21),
                        new MoveLearnSetEntry(Move.ICE_BEAM,41),
                        new MoveLearnSetEntry(Move.MOONLIGHT,45),
                        new MoveLearnSetEntry(Move.STARDUST,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,"tm"),
                        new MoveLearnSetEntry(Move.BEJEWELED,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GLISTEN,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPOTHERMIA,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.METEORDRIVE,"tm"),
                        new MoveLearnSetEntry(Move.MINERALWAVE,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MIXEDWAVES,"tm"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.MOONSTONERAY,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLARECLIPSE,"tm"),
                        new MoveLearnSetEntry(Move.STARDUSTREVERIE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg"),
                        new MoveLearnSetEntry(Move.HYPOTHERMIA,"egg"),
                        new MoveLearnSetEntry(Move.METEORSHOWER,"egg"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"egg"),
                        new MoveLearnSetEntry(Move.ASTRAL_BARRAGE,"egg"),
                        new MoveLearnSetEntry(Move.ASTRALWIND,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(25)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lunatone");

    }


}
