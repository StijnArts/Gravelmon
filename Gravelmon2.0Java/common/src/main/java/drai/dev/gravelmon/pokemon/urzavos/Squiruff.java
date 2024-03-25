package drai.dev.gravelmon.pokemon.urzavos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Squiruff extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squiruff() {
        super("Squiruff",
                Type.NORMAL,
                new Stats(35,
                        52,
                        48,
                        30,
                        40,
                        45),
                List.of(Ability.PICKUP,Ability.RUN_AWAY), Ability.FLUFFY,
                5, 41,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Squiruff are entirely scatterbrained 'Mons-- Often picking up things and losing them within the same moment. Often, Squiruff fight among themselves."),
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
           setLangFileName("Squiruff");

    }


}
