package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Siberizen extends drai.dev.data.pokemon.Pokemon {
    public Siberizen() {
        super("Siberizen",
                Type.ICE, Type.DARK,
                new Stats(80,
                        135,
                        70,
                        90,
                        70,
                        110),
                List.of(Ability.SNOW_CLOAK,Ability.ICE_BODY,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                13, 165,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Known as the judge of the north, Siberizen is a powerful yet wise Pokemon. It chooses the fate of those found within its territory by its underlings."),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.MIST,7),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,10),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,13),
                        new MoveLearnSetEntry(Move.STOMP,16),
                        new MoveLearnSetEntry(Move.ICE_SHARD,20),
                        new MoveLearnSetEntry(Move.ASSURANCE,24),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,28),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,32),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,36),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,46),
                        new MoveLearnSetEntry(Move.MEGAHORN,50)                    ),
                List.of(Label.OROHNHAVAI
                ),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Siberizen");

    }


}
