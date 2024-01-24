package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Beatroot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beatroot() {
        super("Beatroot",
                Type.GROUND,Type.FIGHTING,
                new Stats(95,
                        110,
                        80,
                        60,
                        75,
                        75),
                List.of(Ability.OWN_TEMPO,Ability.IRON_FIST,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An unwanted guest among farmers. Beatroot turns the soil red when angered, destroying crops in its rage. Beatroot's hands and the stem on its head has been cut off by its primary enemy, Moleheimer."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.MAGNITUDE,13),
                        new MoveLearnSetEntry(Move.BIDE,19),
                        new MoveLearnSetEntry(Move.BULK_UP,24),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,29),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,36),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,40),
                        new MoveLearnSetEntry(Move.ROTOTILLER,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,50),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,58),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,68),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beatroot");

    }


}
