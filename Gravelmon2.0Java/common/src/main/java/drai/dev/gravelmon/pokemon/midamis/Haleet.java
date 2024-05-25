package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Haleet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Haleet() {
        super("Haleet",
                Type.FAIRY, Type.ICE,
                new Stats(55,
                        65,
                        45,
                        65,
                        45,
                        65),
                List.of(Ability.WONDER_GUARD), Ability.WONDER_GUARD,
                6, 165,
                new Stats(0,0,0,1,0,1), 45,
                0.75,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Haleet are protected by a strange shield, the origins of the shield are unconfirmed, as is much about this Pokemon. What is known, is that they can be quite aggressive, although that is partly due to the style of training they do with their Trainers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SNOWSCAPE,1),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,6),
                        new MoveLearnSetEntry(Move.ICE_SHARD,9),
                        new MoveLearnSetEntry(Move.UPROAR,13),
                        new MoveLearnSetEntry(Move.MOONLIGHT,17),
                        new MoveLearnSetEntry(Move.REFLECT,22),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,27),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,33),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,39),
                        new MoveLearnSetEntry(Move.ICE_BEAM,46),
                        new MoveLearnSetEntry(Move.ENDURE,53),
                        new MoveLearnSetEntry(Move.AVALANCHE,61)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 32, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Haleet");

    }


}
