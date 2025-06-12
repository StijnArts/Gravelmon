package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lukpup extends Pokemon {
    public Lukpup() {
        super("Lukpup",
                Type.FAIRY,
                new Stats(60, 75, 50, 70, 70, 60),
                List.of(Ability.FLUFFY), Ability.TRIAGE,
                5, 149,
                new Stats(0,1,0,0,0,0), 25,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.DRAGON, EggGroup.FIELD),
                List.of("A shy Pokemon that only appears in perfect weather conditions. It's seen so rarely that some people aren't convinced that they're real."),
                List.of(new EvolutionEntry("lukagon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160")))),
                List.of(
                        new MoveLearnSetEntry(Move.HEAL_PULSE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.ABSORB,9),
                        new MoveLearnSetEntry(Move.AQUA_JET,13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,17),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,23),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,29),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,37),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,50),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,55),
                        new MoveLearnSetEntry(Move.MOONLIGHT,57),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,59),
                        new MoveLearnSetEntry(Move.MOONBLAST,62),
                        new MoveLearnSetEntry(Move.WISH,69),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,74),
                        new MoveLearnSetEntry(Move.HEALING_WISH,77),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                        ),
                List.of(Label.INFINITY),
                2, List.of(
                        new ItemDrop("minecraft:leather",50, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .isNotRaining()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
