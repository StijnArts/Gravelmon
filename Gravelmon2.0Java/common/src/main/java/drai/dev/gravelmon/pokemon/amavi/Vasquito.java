package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Vasquito extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vasquito() {
        super("Vasquito",
                Type.BUG, Type.DARK,
                new Stats(135,
                        65,
                        45,
                        25,
                        55,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("mosveratu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.INFESTATION,6),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,14),
                        new MoveLearnSetEntry(Move.STUN_SPORE,18),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,21),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,26),
                        new MoveLearnSetEntry(Move.XSCISSOR,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,40),
                        new MoveLearnSetEntry(Move.LUNGE,48),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,53)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 23, 32, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
