package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Selveger extends drai.dev.gravelmon.pokemon.Pokemon {
    public Selveger() {
        super("Selveger",
                Type.GRASS,Type.GROUND,
                new Stats(103,
                        127,
                        90,
                        90,
                        90,
                        80),
                List.of(Ability.PRESSURE), Ability.TOUGH_CLAWS,
                8, 165,
                new Stats(1,2,0,0,0,0), 3,
                0.5,
                270, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- Hone Claws Dark - Nature's Call Grass - Razor LeafSTAB Grass - Solar BladeSTAB Grass 6 Chip Away Normal 13 Fury Cutter Bug 22 Scary Face Normal 29 DigSTAB Ground 37 Camouflage Normal 45 Crush Claw Normal 53 Roar Normal 62 Savage SlashSTAB Ground 70 Leaf BladeSTAB Grass 79 Superpower Fighting 87 Wood HammerSTAB Grass 94 FissureSTAB Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,1),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,6),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,13),
                        new MoveLearnSetEntry(Move.SCARY_FACE,22),
                        new MoveLearnSetEntry(Move.DIG,29),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,37),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,45),
                        new MoveLearnSetEntry(Move.ROAR,53),
                        new MoveLearnSetEntry(Move.SAVAGESLASH,62),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,70),
                        new MoveLearnSetEntry(Move.SUPERPOWER,79),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,87),
                        new MoveLearnSetEntry(Move.FISSURE,94)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Selveger");

    }


}
