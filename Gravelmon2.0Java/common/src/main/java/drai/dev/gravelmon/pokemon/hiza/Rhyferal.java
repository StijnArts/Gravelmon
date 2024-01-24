package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rhyferal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rhyferal() {
        super("Rhyferal",
                Type.ICE,Type.FIGHTING,
                new Stats(110,
                        160,
                        125,
                        50,
                        50,
                        40),
                List.of(Ability.MOUNTAINEER), Ability.THICK_FAT,
                8, 165,
                new Stats(0,3,0,0,0,0), 30,
                0.5,
                241, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Its loud roar will agitate any Rhydon who hears and have them come to aid it in combat. It is strong enough to flip and carry war ship on its back."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rhyferal");

    }


}
