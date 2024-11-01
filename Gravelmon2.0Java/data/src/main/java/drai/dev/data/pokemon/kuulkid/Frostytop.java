package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Frostytop extends drai.dev.data.pokemon.Pokemon {
    public Frostytop() {
        super("Frostytop",
                Type.ICE,Type.PSYCHIC,
                new Stats(46,
                        23,
                        44,
                        60,
                        75,
                        20),
                List.of(Ability.ANTICIPATION,Ability.ICE_BODY), Ability.SNOW_WARNING,
                6, 0,
                new Stats(0,0,0,0,1,0), 170,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("zerebro", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone")),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 33, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Frostytop");

    }


}
