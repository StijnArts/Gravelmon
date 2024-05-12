package drai.dev.gravelmon.pokemon.nodorro;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Ratamie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ratamie() {
        super("Ratamie",
                Type.NORMAL,
                new Stats(100,
                        75,
                        65,
                        60,
                        55,
                        85),
                List.of(Ability.FRIEND_GUARD,Ability.HUGE_POWER), Ability.SIMPLE,
                7, 190,
                new Stats(0,1,0,0,0,1), 127,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Ratamies are never found in the wild Ratamie are known to be their trainers best friend."),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ratamie");

    }


}
