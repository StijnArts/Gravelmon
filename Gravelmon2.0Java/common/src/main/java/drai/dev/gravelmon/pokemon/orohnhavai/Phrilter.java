package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Phrilter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phrilter() {
        super("Phrilter",
                Type.FIRE,
                new Stats(70,
                        125,
                        65,
                        100,
                        60,
                        80),
                List.of(Ability.ADAPTABILITY), Ability.FLAME_BODY,
                10, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                210, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Residing near volcanic areas, it opens its frills to radiate extreme heat from the stored lava it consumes. A group of Phrilter are known to cause heatwaves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,13),
                        new MoveLearnSetEntry(Move.WORK_UP,17),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,21),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,25),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,29),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,33),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,37),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,41),
                        new MoveLearnSetEntry(Move.OVERHEAT,45),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 28, 45, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Phrilter");

    }


}
