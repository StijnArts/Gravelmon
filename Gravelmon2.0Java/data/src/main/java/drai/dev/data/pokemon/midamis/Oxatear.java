package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Oxatear extends drai.dev.data.pokemon.Pokemon {
    public Oxatear() {
        super("Oxatear",
                Type.WATER, Type.FIGHTING,
                new Stats(90,
                        115,
                        95,
                        75,
                        75,
                        85),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                19, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("A Pokemon that has said to have been recorded in scrolls by Ancient Egyptians. It was said that Oxatear brought rain to those places suffering of famine and plague. This could be true, as Oxatear is well known for their complicated Rain Dances, but no one is 100% sure."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,40),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,47),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,54),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSION,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Oxatear");

    }


}
