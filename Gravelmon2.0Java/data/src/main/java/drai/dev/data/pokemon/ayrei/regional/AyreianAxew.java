package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianAxew extends drai.dev.data.pokemon.Pokemon {
    public AyreianAxew(String name, Aspect aspect) {
        super(name, aspect,"AyreianAxew",
                Type.DRAGON,Type.STEEL,
                new Stats(46,
                        87,
                        75,
                        42,
                        30,
                        40),
                List.of(Ability.RIVALRY,Ability.PRISM_ARMOR), null,
                6, 180,
                new Stats(0,1,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("They play with each other by knocking their large tusks together. Their tusks break sometimes, but they grow back so quickly that it isn't a concern."),
                List.of(new EvolutionEntry("fraxure ayreian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,42),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BITE,3),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,33),
                        new MoveLearnSetEntry(Move.SLASH,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,6),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.TAUNT,12),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,36),
                        new MoveLearnSetEntry(Move.GUILLOTINE,45),
                        new MoveLearnSetEntry(Move.ASSURANCE,9),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,30),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,18),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,48),
                        new MoveLearnSetEntry(Move.SCARY_FACE,21),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,39),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.HARDEN,"egg"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"egg")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Axew");

    }


}
