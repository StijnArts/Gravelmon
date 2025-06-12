package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochParasect extends drai.dev.data.pokemon.Pokemon {
    public EpochParasect(String name, Aspect aspect) {
        super(name, aspect, "EpochParasect",
                Type.BUG,Type.GHOST,
                new Stats(75,
                        40,
                        90,
                        45,
                        100,
                        75),
                List.of(Ability.EFFECT_SPORE,Ability.DRY_SKIN), Ability.CONTRARY,
                10, 295,
                new Stats(0,0,1,0,0,0), 75,
                0.5,
                142, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("The mushroom is a measure of its life span. The more decayed it is, the older it is, and therefore the closer to death it is."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PHEROMONESTREAM,27),
                        new MoveLearnSetEntry(Move.POISON_POWDER,8),
                        new MoveLearnSetEntry(Move.ECTOPLASM,1),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,21),
                        new MoveLearnSetEntry(Move.DEATHWALTZ,47),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,5),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.POLLENBLAST,43),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,1),
                        new MoveLearnSetEntry(Move.SPORE,31),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,11),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,39),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,35),
                        new MoveLearnSetEntry(Move.HEX,14),
                        new MoveLearnSetEntry(Move.INFECTION,17),
                        new MoveLearnSetEntry(Move.GOOSEBUMP,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,8),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,8),
                        new MoveLearnSetEntry(Move.POWER_SWAP,21),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,21),
                        new MoveLearnSetEntry(Move.ACID_RAIN,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGY,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GOBLINSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HIVEMIND,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.MACABREDANCE,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NATURESWRATH,"tm"),
                        new MoveLearnSetEntry(Move.NECTARTAP,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.POSSESSION,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWSCALES,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SOULSHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Parasect");

    }


}
