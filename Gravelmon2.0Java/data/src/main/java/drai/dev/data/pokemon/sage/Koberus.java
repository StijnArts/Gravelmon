package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Koberus extends Pokemon {
    public Koberus() {
        super("Koberus",
                Type.DARK, Type.FIRE,
                new Stats(80, 115, 50, 55, 60, 100),
                List.of(Ability.HUSTLE, Ability.GUTS), Ability.SHEER_FORCE,
                13, 632,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("Often the cause of brush fires, Koberus will light its surroundings on fire, creating a thick cloud of smoke in order to disorient its opponents."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.PURSUIT,10),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,16),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,23),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,25),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,28),
                        new MoveLearnSetEntry(Move.FIRE_FANG,33),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,38),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,43),
                        new MoveLearnSetEntry(Move.WILLOWISP,49),
                        new MoveLearnSetEntry(Move.CRUNCH,55),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,61),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.FLING,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg")
                        ),
                List.of(Label.SAGE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE, Biome.IS_HIGHLANDS, Biome.IS_HILLS)
    .setAntiBiomes(Biome.IS_COLD)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
