package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pharature extends drai.dev.data.pokemon.Pokemon {
    public Pharature() {
        super("Pharature",
                Type.NORMAL, Type.FLYING,
                new Stats(80,
                        102,
                        70,
                        88,
                        60,
                        86),
                List.of(Ability.KEEN_EYE,Ability.TANGLED_FEET), Ability.BIG_PECKS,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pharature is rarely around its young ones. Instead, this large bird soars the sky by itself, covering parts of the sun with its massive wingspread. This Pokémon is also the family emblem of the royal family of Ionia and is commonly seen on post cards as stamps."),
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
                        new MoveLearnSetEntry(Move.SKY_ATTACK,64)
                ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 32, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Pharature");

    }


}
