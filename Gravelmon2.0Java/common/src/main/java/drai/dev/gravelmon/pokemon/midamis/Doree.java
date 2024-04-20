package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Doree extends drai.dev.gravelmon.pokemon.Pokemon {
    public Doree() {
        super("Doree",
                Type.STEEL, Type.GROUND,
                new Stats(45,
                        30,
                        65,
                        25,
                        55,
                        65),
                List.of(Ability.ARENA_TRAP), Ability.KLUTZ,
                6, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Much like Diglett, Doree is a earth-moving Pokemon. People have made exhibits where you can visit tunnels, which Doree famalies have made, and find rare Pokmon underground, but not for capture."),
                List.of(new EvolutionEntry("dawreel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Doree");

    }


}
