package drai.dev.gravelmon.pokemon.insurgence.delta;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class DeltaRuinBeldum extends Pokemon {
    public DeltaRuinBeldum(int dexNo) {
        super(dexNo,"DeltaRuinBeldum",
                Type.GRASS, Type.ROCK,
                new Stats(40, 55, 80, 35, 60, 30),
                List.of(Ability.STURDY), Ability.ROCK_HEAD,
                6, 952,
                new Stats(0,0,1,0,0,0), 3,
                -1,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by LunarDusk and Cowctus. It is said that beneath its rough exterior exists a crystal shard of unimaginable value."),
                List.of(new EvolutionEntry("deltaruinmetang", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.HOLD_BACK,"tutor")
                        ),
                List.of(Label.GEN3,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING, "true"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Beldum");
        this.setCanFly(true);
        this.setPortraitXYZ(0,1.8,0);
    }
}
