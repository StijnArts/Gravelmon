package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Freknight extends Pokemon {
    public Freknight() {
        super("Freknight",
                Type.DARK, Type.STEEL,
                new Stats(110,125,110,95,100,110),
                List.of(Ability.ANGER_POINT), Ability.ANGER_POINT,
                12, 1133,
                new Stats(0,0,0,0,1,0), 3,
                -1,
                250, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Freknight is said to be the guardian of Darkness, no one has ever seen it in person."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUNCH, 1),
                        new MoveLearnSetEntry(Move.PURSUIT, 1),
                        new MoveLearnSetEntry(Move.DARK_PULSE, 1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 45),
                        new MoveLearnSetEntry(Move.ICE_FANG, 46),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 46),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 46),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 48),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 51),
                        new MoveLearnSetEntry(Move.DOUBLE_IRON_BASH, 54),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, 57),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 59),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, 63),
                        new MoveLearnSetEntry(Move.THUNDER, 67),
                        new MoveLearnSetEntry(Move.DARK_VOID, 71),
                        new MoveLearnSetEntry(Move.FACADE, 75)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
