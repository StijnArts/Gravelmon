package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Enamirth extends drai.dev.data.pokemon.Pokemon {
    public Enamirth() {
        super("Enamirth",
                Type.FAIRY, Type.ROCK,
                new Stats(90,
                        45,
                        125,
                        80,
                        125,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("'Enamirth symbiotically remove rotten teeth, consume them, and regrow healthy teeth for others. It loves eating bacteria and it makes its enamel armor strong.'"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 4),
                        new MoveLearnSetEntry(Move.CALM_MIND, 8),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, 12),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 16),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 21),
                        new MoveLearnSetEntry(Move.LIFE_DEW, 25),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 29),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, 35),
                        new MoveLearnSetEntry(Move.RECOVER, 39),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, 43),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 46),
                        new MoveLearnSetEntry(Move.MOONBLAST, 54),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 62)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Enamirth");

    }


}
