package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Spelewink extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spelewink() {
        super("Spelewink",
                Type.POISON,Type.FAIRY,
                new Stats(100,
                        60,
                        60,
                        60,
                        85,
                        50),
                List.of(Ability.CUTE_CHARM,Ability.DRY_SKIN,Ability.PROTEAN), Ability.PROTEAN,
                5, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Strange fluids can be collected from Spelewink's skin, making what seems to be love potions. These said love potions can be lethal however, according to witnesses from a number of victims."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,4),
                        new MoveLearnSetEntry(Move.POUND,8),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,12),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,18),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,20),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,26),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,30),
                        new MoveLearnSetEntry(Move.ATTRACT,34),
                        new MoveLearnSetEntry(Move.BOUNCE,40),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,46),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,50),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,60)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spelewink");

    }


}
