package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orialisk extends drai.dev.data.pokemon.Pokemon {
    public Orialisk() {
        super("Orialisk",
                Type.STEEL,Type.GHOST,
                new Stats(75,
                        60,
                        100,
                        55,
                        80,
                        30),
                List.of(Ability.HEATPROOF,Ability.STEELWORKER), Ability.LIGHTNING_ROD,
                20, 1000,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                80, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("The first sighting of an Orialisk was in a distant Pokémon Tower. A departing spirit inhabits the memorial, causing it to have a mind of its own."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HEX,1),
                        new MoveLearnSetEntry(Move.CURSE,6),
                        new MoveLearnSetEntry(Move.SPITE,6),
                        new MoveLearnSetEntry(Move.GYRO_BALL,12),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,15),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,15),
                        new MoveLearnSetEntry(Move.METAL_BURST,19),
                        new MoveLearnSetEntry(Move.SAND_TOMB,20),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,22),
                        new MoveLearnSetEntry(Move.IRON_HEAD,26),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,30),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,32),
                        new MoveLearnSetEntry(Move.GRUDGE,35),
                        new MoveLearnSetEntry(Move.NIGHTMARE,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,50),
                        new MoveLearnSetEntry(Move.TOMBSTONER,55),
                        new MoveLearnSetEntry(Move.PERISH_SONG,60),
                        new MoveLearnSetEntry(Move.MEMENTO,60)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Orialisk");

    }


}
