package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mallocolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mallocolt() {
        super("Mallocolt",
                Type.FAIRY,Type.NORMAL,
                new Stats(58,
                        65,
                        60,
                        57,
                        70,
                        55),
                List.of(Ability.SWEET_VEIL,Ability.CUTE_CHARM), Ability.LIMBER,
                7, 115,
                new Stats(0,0,0,1,0,0), 25,
                0.125,
                74, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("It's unsure if Mallocolt exists outside of peoples dreams. Its mane tastes of marshmallows and the rocks that fall off of its body taste of sugar."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mallocolt");

    }


}
