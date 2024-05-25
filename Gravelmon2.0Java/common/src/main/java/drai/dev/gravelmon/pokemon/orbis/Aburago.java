package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Aburago extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aburago() {
        super("Aburago",
                Type.FIRE, Type.GHOST,
                new Stats(30,
                        20,
                        25,
                        60,
                        40,
                        60),
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                3, 0,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                68, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Aburago travel streets at night in search for the flames of lamps and candles to consume. People often light candles in their homes which are rudely put out by a passing Aburago."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.HEX,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aburago");

    }


}
