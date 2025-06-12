package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochRufflet extends drai.dev.data.pokemon.Pokemon {
    public EpochRufflet(String name, Aspect aspect) {
        super(name, aspect, "EpochRufflet",
                Type.FIRE,Type.FLYING,
                new Stats(70,
                        83,
                        50,
                        75,
                        37,
                        50),
                List.of(Ability.KEEN_EYE,Ability.DEFIANT), Ability.BLAZE,
                15, 410,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It is just learning to spit fire. As it matures, the fire becomes hotter and more intense."),
                List.of(new EvolutionEntry("epochbraviary", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.BEAK_BLAST,59),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,14),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,64),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,47),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.JETDIVE,7),
                        new MoveLearnSetEntry(Move.SWEEPINGTALON,37),
                        new MoveLearnSetEntry(Move.KINDLE,1),
                        new MoveLearnSetEntry(Move.GLIDE,11),
                        new MoveLearnSetEntry(Move.SACRED_FIRE,56),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,17),
                        new MoveLearnSetEntry(Move.SCORCH,4),
                        new MoveLearnSetEntry(Move.MELTINGHORN,42),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,21),
                        new MoveLearnSetEntry(Move.FIRE_LASH,33),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.STREAMRUSH,25),
                        new MoveLearnSetEntry(Move.TAILWIND,29),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,52),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENTGLARE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOLT_BEAK,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"tm"),
                        new MoveLearnSetEntry(Move.FLOCK,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TORNADO,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TURBULENCE,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.FLARESWEEP,"egg"),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Rufflet");

    }


}
