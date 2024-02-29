package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Crudecay extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crudecay() {
        super("Crudecay",
                Type.DARK,Type.POISON,
                new Stats(106,
                        106,
                        60,
                        81,
                        106,
                        30),
                List.of(Ability.LIQUID_OOZE), Ability.INNARDS_OUT,
                8, 165,
                new Stats(1,1,0,0,1,0), 90,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.BUG),
                List.of("Burrowed inside the body of an unknown water dwelling Pokemon. Crudecay (Cloaked form) lurks during nighttime on dark shores, waiting to feed on innocent pray. It reeks of death."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.ENDURE,5),
                        new MoveLearnSetEntry(Move.SLUDGE,10),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,20),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,26),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,30),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,46),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.TOXIC,56),
                        new MoveLearnSetEntry(Move.MEMENTO,62),
                        new MoveLearnSetEntry(Move.BONE_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crudecay");

    }


}
