package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ekino extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ekino() {
        super("Ekino",
                Type.WATER,
                new Stats(60,
                        65,
                        40,
                        55,
                        45,
                        50),
                List.of(Ability.TORRENT), Ability.TORRENT,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Ekino are very well known to be courteous to people and Pokemon. They are high intelligent and want to impress their trainers. However, if they feel like a disappointment they will go hide and cry. When threatened, spikes come out their arms and they prepare to attack."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ekino");

    }


}
