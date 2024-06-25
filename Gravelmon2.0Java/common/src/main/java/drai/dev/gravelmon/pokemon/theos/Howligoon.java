package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Howligoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Howligoon() {
        super("Howligoon",
                Type.FIGHTING,
                new Stats(40,
                        55,
                        40,
                        70,
                        40,
                        55),
                List.of(Ability.SOUNDPROOF,Ability.RIVALRY), Ability.COMPETITIVE,
                10, 215,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Howligoon constantly fight for leadership, with the loudest howler being the Alpha of the tribe. When they're in a bad mood they will bang on their chest and go on a rampage."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Howligoon");

    }


}
