package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Medissin extends drai.dev.data.pokemon.Pokemon {
    public Medissin() {
        super("Medissin",
                Type.GHOST, Type.POISON,
                new Stats(52,
                        40,
                        43,
                        51,
                        63,
                        76),
                List.of(Ability.PRANKSTER), Ability.POISON_TOUCH,
                7, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Medissin are always found wrapped around a bone-like rod. Should the rod be taken from it, it will fall ill and fade away. So will whoever took the rod."),
                List.of(new EvolutionEntry("mambaboo", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(        new MoveLearnSetEntry(Move.TOXIC,1),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.VENOSHOCK,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.HEX,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.GLARE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.TRICK,1),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,1),
                        new MoveLearnSetEntry(Move.BONE_CLUB,1),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,1),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .setSpawnPreset(SpawnPreset.ILLAGER_STRUCTURES)
    .build(), List.of());
	
           setLangFileName("Medissin");

    }


}
