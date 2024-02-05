package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Grivern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grivern() {
        super("Grivern",
                Type.GHOST,Type.FLYING,
                new Stats(25,
                        43,
                        40,
                        43,
                        40,
                        119),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A rare Pokemon, that can be seem zooming inside caverns. It is moderately weak, however it transforms into a terrifying beast at night."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.GUST,4),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,8),
                        new MoveLearnSetEntry(Move.PAYBACK,12),
                        new MoveLearnSetEntry(Move.HEX,16),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,20),
                        new MoveLearnSetEntry(Move.SPIT_UP,24),
                        new MoveLearnSetEntry(Move.STOCKPILE,24),
                        new MoveLearnSetEntry(Move.SWALLOW,24),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,29),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,32),
                        new MoveLearnSetEntry(Move.BATON_PASS,36),
                        new MoveLearnSetEntry(Move.TAILWIND,40),
                        new MoveLearnSetEntry(Move.EXPLOSION,44)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
