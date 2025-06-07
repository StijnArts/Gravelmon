package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Anau extends drai.dev.data.pokemon.Pokemon {
    public Anau() {
        super("Anau",
                Type.ROCK,Type.ELECTRIC,
                new Stats(60,
                        60,
                        105,
                        99,
                        105,
                        38),
                List.of(Ability.ILLUMINATE,Ability.FILTER), Ability.MAGNET_PULL,
                10, 277,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                163, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("Folklore calls them the manifested spirits of miners, even though they've been sighted in caves since before mining began in the region. Anau eat many types of ore, preferring ones that conduct well, such as gold."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,7),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,10),
                        new MoveLearnSetEntry(Move.FLASH,13),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,17),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,22),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,25),
                        new MoveLearnSetEntry(Move.ION_DELUGE,28),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,31),
                        new MoveLearnSetEntry(Move.POWER_GEM,35),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,39),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,43),
                        new MoveLearnSetEntry(Move.RECOVER,47),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,52),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,57),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,63),
                        new MoveLearnSetEntry(Move.LOCKON,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Anau");

    }


}
