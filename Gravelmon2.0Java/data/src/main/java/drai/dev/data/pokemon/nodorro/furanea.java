package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class furanea extends drai.dev.data.pokemon.Pokemon {
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
                List.of(new EvolutionEntry("taranchusk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
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
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(6).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("furanea");

    }


}
