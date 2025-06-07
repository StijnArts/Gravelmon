package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Munchilla extends drai.dev.data.pokemon.Pokemon {
    public Munchilla() {
        super("Munchilla",
                Type.NORMAL,
                new Stats(101,
                        72,
                        84,
                        43,
                        98,
                        20),
                List.of(Ability.GLUTTONY,Ability.THICK_FAT), Ability.CHEEK_POUCH,
                0, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                146, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When its stomach is full, it finds it difficult to fight. If it is unable to find food, it will go on a rampage until it has eaten. Its snores or the rumblings of its hungry gut may be mistaken for its cries."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.BIDE,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,11),
                        new MoveLearnSetEntry(Move.CRUNCH,16),
                        new MoveLearnSetEntry(Move.SUPER_FANG,18)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Munchilla");

    }


}
