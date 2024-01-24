package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Boxbuffer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boxbuffer() {
        super("Boxbuffer",
                Type.FIGHTING,Type.POISON,
                new Stats(110,
                        130,
                        40,
                        60,
                        70,
                        90),
                List.of(Ability.IRON_BARBS,Ability.POISON_POINT,Ability.RAIN_DISH), Ability.RAIN_DISH,
                8, 165,
                new Stats(0,2,0,0,0,0), 85,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It's able to swell its fists with water to make them heavier and stronger. By lowering its head and raising its fists, it can easily cushion all damage before rebounding with a brutal counterattack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PUFFUP,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Boxbuffer");

    }


}
