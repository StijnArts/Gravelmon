package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leafinx extends drai.dev.data.pokemon.Pokemon {
    public Leafinx() {
        super("Leafinx",
                Type.ICE,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SLUSH_RUSH), null,
                4, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Grelinx", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Leafinx");

    }


}
