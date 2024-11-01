package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Prickity extends drai.dev.data.pokemon.Pokemon {
    public Prickity() {
        super("Prickity",
                Type.GRASS,
                new Stats(51,
                        81,
                        31,
                        41,
                        41,
                        51),
                List.of(Ability.ROUGH_SKIN,Ability.WATER_ABSORB), Ability.INNER_FOCUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Name Help: kaijumon Name Meaning: Prick/prickly + kit, baby rabbit THIS MON IS NOT FREE FOR PUBLIC USE. THIS MON IS NOT TO BE MODIFIED IN ANY WAY. IF YOU SEE THIS MON ANYWHERE ELSE OTHER THAN POKENGINE, OR POSTED ANYWHERE OTHER THAN BY THE FOLLOWING USERS: scarffles, scarfscrawls, scarffle2, THEN IT IS STOLEN. THAT GOES FOR ALL IMAGE ASSETS AS WELL (Sprite(s), icons, overworlds, and any other related image material)."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Prickity");

    }


}
