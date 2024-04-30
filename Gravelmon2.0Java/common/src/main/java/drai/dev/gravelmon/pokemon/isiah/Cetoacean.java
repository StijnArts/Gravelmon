package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cetoacean extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cetoacean() {
        super("Cetoacean",
                Type.GHOST, Type.WATER,
                new Stats(121,
                        55,
                        75,
                        65,
                        75,
                        44),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                28, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,1),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,10),
                        new MoveLearnSetEntry(Move.HAZE,14),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,17),
                        new MoveLearnSetEntry(Move.MIMIC,22),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,26),
                        new MoveLearnSetEntry(Move.ENCORE,32),
                        new MoveLearnSetEntry(Move.HEX,35),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,41),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,45),
                        new MoveLearnSetEntry(Move.POLTERGEIST,51),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,60)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 31, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Cetoacean");

    }


}
