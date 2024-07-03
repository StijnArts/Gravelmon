package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Mycelil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mycelil() {
        super("Mycelil",
                Type.GRASS,
                new Stats(30,
                        25,
                        35,
                        45,
                        36,
                        20),
                List.of(Ability.EFFECT_SPORE), Ability.CHLOROPHYLL,
                4, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                38, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Mycelil like to stay in one place, only moving when they have drained the nutrients from the ground. Their mushrooms glow in the dark."),
                List.of(new EvolutionEntry("loomstool", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,8),
                        new MoveLearnSetEntry(Move.ASTONISH,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,16),
                        new MoveLearnSetEntry(Move.INGRAIN,20),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,28),
                        new MoveLearnSetEntry(Move.MOONLIGHT,32),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,36),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,40),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,44),
                        new MoveLearnSetEntry(Move.SPORE,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.DREAM_EATER,1)),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM, Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mycelil");

    }


}
