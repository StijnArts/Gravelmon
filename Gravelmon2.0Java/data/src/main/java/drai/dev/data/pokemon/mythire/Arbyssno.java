package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Arbyssno extends drai.dev.data.pokemon.Pokemon {
    public Arbyssno() {
        super("Arbyssno",
                Type.DARK,
                new Stats(60,
                        95,
                        60,
                        90,
                        60,
                        125),
                List.of(Ability.UNNERVE,Ability.SKILL_LINK,Ability.TECHNICIAN), Ability.TECHNICIAN,
                17, 165,
                new Stats(0,1,0,0,0,1), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of("Trenchula lives in total darkness, sensing the movements of its prey. When it moves, it makes no sound at all."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BITE,5),
                        new MoveLearnSetEntry(Move.SPITE,7),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,11),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,15),
                        new MoveLearnSetEntry(Move.SCREECH,18),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,22),
                        new MoveLearnSetEntry(Move.HOOKCLAW,26),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,29),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,32),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,38),
                        new MoveLearnSetEntry(Move.NIGHTMARE,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.MEMENTO,53),
                        new MoveLearnSetEntry(Move.GUILLOTINE,60),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.SLASH,"tm"),
                        new MoveLearnSetEntry(Move.SUDDEN_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.PINCH,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_CAVE)
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
