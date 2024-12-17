package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanRemoraid extends drai.dev.data.pokemon.Pokemon {
    public LagoonanRemoraid(String name, Aspect aspect) {
        super(name, aspect, "Remoraid",
                Type.ICE,
                new Stats(35,
                        65,
                        35,
                        65,
                        35,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 120,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(new EvolutionEntry("crystalker", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone"),
                        new EvolutionEntry("octillery lagoonan", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 13, 36, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Remoraid");

    }


}
