package drai.dev.data.pokemon.norheim;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bwairy extends drai.dev.data.pokemon.Pokemon {
    public Bwairy(Stats stats) {
        super("Bwairy",
                Type.FAIRY, Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,8),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,15),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,22),
                        new MoveLearnSetEntry(Move.HELPING_HAND,26),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.ACROBATICS,31),
                        new MoveLearnSetEntry(Move.XSCISSOR,35),
                        new MoveLearnSetEntry(Move.MOONLIGHT,39),
                        new MoveLearnSetEntry(Move.UTURN,43),
                        new MoveLearnSetEntry(Move.POWDER,47),
                        new MoveLearnSetEntry(Move.MOONBLAST,52)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OLD_GROWTH_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Bwairy");

    }


}
