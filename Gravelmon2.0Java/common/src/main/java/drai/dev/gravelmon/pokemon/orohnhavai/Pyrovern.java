package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pyrovern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pyrovern() {
        super("Pyrovern",
                Type.FIRE,Type.DRAGON,
                new Stats(75,
                        110,
                        80,
                        105,
                        65,
                        100),
                List.of(Ability.BLAZE), Ability.DEFIANT,
                8, 165,
                new Stats(0,1,0,2,0,0), 45,
                0.875,
                231, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
                List.of("The mighty shriek of a Pyrovern is said to spread fear even to the bravest of souls."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_HEAD,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,5),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,13),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,20),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,24),
                        new MoveLearnSetEntry(Move.FLAME_BURST,28),
                        new MoveLearnSetEntry(Move.SLASH,33),
                        new MoveLearnSetEntry(Move.STEEL_WING,36),
                        new MoveLearnSetEntry(Move.CRUNCH,39),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,45),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,50),
                        new MoveLearnSetEntry(Move.METAL_SOUND,55),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,61),
                        new MoveLearnSetEntry(Move.OVERHEAT,66),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.HEMODRAIN,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyrovern");

    }


}