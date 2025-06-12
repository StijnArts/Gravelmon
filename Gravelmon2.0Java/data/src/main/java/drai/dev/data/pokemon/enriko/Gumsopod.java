package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gumsopod extends drai.dev.data.pokemon.Pokemon {
    public Gumsopod() {
        super("Gumsopod",
                Type.FAIRY,
                new Stats(125,
                        55,
                        70,
                        35,
                        70,
                        25),
                List.of(Ability.GOOEY), Ability.AROMA_VEIL,
                11, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its shell is made of 38 different layers of sugar. If swallowed, a Gumsopod can survive in the stomach for up to 7 years."),
                List.of(new EvolutionEntry("whelasse", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,5),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,15),
                        new MoveLearnSetEntry(Move.POISON_POWDER,21),
                        new MoveLearnSetEntry(Move.SWEET_KISS,28),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,31),
                        new MoveLearnSetEntry(Move.TOXIC,34),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,35),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,37),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,45),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,50),
                        new MoveLearnSetEntry(Move.AMNESIA,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL, Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gumsopod");

    }


}
