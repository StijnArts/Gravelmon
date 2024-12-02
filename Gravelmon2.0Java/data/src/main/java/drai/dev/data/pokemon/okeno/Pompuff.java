package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pompuff extends drai.dev.data.pokemon.Pokemon {
    public Pompuff() {
        super("Pompuff",
                Type.BUG, Type.ELECTRIC,
                new Stats(50,
                        35,
                        55,
                        55,
                        60,
                        50),
                List.of(Ability.FLUFFY,Ability.EFFECT_SPORE,Ability.PLUS), Ability.PLUS,
                8, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("catertuff", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 29, 4.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pompuff");

    }


}
