package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Larvee extends drai.dev.data.pokemon.Pokemon {
    public Larvee() {
        super("Larvee",
                Type.BUG,
                new Stats(60,
                        45,
                        45,
                        45,
                        45,
                        40),
                List.of(Ability.HONEY_GATHER), Ability.RATTLED,
                3, 18,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Larvee is well taken care of inside its family hive, helpless until evolution. Its favorite food is the honey made by sister Hunibees."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,3),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,6),
                        new MoveLearnSetEntry(Move.ROLLOUT,11),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.YAWN,20),
                        new MoveLearnSetEntry(Move.REST,23)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Larvee");

    }


}
