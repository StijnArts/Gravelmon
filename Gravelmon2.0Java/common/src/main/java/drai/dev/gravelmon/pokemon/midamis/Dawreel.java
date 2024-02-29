package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dawreel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dawreel() {
        super("Dawreel",
                Type.STEEL,Type.GROUND,
                new Stats(75,
                        55,
                        105,
                        45,
                        105,
                        95),
                List.of(Ability.ARENA_TRAP), Ability.PRESSURE,
                14, 165,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These Pokemon are known for their steel maces, which can be devastating. They are quite the offensive Pokemon, however they lack in special moves. But what they lack in special they make up for in resistance and Dawreel are one of the toughest Pokemon out there."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.BIND,7),
                        new MoveLearnSetEntry(Move.DIG,10),
                        new MoveLearnSetEntry(Move.HARDEN,15),
                        new MoveLearnSetEntry(Move.IRON_TAIL,18),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,23),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.FLAIL,31),
                        new MoveLearnSetEntry(Move.METAL_BURST,34),
                        new MoveLearnSetEntry(Move.WRING_OUT,39),
                        new MoveLearnSetEntry(Move.METEOR_MASH,42)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dawreel");

    }


}
