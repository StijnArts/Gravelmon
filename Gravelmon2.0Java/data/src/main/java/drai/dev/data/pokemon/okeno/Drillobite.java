package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Drillobite extends drai.dev.data.pokemon.Pokemon {
    public Drillobite() {
        super("Drillobite",
                Type.ROCK, Type.GROUND,
                new Stats(42,
                        113,
                        103,
                        57,
                        67,
                        82),
                List.of(Ability.SAND_RUSH,Ability.JACKPOT,Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("This Pokemon can sense gold deposits in the soil. They are used in mining because of this—but should never be left unnatended, as they will feed on any rare minerals they come across."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.TOMBSTONER,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Drillobite");

    }


}
