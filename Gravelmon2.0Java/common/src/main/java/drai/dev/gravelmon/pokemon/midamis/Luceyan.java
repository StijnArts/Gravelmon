package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Luceyan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Luceyan() {
        super("Luceyan",
                Type.DARK,Type.DRAGON,
                new Stats(100,
                        125,
                        100,
                        125,
                        100,
                        130),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                33, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.BITE,1),
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
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,91)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Luceyan");

    }


}
