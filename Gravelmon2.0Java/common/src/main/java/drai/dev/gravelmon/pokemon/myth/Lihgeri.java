package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Lihgeri extends Pokemon {
    public Lihgeri() {
        super("Lihgeri",
                Type.FAIRY, Type.ELECTRIC,
                new Stats(90,90,110,150,130,80),
                List.of(Ability.ANGER_POINT), Ability.ANGER_POINT,
                12, 1133,
                new Stats(0,0,0,0,1,0), 3,
                -1,
                250, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Lihgeri is said to be the guardian of Light, no one has ever seen it in person."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUNCH, 1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, 45),
                        new MoveLearnSetEntry(Move.ICE_FANG, 46),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 46),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 46),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 48),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 51),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, 54),
                        new MoveLearnSetEntry(Move.MOONBLAST, 57),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 59),
                        new MoveLearnSetEntry(Move.FISSURE, 63),
                        new MoveLearnSetEntry(Move.THUNDER, 67),
                        new MoveLearnSetEntry(Move.DARK_VOID, 71),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, 75)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
