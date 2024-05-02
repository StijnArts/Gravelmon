package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Glumexin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glumexin() {
        super("Glumexin",
                Type.POISON, Type.ELECTRIC,
                new Stats(78,
                        54,
                        81,
                        105,
                        102,
                        25),
                List.of(Ability.GOOEY,Ability.STICKY_HOLD,Ability.ANALYTIC), Ability.ANALYTIC,
                7, 165,
                new Stats(0,0,0,2,0,0), 100,
                0.5,
                160, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("With evolution, its brain drastically increased in size, and its shell now covers its head to protect it. It emits strange, sickening radio waves from its antennae to direct Glumence, making them leave sticky trails in unnerving patterns along the ground."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,6),
                        new MoveLearnSetEntry(Move.CHARGE,11),
                        new MoveLearnSetEntry(Move.SLUDGE,15),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,18),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,20),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,25),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,27),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,31),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.CORROSIONWAVE,46),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,52),
                        new MoveLearnSetEntry(Move.PSYSHOCK,60),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 23, 41, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glumexin");

    }


}
