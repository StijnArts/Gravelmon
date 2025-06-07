package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Honarchee extends drai.dev.data.pokemon.Pokemon {
    public Honarchee() {
        super("Honarchee",
                Type.BUG, Type.FIGHTING,
                new Stats(78,
                        113,
                        68,
                        83,
                        73,
                        105),
                List.of(Ability.QUEENLY_MAJESTY), Ability.QUEENLY_MAJESTY,
                13, 210,
                new Stats(0,1,0,1,0,0), 45,
                0.0,
                198, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Honarchee control whole colonies ordering younglings to create lavish structures from surrounding items. It produces a beautiful tasting royal jelly that is said to contain healing elements."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PERISH_SONG,1),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,1),
                        new MoveLearnSetEntry(Move.DEFEND_ORDER,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,1),
                        new MoveLearnSetEntry(Move.FELL_STINGER,1),
                        new MoveLearnSetEntry(Move.ATTRACT,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(32).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Honarchee");

    }


}
