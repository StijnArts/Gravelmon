package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Arblizen extends drai.dev.data.pokemon.Pokemon {
    public Arblizen() {
        super("Arblizen",
                Type.ICE, Type.NORMAL,
                new Stats(60,
                        100,
                        55,
                        70,
                        55,
                        90),
                List.of(Ability.SNOW_CLOAK,Ability.ICE_BODY,Ability.RIVALRY), Ability.RIVALRY,
                11, 165,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They work together in a pack to hunt down prey. As food goes scarce and tension rises, packs of Arblizen will form rivalries with other packs."),
                List.of(new EvolutionEntry("siberizen", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.CRUNCH.getName())))),
                List.of(    new MoveLearnSetEntry(Move.POWDER_SNOW,1),
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
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Arblizen");

    }


}
