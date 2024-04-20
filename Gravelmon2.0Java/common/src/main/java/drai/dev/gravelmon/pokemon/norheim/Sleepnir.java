package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sleepnir extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sleepnir() {
        super("Sleepnir",
                Type.FIGHTING, Type.NORMAL,
                new Stats(70,
                        90,
                        75,
                        90,
                        85,
                        90),
                List.of(Ability.STAMINA,Ability.SCRAPPY,Ability.ZEN_MODE), Ability.ZEN_MODE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hypnotizing its foes with a determined glare, Sleepnir may cast unusual spells onto any opponent. An old man once witnessed this stock Pokemon walking around with eight legs. Perhaps it was due to its swift hooves?"),
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
           setLangFileName("Sleepnir");

    }


}
