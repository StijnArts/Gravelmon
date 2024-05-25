package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Oozegrim extends drai.dev.gravelmon.pokemon.Pokemon {
    public Oozegrim() {
        super("Oozegrim",
                Type.DARK, Type.WATER,
                new Stats(90,
                        50,
                        110,
                        100,
                        80,
                        40),
                List.of(Ability.PICKPOCKET,Ability.MOODY), Ability.POISON_TOUCH,
                18, 0,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("Oozegrim is a master of stealth, often lurking beneath murky waters or hidden in the shadows of bridges. When a potential prey draws near, it pounces with surprising agility, using the element of surprise to overwhelm its target. Travelers are cautioned to exercise vigilance when traversing areas known to be inhabited by Oozegrim."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Oozegrim");

    }


}
