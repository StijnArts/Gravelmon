package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Esturgeon extends drai.dev.data.pokemon.Pokemon {
    public Esturgeon() {
        super("Esturgeon",
                Type.WATER,Type.GROUND,
                new Stats(80,
                        80,
                        100,
                        85,
                        70,
                        70),
                List.of(Ability.FILTER,Ability.SWIFT_SWIM), Ability.STATIC,
                16, 1025,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Esturgeon is very rarely seen in the wild, as they live only in the deepest, murkiest areas of the Lake. Many fisherman tell stories of when they caught a glimpse of one in the water, or almost catching one."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,4),
                        new MoveLearnSetEntry(Move.WATER_PULSE,9),
                        new MoveLearnSetEntry(Move.MUD_SHOT,14),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,20),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,25),
                        new MoveLearnSetEntry(Move.MUD_BOMB,31),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,37),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,42),
                        new MoveLearnSetEntry(Move.SCALD,47),
                        new MoveLearnSetEntry(Move.EARTH_POWER,53),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57),
                        new MoveLearnSetEntry(Move.FISSURE,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Esturgeon");

    }


}
