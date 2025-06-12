package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ghoskarf extends drai.dev.data.pokemon.Pokemon {
    public Ghoskarf() {
        super("Ghoskarf",
                Type.GHOST, Type.ICE,
                new Stats(51,
                        92,
                        60,
                        55,
                        83,
                        70),
                List.of(Ability.REFLECTIVE,Ability.MAGIC_BOUNCE), Ability.SLUSH_RUSH,
                8, 45,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                106, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Stalking strangers who get lost in snowstorms, Ghoskarf will follow someone for hours until they freeze solid. It will then keep the stature as a trophy."),
                List.of(new EvolutionEntry("shroudice", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55")))),
                List.of(    new MoveLearnSetEntry(Move.LEER,1),
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
                        new MoveLearnSetEntry(Move.MEMENTO,52)                    ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ghoskarf");

    }


}
