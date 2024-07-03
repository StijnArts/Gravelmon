package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Wintweasel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wintweasel() {
        super("Wintweasel",
                Type.ICE, Type.NORMAL,
                new Stats(88,
                        106,
                        80,
                        86,
                        72,
                        85),
                List.of(Ability.SCRAPPY), Ability.SLUSH_RUSH,
                19, 165,
                new Stats(1,1,0,0,0,1), 25,
                0.5,
                234, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Feudal Wintweasel are easy-going and prefer harvesting winter vegetables, but are also ready to draw their blade at a moment’s notice."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICEBLADE,1),
                        new MoveLearnSetEntry(Move.MIST,16),
                        new MoveLearnSetEntry(Move.ICE_FANG,20),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,25),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,30),
                        new MoveLearnSetEntry(Move.HYPER_FANG,36),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,46),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,50),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wintweasel");

    }


}
