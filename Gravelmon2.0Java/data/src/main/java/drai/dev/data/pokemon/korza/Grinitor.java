package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grinitor extends drai.dev.data.pokemon.Pokemon {
    public Grinitor() {
        super("Grinitor",
                Type.GROUND,
                new Stats(87,
                        103,
                        86,
                        64,
                        70,
                        115),
                List.of(Ability.SAND_VEIL,Ability.DRY_SKIN), Ability.SAND_FORCE,
                14, 613,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                236, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Grinitors are very powerful, capable of creating large craters in the earth. A local story says that a group of Grinitor created the bed of what is now the Lake of Korza."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,4),
                        new MoveLearnSetEntry(Move.MUD_SHOT,7),
                        new MoveLearnSetEntry(Move.MUD_SPORT,13),
                        new MoveLearnSetEntry(Move.DIG,18),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,23),
                        new MoveLearnSetEntry(Move.SANDSTORM,27),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,31),
                        new MoveLearnSetEntry(Move.SAND_TOMB,37),
                        new MoveLearnSetEntry(Move.GLARE,43),
                        new MoveLearnSetEntry(Move.SANDSHOT,48),
                        new MoveLearnSetEntry(Move.STOCKPILE,51),
                        new MoveLearnSetEntry(Move.SWALLOW,51),
                        new MoveLearnSetEntry(Move.SPIT_UP,51),
                        new MoveLearnSetEntry(Move.RECOVER,55),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,58),
                        new MoveLearnSetEntry(Move.FISSURE,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Grinitor");

    }


}
