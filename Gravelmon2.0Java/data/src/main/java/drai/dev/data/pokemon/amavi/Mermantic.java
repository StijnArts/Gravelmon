package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mermantic extends drai.dev.data.pokemon.Pokemon {
    public Mermantic() {
        super("Mermantic",
                Type.POISON, Type.ROCK,
                new Stats(85,
                        55,
                        120,
                        100,
                        105,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,7),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,11),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,15),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,18),
                        new MoveLearnSetEntry(Move.VENOSHOCK,22),
                        new MoveLearnSetEntry(Move.SANDSTORM,26),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,33),
                        new MoveLearnSetEntry(Move.POWER_GEM,39),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,44),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,50)                 ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setAvoidsLand(true);
        setCanBreathUnderwater(true);

    }


}
