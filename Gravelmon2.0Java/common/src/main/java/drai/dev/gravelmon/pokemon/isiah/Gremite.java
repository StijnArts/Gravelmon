package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gremite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gremite() {
        super("Gremite",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("militherm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.PURSUIT,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,11),
                        new MoveLearnSetEntry(Move.TWINEEDLE,16),
                        new MoveLearnSetEntry(Move.BEAT_UP,19),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,22),
                        new MoveLearnSetEntry(Move.FLAME_BURST,25),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,29),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.UTURN,37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,41),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,46),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,51),
                        new MoveLearnSetEntry(Move.FELL_STINGER,56),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,62),
                        new MoveLearnSetEntry(Move.OVERHEAT,68)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 15, 31, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gremite");

    }


}
