package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dracurrent extends drai.dev.data.pokemon.Pokemon {
    public Dracurrent() {
        super("Dracurrent",
                Type.WATER, Type.DRAGON,
                new Stats(84,
                        87,
                        76,
                        106,
                        78,
                        102),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                19, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dracurrent's ship-like body gives them easy passage across any sea. They can grow incredibly old and are quick to gather knowledge from their journeys. By swimming rapidly in circles they create whirlpools; a similar method to a Pokémon found in Norheim. Their draconic powers grows strong from the raging oceans."),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Dracurrent");

    }


}
