package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pinksqueek extends drai.dev.data.pokemon.Pokemon {
    public Pinksqueek() {
        super("Pinksqueek",
                Type.FAIRY, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("pinkaboo", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,4),
                        new MoveLearnSetEntry(Move.COVET,8),
                        new MoveLearnSetEntry(Move.SPIT_UP,12),
                        new MoveLearnSetEntry(Move.STOCKPILE,12),
                        new MoveLearnSetEntry(Move.SWALLOW,12),
                        new MoveLearnSetEntry(Move.ROUND,16),
                        new MoveLearnSetEntry(Move.REST,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,24),
                        new MoveLearnSetEntry(Move.MIMIC,28),
                        new MoveLearnSetEntry(Move.GYRO_BALL,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44)
                ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pinksqueek");

    }


}
