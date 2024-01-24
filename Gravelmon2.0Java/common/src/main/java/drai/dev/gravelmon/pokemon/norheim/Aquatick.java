package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Aquatick extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aquatick() {
        super("Aquatick",
                Type.BUG,Type.WATER,
                new Stats(70,
                        70,
                        50,
                        30,
                        35,
                        50),
                List.of(Ability.WATER_ABSORB), Ability.WATER_BUBBLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Bug BiteSTAB Bug - Water Sport Water - String Shot Bug 6 Leer Normal 12 Bite Dark 22 Sticky Web Bug 32 DiveSTAB Water 36 InfestationSTAB Bug 40 LiquidationSTAB Water 46 Rain Dance Water 52 Crunch Dark 60 Leech LifeSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.LEER,6),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.STICKY_WEB,22),
                        new MoveLearnSetEntry(Move.DIVE,32),
                        new MoveLearnSetEntry(Move.INFESTATION,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,40),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,46),
                        new MoveLearnSetEntry(Move.CRUNCH,52),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,60),
                        new MoveLearnSetEntry(Move.BUBBLE,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aquatick");

    }


}
