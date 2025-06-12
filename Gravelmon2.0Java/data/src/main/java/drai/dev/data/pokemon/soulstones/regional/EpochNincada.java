package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochNincada extends drai.dev.data.pokemon.Pokemon {
    public EpochNincada(String name, Aspect aspect) {
        super(name, aspect, "EpochNincada",
                Type.NORMAL,Type.BUG,
                new Stats(30,
                        55,
                        70,
                        45,
                        30,
                        40),
                List.of(Ability.SWARM,Ability.COMPOUND_EYES), Ability.SHELL_ARMOR,
                5, 55,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                53, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It harbours two conflicting energies deep within its body, that are in constant battle with one another, vying for escape."),
                List.of(new EvolutionEntry("epochninjask", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26"),
new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night"))),
new EvolutionEntry("epochshedinja", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26"),
new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day")))),
                List.of(
                        new MoveLearnSetEntry(Move.SINFULSMITE,25),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,16),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,12),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43),
                        new MoveLearnSetEntry(Move.STICKY_WEB,20),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,40),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,47),
                        new MoveLearnSetEntry(Move.NECTARTAP,7),
                        new MoveLearnSetEntry(Move.VENOMDRAIN,32),
                        new MoveLearnSetEntry(Move.THIEF,10),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,12),
                        new MoveLearnSetEntry(Move.POISONSPIT,4),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GOBLINSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GOLDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HIVEMIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"egg"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"egg"),
                        new MoveLearnSetEntry(Move.INFESTATION,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_POISON,"egg"),
                        new MoveLearnSetEntry(Move.BACKSTABBING,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nincada");

    }


}
