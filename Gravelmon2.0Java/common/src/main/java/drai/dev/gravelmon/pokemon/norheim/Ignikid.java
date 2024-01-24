package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Ignikid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ignikid() {
        super("Ignikid",
                Type.FIRE,Type.FAIRY,
                new Stats(50,
                        65,
                        45,
                        80,
                        65,
                        80),
                List.of(Ability.ILLUMINATE), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ignikid has learned from a young age that playing with fire can be dangerous. They may however burn things out of curiosity."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ignikid");

    }


}
