package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Jawson extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jawson() {
        super("Jawson",
                Type.STEEL, Type.DARK,
                new Stats(67,
                        113,
                        42,
                        73,
                        71,
                        83),
                List.of(Ability.SWIFT_SWIM,Ability.MOXIE,Ability.RAZORFINS), Ability.RAZORFINS,
                18, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                157, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Jawson are constantly growing new teeth and replacing the current ones. The teeth shed have been used by the people of Oceane going back hundreds of years as primitive cooking utensils for slicing and chopping."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.METAL_CLAW,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,14),
                        new MoveLearnSetEntry(Move.SUDDEN_STRIKE,18),
                        new MoveLearnSetEntry(Move.SLASH,22),
                        new MoveLearnSetEntry(Move.BOLTIN,26),
                        new MoveLearnSetEntry(Move.SHEDFANGS,30),
                        new MoveLearnSetEntry(Move.CRUNCH,35),
                        new MoveLearnSetEntry(Move.IRON_TAIL,40),
                        new MoveLearnSetEntry(Move.TORPEDODASH,44),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,49),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,54),
                        new MoveLearnSetEntry(Move.GUILLOTINE,60),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 22, 45, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
