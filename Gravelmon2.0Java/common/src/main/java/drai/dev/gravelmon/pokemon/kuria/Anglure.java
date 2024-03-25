package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Anglure extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anglure() {
        super("Anglure",
                Type.LIGHT,Type.GHOST,
                new Stats(30,
                        30,
                        35,
                        60,
                        40,
                        60),
                List.of(Ability.WATER_ABSORB,Ability.CURSED_BODY), Ability.ALLURINGGLOW,
                2, 1,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Often living in sunken ships, it is thought that Anglure are the reason the ships sunk in the first place. The lights they emit are seen from deep within the ocean and make those who see it extremely curious, enough so to lead them on a wrong path."),
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
           setLangFileName("Anglure");

    }


}
