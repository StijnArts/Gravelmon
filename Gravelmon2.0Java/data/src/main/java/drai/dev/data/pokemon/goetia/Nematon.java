package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nematon extends drai.dev.data.pokemon.Pokemon {
    public Nematon() {
        super("Nematon",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It thrives in dirty water where it can absorb nutrients through its skin. It hates being dry and actively avoids the sun."),
                List.of(new EvolutionEntry("helminthon", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"minecraft:rotten_flesh"),
                        new EvolutionEntry("capaciton", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"minecraft:hopper"),
                        new EvolutionEntry("trematon", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"minecraft:spider_eye")),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Nematon");

    }


}
