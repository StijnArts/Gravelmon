package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Pepstep extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pepstep() {
        super("Pepstep",
                Type.GROUND, Type.FIRE,
                new Stats(45,
                        60,
                        40,
                        55,
                        35,
                        65),
                List.of(Ability.BLAZE,Ability.SAND_VEIL), Ability.ROUGH_SKIN,
                5, 85,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("Pepstep, the Pepper Lizard Pokemon. Pepstep's tail is reminiscent of a pepper, and it uses it to attract prey. It is said that the more vibrant the colors on its tail, the spicier its fire breath becomes. Its flexible legs allow it to climb even the steepest of cliffs, and its sharp claws make it a formidable opponent in battle. Despite its small size, Pepstep has a fiery spirit and never backs down from a challenge. Pepstep is commonly found in warm, rocky areas, such as deserts or volcanic re"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,12),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,16),
                        new MoveLearnSetEntry(Move.DIG,20),
                        new MoveLearnSetEntry(Move.FLAME_BURST,24),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.FIRE_FANG,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,40),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_BURST,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"tm")                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pepstep");

    }


}
