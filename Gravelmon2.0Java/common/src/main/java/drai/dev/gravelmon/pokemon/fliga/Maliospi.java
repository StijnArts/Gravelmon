package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Maliospi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maliospi() {
        super("Maliospi",
                Type.FIGHTING, Type.WATER,
                new Stats(53,
                        87,
                        40,
                        41,
                        62,
                        87),
                List.of(Ability.RELENTLESS,Ability.SWIFT_SWIM), Ability.DEFIANT,
                6, 54,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Maliospi are deadly hunters that can infest riverbanks. They will swim so quickly that they have often had their scales fall of their body from the speeds they travel in the water. They also don't sleep, and only get rest when they've fainted in battle."),
                List.of(new EvolutionEntry("helsteteri", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.DARK_PULSE.getName()+"\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.REVENGE,16),
                        new MoveLearnSetEntry(Move.AQUA_JET,20),
                        new MoveLearnSetEntry(Move.RUSHDOWN,25),
                        new MoveLearnSetEntry(Move.FILLET_AWAY,30),
                        new MoveLearnSetEntry(Move.DARK_PULSE,32),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,36),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,43),
                        new MoveLearnSetEntry(Move.SUPERPOWER,46),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,52),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,55),
                        new MoveLearnSetEntry(Move.GUILLOTINE,60),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,65)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 9, 28, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

    }


}
