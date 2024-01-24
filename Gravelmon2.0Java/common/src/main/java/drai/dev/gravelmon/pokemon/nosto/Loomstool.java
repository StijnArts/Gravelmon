package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Loomstool extends drai.dev.gravelmon.pokemon.Pokemon {
    public Loomstool() {
        super("Loomstool",
                Type.GRASS,Type.PSYCHIC,
                new Stats(50,
                        40,
                        45,
                        75,
                        46,
                        65),
                List.of(Ability.EFFECT_SPORE), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                112, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Loomstool don't stay around for long, shooting out glowing spores that will grow into new Mycelil."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,25),
                        new MoveLearnSetEntry(Move.SPORE,39)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Loomstool");

    }


}
