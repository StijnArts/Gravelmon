package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Doodloo extends Pokemon {
    public Doodloo() {
        super("Doodloo",
                Type.NORMAL,
                new Stats(70, 30, 45, 30, 35, 65),
                List.of(Ability.OWN_TEMPO), Ability.LIMBER,
                8, 297,
                new Stats(1,0,0,0,0,0), 75,
                0.5,
                98, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.HUMAN_LIKE),
                List.of("What looks like a face is actually scribbles drawn with berry juice. Its real face is on its stomach."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKETCH,1),
                        new MoveLearnSetEntry(Move.SKETCH,11),
                        new MoveLearnSetEntry(Move.SKETCH,21),
                        new MoveLearnSetEntry(Move.SKETCH,31),
                        new MoveLearnSetEntry(Move.SKETCH,41),
                        new MoveLearnSetEntry(Move.SKETCH,51),
                        new MoveLearnSetEntry(Move.SKETCH,61),
                        new MoveLearnSetEntry(Move.SKETCH,71),
                        new MoveLearnSetEntry(Move.SKETCH,81),
                        new MoveLearnSetEntry(Move.SKETCH,91)
                        ),
                List.of(Label.VEGA),
                0, List.of(), SpawnContext.GROUNDED, SpawnPool.RARE, 16, 44, 0.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day")
                ), List.of(),
                List.of(SpawnPreset.RUINED_STRUCTURES),
                0.4, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setModeled(true);
        this.setBaseScale(0.9);
    }
}
