package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class furanea extends drai.dev.gravelmon.pokemon.Pokemon {
    public furanea() {
        super("furanea",
                Type.BUG,
                new Stats(50,
                        52,
                        46,
                        52,
                        48,
                        41),
                List.of(Ability.SWARM,Ability.COMPOUND_EYES), Ability.MOXIE,
                3, 109,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- String Shot Bug - Astonish Ghost 3 Constrict Normal 5 Spider Web Bug 8 Bug BiteSTAB Bug 10 InfestationSTAB Bug 13 Screech Normal 15 Fury Swipes Normal 19 Bite Dark 21 Shadow Sneak Ghost 25 Sucker Punch Dark 29 Scary Face Normal 35 Cross Poison Poison 40 Sticky Web Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.CONSTRICT,3),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,5),
                        new MoveLearnSetEntry(Move.BUG_BITE,8),
                        new MoveLearnSetEntry(Move.INFESTATION,10),
                        new MoveLearnSetEntry(Move.SCREECH,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,21),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,25),
                        new MoveLearnSetEntry(Move.SCARY_FACE,29),
                        new MoveLearnSetEntry(Move.CROSS_POISON,35),
                        new MoveLearnSetEntry(Move.STICKY_WEB,40)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("furanea");

    }


}
