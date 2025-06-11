package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mesmoth extends drai.dev.data.pokemon.Pokemon {
    public Mesmoth() {
        super("Mesmoth",
                Type.BUG, Type.PSYCHIC,
                new Stats(73,
                        53,
                        53,
                        93,
                        93,
                        83),
                List.of(Ability.NO_GUARD), Ability.MAGIC_GUARD,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The patterns on Mesmoth's wings can make those who look directly fall into trance. Anything wrapped into its silk will be put into a short coma."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.POWDER,8),
                        new MoveLearnSetEntry(Move.ENDURE,15),
                        new MoveLearnSetEntry(Move.HYPNOSIS,22),
                        new MoveLearnSetEntry(Move.PSYBEAM,25),
                        new MoveLearnSetEntry(Move.INFESTATION,29),
                        new MoveLearnSetEntry(Move.STICKY_WEB,31),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,43),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,47)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Mesmoth");

    }


}
