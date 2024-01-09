package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cuspide extends Pokemon {
    public Cuspide() {
        super("Cuspide",
                Type.BUG, Type.DARK,
                new Stats(47,
                        65,
                        77,
                        38,
                        47,
                        46),
                List.of(Ability.UNNERVE, Ability.BATTLE_ARMOR), Ability.SAND_VEIL,
                1, 2,
                new Stats(0,0,1,0,0,0), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Scientists have found that its exoskeleton has a similar composition to tooth enamel. For good health, it should be brushed twice daily."),
                List.of(new EvolutionEntry("tarandible", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"cobblemon:razor_fang\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.PROTECT,17)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
