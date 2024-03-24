package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Glumence extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glumence() {
        super("Glumence",
                Type.POISON,Type.ELECTRIC,
                new Stats(52,
                        30,
                        58,
                        75,
                        65,
                        20),
                List.of(Ability.GOOEY,Ability.STICKY_HOLD,Ability.ANALYTIC), Ability.ANALYTIC,
                3, 165,
                new Stats(0,0,0,1,0,0), 225,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("The trails they leave behind is a mixture of toxins and a glue-like substance containing electricity. Touching the trail will shock you, and the toxins along with it may make you very ill. Many Glumence set trails around their area to prevent intruders. They illuminate forests, disrupting the natural cycles of the plants and Pokemon that live there."),
                List.of(new EvolutionEntry("glumexin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,6),
                        new MoveLearnSetEntry(Move.CHARGE,11),
                        new MoveLearnSetEntry(Move.SLUDGE,15),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,18),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,20),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,24),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,26),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,30),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,34),
                        new MoveLearnSetEntry(Move.PSYCHIC,38),
                        new MoveLearnSetEntry(Move.CORROSIONWAVE,41),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,45),
                        new MoveLearnSetEntry(Move.PSYSHOCK,51),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glumence");

    }


}
