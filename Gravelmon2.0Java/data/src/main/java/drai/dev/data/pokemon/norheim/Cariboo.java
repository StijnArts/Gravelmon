package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Cariboo extends drai.dev.data.pokemon.Pokemon {
    public Cariboo() {
        super("Cariboo",
                Type.NORMAL,
                new Stats(65,
                        60,
                        50,
                        65,
                        70,
                        65),
                List.of(Ability.EARLY_BIRD), Ability.INSOMNIA,
                7, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("spectrelk", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.SPITE,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,14),
                        new MoveLearnSetEntry(Move.HAZE,19),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,22),
                        new MoveLearnSetEntry(Move.STOMP,26),
                        new MoveLearnSetEntry(Move.MIST,30),
                        new MoveLearnSetEntry(Move.HEX,33),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,36),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,42),
                        new MoveLearnSetEntry(Move.LIFE_DEW,47),
                        new MoveLearnSetEntry(Move.HORN_LEECH,53),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,58),
                        new MoveLearnSetEntry(Move.LAST_RESORT,64),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(9)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cariboo");

    }


}
