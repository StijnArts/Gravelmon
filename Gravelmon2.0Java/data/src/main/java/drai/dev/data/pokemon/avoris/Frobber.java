package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Frobber extends drai.dev.data.pokemon.Pokemon {
    public Frobber() {
        super("Frobber",
                Type.DARK, Type.POISON,
                new Stats(85,
                        90,
                        65,
                        55,
                        75,
                        35),
                List.of(Ability.STICKY_HOLD,Ability.POISON_TOUCH,Ability.PICKPOCKET), Ability.PICKPOCKET,
                11, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They lurk in dark areas, waiting for prey to snare with their sticky webbed hands. Their toxin-laced webs progressively poisons their foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,8),
                        new MoveLearnSetEntry(Move.HYPNOSIS,13),
                        new MoveLearnSetEntry(Move.PAYBACK,15),
                        new MoveLearnSetEntry(Move.POISON_FANG,20),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,22),
                        new MoveLearnSetEntry(Move.THIEF,27),
                        new MoveLearnSetEntry(Move.SWAGGER,29),
                        new MoveLearnSetEntry(Move.VENOSHOCK,34),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,36),
                        new MoveLearnSetEntry(Move.CROSS_POISON,41),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,43),
                        new MoveLearnSetEntry(Move.TOXIC,48),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,50),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,55),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,57)
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Frobber");

    }


}
