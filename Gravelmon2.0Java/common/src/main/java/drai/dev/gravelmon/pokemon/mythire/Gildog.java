package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gildog extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gildog() {
        super("Gildog",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OVERGROW), Ability.JUSTIFIED,
                12, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("The feather-like leaves on its body are coveted, but also razor-sharp, and it will attack with a rush of strikes if it's threatened. Its forelegs are covered in tough, protective bark."),
                List.of(new EvolutionEntry("heraldise", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.ACROBATICS,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.REVENGE,1),
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.NATURE_POWER,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.AGILITY,1)
                ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gildog");

    }


}
