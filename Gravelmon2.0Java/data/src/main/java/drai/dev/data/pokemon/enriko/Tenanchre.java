package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tenanchre extends drai.dev.data.pokemon.Pokemon {
    public Tenanchre() {
        super("Tenanchre",
                Type.GHOST,
                new Stats(130,
                        70,
                        79,
                        97,
                        65,
                        32),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                34, 165,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Significant paranormal activity inside a house has turned the house itself into a ghostly Pokemon. Furniture and pipes inside the house form its inner workings."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,18),
                        new MoveLearnSetEntry(Move.POISON_FANG,22),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.HYPNOSIS,30),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,35),
                        new MoveLearnSetEntry(Move.NIGHTMARE,39),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,42),
                        new MoveLearnSetEntry(Move.PUNISHMENT,48),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,53),
                        new MoveLearnSetEntry(Move.MEMENTO,57),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,62)              ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tenanchre");

    }


}
