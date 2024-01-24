package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Spiritnir extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spiritnir() {
        super("Spiritnir",
                Type.GHOST,Type.STEEL,
                new Stats(80,
                        80,
                        80,
                        100,
                        90,
                        140),
                List.of(Ability.CURSED_BODY), Ability.LIGHT_METAL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The grey steed of a God. Spiritnir can move its legs so fast that they appear as eight instead of four. It has been seen galloping faster than the wind on both land and on the surface of the sea."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spiritnir");

    }


}
