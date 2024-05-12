package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bullverin extends Pokemon {
    public Bullverin() {
        super("Bullverin",
                Type.FIRE,
                new Stats(70, 75, 62, 75, 63, 60),
                List.of(Ability.BLAZE), Ability.RECKLESS,
                7, 300,
                new Stats(0,1,0,1,0,0), 45,
                0.875,
                147, ExperienceGroup.MEDIUM_SLOW,
                70,
                41, List.of(EggGroup.FIELD),
                List.of("It membranes toughen up during evolution, turning similar to glass. When it blows up, spits out fiery cannonballs."),
                List.of(new EvolutionEntry("croakraze", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.FLING,9),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,12),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,15),
                        new MoveLearnSetEntry(Move.MUD_BOMB,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,25),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,30),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,34),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,40),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,45),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,50),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.SPIKES,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.ERUPTION,"egg"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.SAGE),
                2, List.of(),
                SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 18, 33, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.9, 0.7,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
