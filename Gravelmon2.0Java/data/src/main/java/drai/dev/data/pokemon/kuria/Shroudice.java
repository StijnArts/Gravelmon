package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shroudice extends drai.dev.data.pokemon.Pokemon {
    public Shroudice() {
        super("Shroudice",
                Type.GHOST, Type.ICE,
                new Stats(66,
                        123,
                        80,
                        70,
                        118,
                        94),
                List.of(Ability.REFLECTIVE,Ability.MAGIC_BOUNCE), Ability.TOUGH_CLAWS,
                20, 90,
                new Stats(0,2,0,0,1,0), 45,
                0.5,
                212, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("During a blizzard in a tundra, Shroudice will appear, just staring at lost travelers, waiting for their actions. Because it looks fairly human from a distance, people will sometimes approach, only to get their souls sealed in its mirror."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,7),
                        new MoveLearnSetEntry(Move.SPITE,10),
                        new MoveLearnSetEntry(Move.METAL_CLAW,14),
                        new MoveLearnSetEntry(Move.ICE_SHARD,17),
                        new MoveLearnSetEntry(Move.TAUNT,19),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,22),
                        new MoveLearnSetEntry(Move.BLOCK,25),
                        new MoveLearnSetEntry(Move.NUGGETFLING,28),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,32),
                        new MoveLearnSetEntry(Move.SWAGGER,36),
                        new MoveLearnSetEntry(Move.CRYSTALDEFENSE,40),
                        new MoveLearnSetEntry(Move.ICEBLADE,44),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,47),
                        new MoveLearnSetEntry(Move.MEMENTO,52)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(55)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shroudice");

    }


}
