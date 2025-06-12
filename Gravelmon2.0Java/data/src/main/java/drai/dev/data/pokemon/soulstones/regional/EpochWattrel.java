package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochWattrel extends drai.dev.data.pokemon.Pokemon {
    public EpochWattrel(String name, Aspect aspect) {
        super(name, aspect, "EpochWattrel",
                Type.ICE,Type.ROCK,
                new Stats(40,
                        55,
                        40,
                        70,
                        40,
                        35),
                List.of(Ability.SKILL_LINK,Ability.STURDY), Ability.TECHNICIAN,
                4, 36,
                new Stats(0,0,0,0,0,1), 180,
                0.5,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("It is very fast and is able to launch sharpened projectiles from its wings to maim its prey and close the distance on them quickly so they cannot escape."),
                List.of(new EvolutionEntry("epochkilowattrel", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,43),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,11),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.GLIDE,15),
                        new MoveLearnSetEntry(Move.ACCELEROCK,7),
                        new MoveLearnSetEntry(Move.AVALANCHE,19),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,32),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,37),
                        new MoveLearnSetEntry(Move.TAILWIND,53),
                        new MoveLearnSetEntry(Move.ICE_SHARD,4),
                        new MoveLearnSetEntry(Move.ROOST,23),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,27),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,48),
                        new MoveLearnSetEntry(Move.POLARSPEAR,59),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BEJEWELED,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLOCK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GLISTEN,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.HYPOTHERMIA,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.MINERALWAVE,"tm"),
                        new MoveLearnSetEntry(Move.MISSILESHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MOONSTONERAY,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TORNADO,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TURBULENCE,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.JETDIVE,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"egg"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"egg"),
                        new MoveLearnSetEntry(Move.BOULDERHURL,"egg"),
                        new MoveLearnSetEntry(Move.WORK_UP,"egg"),
                        new MoveLearnSetEntry(Move.FLOCK,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING)
    .setAntiBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Wattrel");

    }


}
