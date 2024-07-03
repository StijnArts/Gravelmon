package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Dracruel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dracruel() {
        super("Dracruel",
                Type.DARK, Type.DRAGON,
                new Stats(70,
                        125,
                        65,
                        120,
                        120,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.INCINERATE,7),
                        new MoveLearnSetEntry(Move.HEADBUTT,14),
                        new MoveLearnSetEntry(Move.SCARY_FACE,21),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,28),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,35),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,49),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,56),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,63),
                        new MoveLearnSetEntry(Move.FLY,70),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,77),
                        new MoveLearnSetEntry(Move.ROOST,84),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,91)          ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dracruel");

    }


}
