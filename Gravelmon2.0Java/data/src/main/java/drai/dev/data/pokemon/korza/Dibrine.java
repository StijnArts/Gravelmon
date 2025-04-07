package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dibrine extends drai.dev.data.pokemon.Pokemon {
    public Dibrine() {
        super("Dibrine",
                Type.WATER,Type.GHOST,
                new Stats(83,
                        69,
                        75,
                        114,
                        110,
                        84),
                List.of(Ability.TORRENT), Ability.CLEAR_BODY,
                14, 284,
                new Stats(0,0,0,2,1,0), 45,
                0.875,
                240, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Majestic and revered by many, seen as a symbol of peace and guidance. Dibrine will protect its trainer from any danger, at any cost."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,7),
                        new MoveLearnSetEntry(Move.ASTONISH,10),
                        new MoveLearnSetEntry(Move.CONFUSION,14),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,17),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.HEX,27),
                        new MoveLearnSetEntry(Move.SPITE,31),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,34),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,39),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,43),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.PSYCHIC,52),
                        new MoveLearnSetEntry(Move.CALM_MIND,56),
                        new MoveLearnSetEntry(Move.HAZE,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dibrine");

    }


}
