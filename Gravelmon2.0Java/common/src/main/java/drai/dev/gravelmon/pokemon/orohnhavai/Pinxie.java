package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pinxie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pinxie() {
        super("Pinxie",
                Type.FAIRY,
                new Stats(30,
                        30,
                        25,
                        55,
                        40,
                        75),
                List.of(Ability.IMMUNITY,Ability.FILTER,Ability.MISTY_SURGE), Ability.MISTY_SURGE,
                2, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Scientists believe they were formed from the cosmic dust after a star dies. Why or how they ended up in Orohn-Havai is still a mystery."),
                List.of(new EvolutionEntry("cosminx", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.COSMIC_POWER.getName()+"\"")))),
                List.of(                  new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.PIXIEDUST,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,9),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,13),
                        new MoveLearnSetEntry(Move.SWIFT,17),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,21),
                        new MoveLearnSetEntry(Move.REFLECT,26),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,30),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,34),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,39),
                        new MoveLearnSetEntry(Move.POWER_GEM,43),
                        new MoveLearnSetEntry(Move.WISH,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,54)       ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN, Biome.IS_PLATEAU)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pinxie");

    }


}
