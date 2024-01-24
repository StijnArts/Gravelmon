package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class CefiranSmeargle extends Pokemon {
    public CefiranSmeargle(int dexNo) {
        super(dexNo,"CefiranSmeargle",
                Type.NORMAL, Type.FIGHTING,
                new Stats(55,20,35,75,20,45),
                List.of(Ability.PRANKSTER), Ability.MOODY,
                12, 580,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKETCH, 1),
                        new MoveLearnSetEntry(Move.SKETCH, 11),
                        new MoveLearnSetEntry(Move.SKETCH, 21),
                        new MoveLearnSetEntry(Move.SKETCH, 31),
                        new MoveLearnSetEntry(Move.SKETCH, 41),
                        new MoveLearnSetEntry(Move.CARICATURE, 50),
                        new MoveLearnSetEntry(Move.SKETCH, 51),
                        new MoveLearnSetEntry(Move.SKETCH, 61),
                        new MoveLearnSetEntry(Move.SKETCH, 71),
                        new MoveLearnSetEntry(Move.SKETCH, 81),
                        new MoveLearnSetEntry(Move.SKETCH, 91)
                ),
                List.of(Label.GEN2,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 11, 25, 10, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Smeargle");
        setHasGenderDifferences(true);
    }
}
