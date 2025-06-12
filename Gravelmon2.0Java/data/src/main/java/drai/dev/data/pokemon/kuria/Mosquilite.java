package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mosquilite extends drai.dev.data.pokemon.Pokemon {
    public Mosquilite() {
        super("Mosquilite",
                Type.BUG, Type.COSMIC,
                new Stats(65,
                        106,
                        80,
                        60,
                        50,
                        89),
                List.of(Ability.TINTED_LENS,Ability.DAZZLING), Ability.SIGNALBOOST,
                13, 3519,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Upon emerging, Mosquillite fly into the atmosphere and orbit the planet continuously. They send and receive signals, and sometimes shoot them deep into the unknown of space."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.INFESTATION,6),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,14),
                        new MoveLearnSetEntry(Move.STUN_SPORE,18),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,21),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,26),
                        new MoveLearnSetEntry(Move.XSCISSOR,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,40),
                        new MoveLearnSetEntry(Move.LUNGE,46)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Mosquilite");
        setCanFly(true);

    }


}
