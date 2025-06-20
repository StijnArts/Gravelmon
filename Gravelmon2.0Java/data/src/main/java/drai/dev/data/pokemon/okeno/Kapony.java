package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kapony extends drai.dev.data.pokemon.Pokemon {
    public Kapony() {
        super("Kapony",
                Type.FIGHTING,
                new Stats(49,
                        75,
                        54,
                        40,
                        37,
                        65),
                List.of(Ability.QUICK_FEET,Ability.INNER_FOCUS,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("In battle, it constantly moves in order to avoid attacks. When it finds an opening, it launches a powerful kick. A slap from its tail can knock out even an adult."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOLIDKICK,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.POWER_TRICK,"tm"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kapony");

    }


}
