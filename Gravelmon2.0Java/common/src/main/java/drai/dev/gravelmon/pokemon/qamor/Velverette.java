package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Velverette extends drai.dev.gravelmon.pokemon.Pokemon {
    public Velverette() {
        super("Velverette",
                Type.GHOST, Type.BUG,
                new Stats(45,
                        43,
                        30,
                        75,
                        40,
                        35),
                List.of(Ability.ANALYTIC,Ability.FRISK,Ability.JUSTIFIED), Ability.JUSTIFIED,
                3, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Velverette become easily envious of other Pokemon, no matter how petty and insignificant their desire may be."),
                List.of(new EvolutionEntry("spinister", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,4),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,19),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,22),
                        new MoveLearnSetEntry(Move.HEX,25),
                        new MoveLearnSetEntry(Move.SNATCH,29),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,38),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,42),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,46)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Velverette");

    }


}
