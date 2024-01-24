package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Campyre extends drai.dev.gravelmon.pokemon.Pokemon {
    public Campyre() {
        super("Campyre",
                Type.FIRE,
                new Stats(41,
                        56,
                        65,
                        87,
                        65,
                        41),
                List.of(Ability.FLAME_BODY,Ability.FLASH_FIRE,Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                8, 165,
                new Stats(0,0,0,1,0,0), 222,
                0.5,
                67, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Campyres typically are born from a trainer burning a special type of wood. They love to provide warmth to others and are generally very well-mannered when looked over regularly."),
                List.of(),
                List.of(                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Campyre");

    }


}
