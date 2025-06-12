package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Wellmr extends drai.dev.data.pokemon.Pokemon {
    public Wellmr() {
        super("Wellmr",
                Type.PSYCHIC, Type.WATER,
                new Stats(97,
                        93,
                        93,
                        87,
                        187,
                        13),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                18, 165,
                new Stats(0,0,0,0,0,0), 20,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wellmír (UB Well) is located under the tree of Silyggdra. It's said to make any wish come true, unless you stumble across its destructive powers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WISH,1),
                        new MoveLearnSetEntry(Move.LOCKON,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.PSYBEAM,22),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,26),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,36),
                        new MoveLearnSetEntry(Move.STORED_POWER,42),
                        new MoveLearnSetEntry(Move.PSYCHIC,48),
                        new MoveLearnSetEntry(Move.LIFE_DEW,58),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,68),
                        new MoveLearnSetEntry(Move.POWER_WHIP,74)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
