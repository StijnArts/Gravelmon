package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Flintzie extends drai.dev.data.pokemon.Pokemon {
    public Flintzie() {
        super("Flintzie",
                Type.FIRE, Type.FAIRY,
                new Stats(30,
                        62,
                        30,
                        72,
                        40,
                        60),
                List.of(Ability.FLAME_BODY,Ability.FLASH_FIRE,Ability.VITAL_SPIRIT), Ability.VITAL_SPIRIT,
                8, 165,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Flintzie are commonly found in forests snacking on dry leaves and twigs. They make great companions for campers. But always be prepared as they emit errant sparks when feeling happy or excited."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.CUDDLE,10),
                        new MoveLearnSetEntry(Move.SWIFT,13),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,16),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.GROWTH,"tm"),
                        new MoveLearnSetEntry(Move.ZING_ZAP,"tm")                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flintzie");

    }


}
