package drai.dev.gravelmon.pokemon.aristos.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class AristosianGrowlithe extends drai.dev.gravelmon.pokemon.Pokemon {
    public AristosianGrowlithe(int dexNo) {
        super(dexNo,"AristosianGrowlithe",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        60),
                List.of(Ability.INTIMIDATE,Ability.SNOW_CLOAK,Ability.SLUSH_RUSH), Ability.SLUSH_RUSH,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.75,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Aristian Growlithe is often used in sled teams carrying people to and from Mt. Zenith highlands. Its fur seems like it would be warm, but it’s freezing to the touch."),
                List.of(),
                List.of(                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Growlithe");

    }


}
