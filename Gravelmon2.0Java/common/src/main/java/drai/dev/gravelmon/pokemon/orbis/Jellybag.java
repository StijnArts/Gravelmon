package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Jellybag extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jellybag() {
        super("Jellybag",
                Type.GHOST,
                new Stats(40,
                        30,
                        35,
                        55,
                        65,
                        55),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                2, 1,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                49, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Jellybag are unique in the way they dispose of every item they see, no matter what it is."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jellybag");

    }


}
