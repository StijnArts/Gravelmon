package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wibow extends drai.dev.data.pokemon.Pokemon {
    public Wibow() {
        super("Wibow",
                Type.BUG,
                new Stats(25,
                        45,
                        35,
                        35,
                        35,
                        85),
                List.of(Ability.INNER_FOCUS,Ability.ADHESIVE,Ability.SWARM), Ability.SWARM,
                2, 165,
                new Stats(0,0,0,0,0,1), 230,
                0.5,
                52, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Wibow hurls itself at its prey's neck to drain their body fluids. Its abdomen is so adhesive that victims have no choice but to let it eat its fill."),
                List.of(new EvolutionEntry("tarantailor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.POUNCE,6),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.BUG_BITE,13),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,15),
                        new MoveLearnSetEntry(Move.SILK_TRAP,18),
                        new MoveLearnSetEntry(Move.CHARM,20),
                        new MoveLearnSetEntry(Move.THREADLASH,24),
                        new MoveLearnSetEntry(Move.PURSUIT,27),
                        new MoveLearnSetEntry(Move.CRUNCH,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,32),
                        new MoveLearnSetEntry(Move.TICKLE,35),
                        new MoveLearnSetEntry(Move.STICKY_WEB,37),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,40),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,44),
                        new MoveLearnSetEntry(Move.LUNGE,47),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.SWARMINGTERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.WRAP,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wibow");

    }


}
