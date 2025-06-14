package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Suckeeto extends drai.dev.data.pokemon.Pokemon {
    public Suckeeto() {
        super("Suckeeto",
                Type.BUG, Type.DARK,
                new Stats(51,
                        75,
                        98,
                        56,
                        98,
                        82),
                List.of(Ability.OWN_TEMPO,Ability.POWERLEECH,Ability.SWARM), Ability.SWARM,
                5, 165,
                new Stats(0,0,2,0,1,0), 140,
                0.5,
                161, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Suckeeto has a large needle on its face which it uses to drain the energy from its enemies. It also sucks the nutrients from trees when it is deep in the forest."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.POISONDART,12),
                        new MoveLearnSetEntry(Move.PLUCK,15),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,18),
                        new MoveLearnSetEntry(Move.FLATTER,21),
                        new MoveLearnSetEntry(Move.INFESTATION,24),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,27),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,30),
                        new MoveLearnSetEntry(Move.SLASH,33),
                        new MoveLearnSetEntry(Move.QUASH,36),
                        new MoveLearnSetEntry(Move.FELL_STINGER,39),
                        new MoveLearnSetEntry(Move.SUDDEN_STRIKE,42),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,45),
                        new MoveLearnSetEntry(Move.POISONDART,48),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,51),
                        new MoveLearnSetEntry(Move.SILVER_WIND,54),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,57),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,60),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TWINEEDLE,"tm"),
                        new MoveLearnSetEntry(Move.VIOLENTSWARM,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SWARMINGTERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.STUNJAB,"tm"),
                        new MoveLearnSetEntry(Move.DETECT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanFly(true);

    }


}
