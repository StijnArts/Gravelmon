package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Nectarmite extends drai.dev.data.pokemon.Pokemon {
    public Nectarmite() {
        super("Nectarmite",
                Type.BUG,
                new Stats(118,
                        80,
                        70,
                        51,
                        88,
                        93),
                List.of(Ability.POWERLEECH,Ability.SCAVENGE,Ability.REGENERATOR), Ability.REGENERATOR,
                12, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Nectarmite work diligently in their nests keeping out dangerous Pokemon, attacking intruders, and caring for their young. They cling to ceilings so when an unsuspecting foe walks by they can usher a sneak attack from above. They are able to absorb and add an organism's energy directly into their sap reserve."),
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
                        new MoveLearnSetEntry(Move.LUNGE,46)                    ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nectarmite");

    }


}
