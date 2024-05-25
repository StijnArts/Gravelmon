package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Sheagull extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sheagull() {
        super("Sheagull",
                Type.NORMAL, Type.FLYING,
                new Stats(102,
                        65,
                        88,
                        73,
                        90,
                        70),
                List.of(Ability.KEEN_EYE,Ability.SERENE_GRACE), Ability.BIG_PECKS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Sheagull is an occupied monarch, being both a ruling queen while giving out flight classes to any bird Pokémon. Her nature is nurturing and kind hearted."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.ROOST,2),
                        new MoveLearnSetEntry(Move.CHARM,2),
                        new MoveLearnSetEntry(Move.DETECT,8),
                        new MoveLearnSetEntry(Move.MIMIC,11),
                        new MoveLearnSetEntry(Move.CHATTER,22),
                        new MoveLearnSetEntry(Move.ME_FIRST,23),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,26),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,34),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,38),
                        new MoveLearnSetEntry(Move.DRILL_PECK,42),
                        new MoveLearnSetEntry(Move.FLATTER,45),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,48),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,50),
                        new MoveLearnSetEntry(Move.HURRICANE,56),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,64)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sheagull");

    }


}
