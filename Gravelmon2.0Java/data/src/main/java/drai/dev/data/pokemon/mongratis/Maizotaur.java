package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Maizotaur extends drai.dev.data.pokemon.Pokemon {
    public Maizotaur() {
        super("Maizotaur",
                Type.GRASS, Type.FIGHTING,
                new Stats(112,
                        98,
                        100,
                        92,
                        68,
                        65),
                List.of(Ability.OVERCOAT), Ability.OVERCOAT,
                20, 1000,
                new Stats(0,0,0,2,1,0), 45,
                0.85,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The leaves that grow over Maizotaur's shoulders and back occasionally will attract nesting bird Pokémon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,11),
                        new MoveLearnSetEntry(Move.YAWN,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,20),
                        new MoveLearnSetEntry(Move.SUBMISSION,24),
                        new MoveLearnSetEntry(Move.RETALIATE,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,32),
                        new MoveLearnSetEntry(Move.MILK_DRINK,39),
                        new MoveLearnSetEntry(Move.HORN_LEECH,45),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,57)                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Maizotaur");

    }


}
