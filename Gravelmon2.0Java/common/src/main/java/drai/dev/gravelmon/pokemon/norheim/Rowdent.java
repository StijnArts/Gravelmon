package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Rowdent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rowdent() {
        super("Rowdent",
                Type.NORMAL,Type.DRAGON,
                new Stats(62,
                        84,
                        60,
                        78,
                        90,
                        45),
                List.of(Ability.OUTBURST,Ability.GUTS,Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evo Dragon TailSTAB Dragon"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rowdent");

    }


}
