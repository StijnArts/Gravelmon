package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Spinister extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spinister() {
        super("Spinister",
                Type.GHOST, Type.BUG,
                new Stats(90,
                        75,
                        55,
                        115,
                        95,
                        52),
                List.of(Ability.ANALYTIC,Ability.FRISK,Ability.JUSTIFIED), Ability.JUSTIFIED,
                14, 165,
                new Stats(0,0,0,2,0,0), 60,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Spinister are oddly compassionate towards young and baby Pokemon, they even often care for those that they have recently orphaned- but once they reach of age Spinister has no qualms dining the child they raised."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POLTERGEIST,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,4),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,19),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,22),
                        new MoveLearnSetEntry(Move.HEX,27),
                        new MoveLearnSetEntry(Move.SNATCH,32),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,38),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,45),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,50),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,54)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spinister");

    }


}
