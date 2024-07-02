package drai.dev.gravelmon.pokemon.blazingemerald;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class Metunn extends Pokemon {
    public Metunn() {
        super("Metunn",
                Type.PSYCHIC, Type.GHOST,
                new Stats(200, 120, 180, 120, 180, 200),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                UnitConverter.feetToMeters(2, 9), UnitConverter.lbsToKg(1110),
                new Stats(0,3,0,0,0,0), 60,
                -1,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1)
                ),
                List.of(Label.BLAZING_EMERALD, Label.JOKE),
                1, List.of(
                        new ItemDrop("gravelmon:ancient_glyph",10, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 70, 100, 0.0001, List.of(
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.19, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setPreEvolution("unown");
        this.setCanFly(true);
        addAdditionalEvolution("unown", new EvolutionEntry("metunn", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:ancient_glyph"));
    }
}
