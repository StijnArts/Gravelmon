package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Handren extends drai.dev.data.pokemon.Pokemon {
    public Handren() {
        super("Handren",
                Type.GRASS,
                new Stats(65,
                        52,
                        78,
                        84,
                        102,
                        74),
                List.of(Ability.CHLOROPHYLL), Ability.CLEAR_BODY,
                4, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.0,
                159, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The green hand-like goo that covers Handren is loaded with life-promoting nutrients, keeping the core alive. This goo seems to be made up of many tiny Planten."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,1),
                        new MoveLearnSetEntry(Move.GROWTH,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 11, 34, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
