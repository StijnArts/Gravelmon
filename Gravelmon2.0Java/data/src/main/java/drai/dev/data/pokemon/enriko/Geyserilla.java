package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Geyserilla extends drai.dev.data.pokemon.Pokemon {
    public Geyserilla() {
        super("Geyserilla",
                Type.ICE, Type.FIRE,
                new Stats(78,
                        100,
                        70,
                        70,
                        60,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,18),
                        new MoveLearnSetEntry(Move.FLASH,20),
                        new MoveLearnSetEntry(Move.AGILITY,23),
                        new MoveLearnSetEntry(Move.FLAME_BURST,26),
                        new MoveLearnSetEntry(Move.ICYCHARGE,28),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,32),
                        new MoveLearnSetEntry(Move.BOUNCE,34),
                        new MoveLearnSetEntry(Move.LIGHTUP,39),
                        new MoveLearnSetEntry(Move.ICE_BEAM,41),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,45),
                        new MoveLearnSetEntry(Move.METEORSHOWER,48),
                        new MoveLearnSetEntry(Move.ACROBATICS,51),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,53),
                        new MoveLearnSetEntry(Move.BLIZZARD,55)                 ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Geyserilla");

    }


}
