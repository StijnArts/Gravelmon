package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Summojin extends drai.dev.data.pokemon.Pokemon {
    public Summojin() {
        super("Summojin",
                Type.GHOST, Type.PSYCHIC,
                new Stats(85,
                        33,
                        44,
                        97,
                        105,
                        97),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,13),
                        new MoveLearnSetEntry(Move.HELPING_HAND,16),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,19),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,21),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,26),
                        new MoveLearnSetEntry(Move.PURSUIT,30),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,35),
                        new MoveLearnSetEntry(Move.ROYALFLUSH,39),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,41),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,45),
                        new MoveLearnSetEntry(Move.PSIBULLET,48),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,50),
                        new MoveLearnSetEntry(Move.HAPPY_HOUR,53),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,55),
                        new MoveLearnSetEntry(Move.STORED_POWER,59)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Summojin");

    }


}
