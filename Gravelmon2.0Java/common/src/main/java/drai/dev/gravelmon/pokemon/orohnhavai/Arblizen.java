package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Arblizen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Arblizen() {
        super("Arblizen",
                Type.ICE,Type.NORMAL,
                new Stats(60,
                        100,
                        55,
                        70,
                        55,
                        90),
                List.of(Ability.SNOW_CLOAK,Ability.ICE_BODY,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,1,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They work together in a pack to hunt down prey. As food goes scarce and tension rises, packs of Arblizen will form rivalries with other packs."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arblizen");

    }


}
