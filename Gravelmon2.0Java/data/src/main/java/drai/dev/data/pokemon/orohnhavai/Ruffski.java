package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Ruffski extends drai.dev.data.pokemon.Pokemon {
    public Ruffski() {
        super("Ruffski",
                Type.ICE, Type.NORMAL,
                new Stats(35,
                        70,
                        30,
                        40,
                        30,
                        65),
                List.of(Ability.SNOW_CLOAK,Ability.ICE_BODY,Ability.RIVALRY), Ability.RIVALRY,
                6, 165,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Because they are only found in northern areas, they like to play and run around all day to keep their body heat at a suitable temperature."),
                List.of(new EvolutionEntry("arblizen", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
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
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,38),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,46),
                        new MoveLearnSetEntry(Move.MEGAHORN,50)                    ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ruffski");

    }


}
