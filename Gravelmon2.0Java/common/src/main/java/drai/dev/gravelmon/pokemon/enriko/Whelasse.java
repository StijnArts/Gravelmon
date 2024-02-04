package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Whelasse extends drai.dev.gravelmon.pokemon.Pokemon {
    public Whelasse() {
        super("Whelasse",
                Type.FAIRY,
                new Stats(165,
                        75,
                        90,
                        65,
                        70,
                        45),
                List.of(Ability.GOOEY), Ability.AROMA_VEIL,
                18, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Whelasse's hide is so rubbery that it's impossible to take a bite out of. Would-be predators attack it, only to fall into its gaping mouth."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,5),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,15),
                        new MoveLearnSetEntry(Move.POISON_POWDER,21),
                        new MoveLearnSetEntry(Move.SWEET_KISS,28),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,31),
                        new MoveLearnSetEntry(Move.TOXIC,34),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,37),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.RECOVER,44),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,49),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,51),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,55),
                        new MoveLearnSetEntry(Move.AMNESIA,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 57, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL, Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Whelasse");

    }


}
