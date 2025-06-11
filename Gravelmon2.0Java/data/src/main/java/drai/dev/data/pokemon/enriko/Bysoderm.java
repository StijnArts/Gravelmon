package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bysoderm extends drai.dev.data.pokemon.Pokemon {
    public Bysoderm() {
        super("Bysoderm",
                Type.DARK, Type.ICE,
                new Stats(98,
                        65,
                        75,
                        87,
                        87,
                        56),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They voraciously consume whatever they can get their tentacles on before migrating. Bones can be seen digesting through its transparent skin."),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.TRIPLE_AXEL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,8),
                        new MoveLearnSetEntry(Move.HAZE,12),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,18),
                        new MoveLearnSetEntry(Move.ICE_BALL,26),
                        new MoveLearnSetEntry(Move.MOONLIGHT,32),
                        new MoveLearnSetEntry(Move.SNOWBALLPELT,38),
                        new MoveLearnSetEntry(Move.SNATCH,46),
                        new MoveLearnSetEntry(Move.BOUNCE,50),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,56),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,60),
                        new MoveLearnSetEntry(Move.MIST,68)            ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(46)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bysoderm");

    }


}
