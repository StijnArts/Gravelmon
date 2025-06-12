package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Allywag extends drai.dev.data.pokemon.Pokemon {
    public Allywag() {
        super("Allywag",
                Type.DARK, Type.WATER,
                new Stats(35,
                        80,
                        15,
                        65,
                        40,
                        70),
                List.of(Ability.SNIPER,Ability.OPPORTUNIST,Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 165,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                61, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("When it spies a human, it tries to entice them into following it. Without fail, it leads them into an ambush and takes their valuables."),
                List.of(new EvolutionEntry("avigate", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,3),
                        new MoveLearnSetEntry(Move.WATER_SPORT,8),
                        new MoveLearnSetEntry(Move.SNATCH,11),
                        new MoveLearnSetEntry(Move.THIEF,15),
                        new MoveLearnSetEntry(Move.AQUASLAP,19),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,22),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,28),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,31),
                        new MoveLearnSetEntry(Move.BEACHTIDE,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,37),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,40),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,44),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,54),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.NUGGETFLING,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
           setLangFileName("Allywag");

    }


}
