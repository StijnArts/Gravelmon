package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Pinxie extends drai.dev.data.pokemon.Pokemon {
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
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.COSMIC_POWER.getName())))),
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
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN, Biome.IS_PLATEAU)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pinxie");

    }


}
