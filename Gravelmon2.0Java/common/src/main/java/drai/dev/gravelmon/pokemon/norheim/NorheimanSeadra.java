package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanSeadra extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanSeadra() {
        super("Seadra",
                Type.DRAGON,
                new Stats(55,
                        60,
                        65,
                        110,
                        65,
                        85),
                List.of(Ability.SWIFT_SWIM,Ability.SNIPER,Ability.OUTBURST), Ability.OUTBURST,
                8, 165,
                new Stats(0,0,0,2,0,0), 65,
                0.875,
                154, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of(""),
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
           setLangFileName("Seadra");

    }


}
