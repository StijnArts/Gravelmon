package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class DittoX extends Pokemon {
    public DittoX(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"DittoX",
                Type.DARK,
                new Stats(48, 48,48,48,48,48),
                List.of(Ability.LIMBER), Ability.IMPOSTER,
                3, 40,
                new Stats(1,0,0,0,0,0), 35,
                0.875,
                101, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DITTO_X),
                List.of("Following a great number of experiments, it became extremely unstable, but it developed the ability to Transform even without seeing its target."),
                List.of(),
                List.of(
                        //TODO replace transform with X transform
                        new MoveLearnSetEntry(Move.X_TRANSFORM,1),
                        new MoveLearnSetEntry(Move.TRANSFORM,1)
                        ),
                List.of(Label.XENOVERSE, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 70, 75, 3.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setLangFileName("Ditto");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setModeled(true);
        this.setBaseScale(1);
        this.setHitbox(0.5,0.6);
    }
}
