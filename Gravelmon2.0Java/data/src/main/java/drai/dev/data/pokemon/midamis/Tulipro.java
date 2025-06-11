package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tulipro extends drai.dev.data.pokemon.Pokemon {
    public Tulipro() {
        super("Tulipro",
                Type.POISON, Type.PSYCHIC,
                new Stats(65,
                        50,
                        65,
                        110,
                        65,
                        65),
                List.of(Ability.UNAWARE), Ability.LEVITATE,
                10, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Proseed has blossomed into Tulipro, now becoming much more carefree instead of worrisome. If attacked, it will likely take a few seconds for it to even register the pain."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,7),
                        new MoveLearnSetEntry(Move.EMBARGO,10),
                        new MoveLearnSetEntry(Move.VENOSHOCK,15),
                        new MoveLearnSetEntry(Move.PSYBEAM,18),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,22),
                        new MoveLearnSetEntry(Move.TOXIC,29),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.TORMENT,44),
                        new MoveLearnSetEntry(Move.PSYCHIC,47),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,53),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,55),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,58),
                        new MoveLearnSetEntry(Move.HYPNOSIS,62),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,70)            ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tulipro");

    }


}
