package drai.dev.gravelmon.pokemon.insurgence.delta;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class DeltaDitto extends Pokemon {
    public DeltaDitto(String name, Aspect aspect) {
        super(name, aspect,"DeltaDitto",
                Type.WATER,
                new Stats(48, 48,48,48,48,48),
                List.of(Ability.PROTEAN), Ability.PROTEAN,
                3, 40,
                new Stats(1, 0, 0, 0, 0, 0), 35,
                0.5,
                100, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DELTA_DITTO, EggGroup.DITTO),
                List.of("A Delta Species discovered by EchoTheThird. When rearranging its cell structure to transform itself, it sometimes makes a mistake and becomes a different type."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRANSFORM,1),
                        new MoveLearnSetEntry(Move.MORPH,1),
                        new MoveLearnSetEntry(Move.RETROGRADE,1),
                        new MoveLearnSetEntry(Move.METRONOME,10),
                        new MoveLearnSetEntry(Move.COPYCAT,20),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,30),
                        new MoveLearnSetEntry(Move.ME_FIRST,40),
                        new MoveLearnSetEntry(Move.MIMIC,50),
                        new MoveLearnSetEntry(Move.METRONOME,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor")
                        ),
                List.of(Label.GEN1, Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 35, 10.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.34, 0.3,
                List.of());
        this.setLangFileName("Ditto");
        this.setPortraitXYZ(0, 1.8, 0);
        this.setModeled(true);
        this.setBaseScale(1);
        this.setHitbox(0.5,0.6);
    }
}
