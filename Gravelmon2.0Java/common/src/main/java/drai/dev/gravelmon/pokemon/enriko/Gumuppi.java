package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gumuppi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gumuppi() {
        super("Gumuppi",
                Type.WATER,
                new Stats(60,
                        60,
                        40,
                        35,
                        35,
                        50),
                List.of(Ability.STRONG_JAW,Ability.GUTS,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                64, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Genetically engineered in a lab to sell as pets, but they managed to thrive in the wild once released. They are blind, and adept at smelling each other's blood."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,9),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,16),
                        new MoveLearnSetEntry(Move.ACROBATICS,20),
                        new MoveLearnSetEntry(Move.PURSUIT,22),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.RECOVER,34),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,40),
                        new MoveLearnSetEntry(Move.FISHIOUS_REND,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gumuppi");

    }


}
