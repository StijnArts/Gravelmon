package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kamiyin extends drai.dev.data.pokemon.Pokemon {
    public Kamiyin() {
        super("Kamiyin",
                Type.GHOST, Type.DRAGON,
                new Stats(130,
                        100,
                        125,
                        100,
                        125,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                34, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.DEFOG,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,7),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,14),
                        new MoveLearnSetEntry(Move.HEX,21),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.SCARY_FACE,35),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,42),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,49),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,56),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,63),
                        new MoveLearnSetEntry(Move.EARTH_POWER,70),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,77),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,84)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kamiyin");

    }


}
