package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import net.minecraft.world.level.block.*;

import java.util.*;
public class Piezeon extends drai.dev.data.pokemon.Pokemon {
    public Piezeon(Stats stats) {
        super("Piezeon",
                Type.SOUND,
                stats,
                List.of(Ability.SIGNALMAKER), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.24, 0.3,
                List.of());
        addAdditionalEvolution("eevee", new EvolutionEntry("piezeon", EvolutionType.ITEM_INTERACT, false, List.of(new MoveLearnSetEntry(Move.CURSE, "")),
                List.of(),List.of(),"minecraft:note_block"));
           setLangFileName("Piezeon");

    }


}
