package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Curbludgeon extends drai.dev.data.pokemon.Pokemon {
    public Curbludgeon() {
        super("Curbludgeon",
                Type.STEEL,
                new Stats(111,
                        111,
                        111,
                        61,
                        71,
                        41),
                List.of(Ability.ROCK_HEAD), Ability.HEAVY_METAL,
                16, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WIDE_GUARD,1),
                        new MoveLearnSetEntry(Move.POISON_STING,6),
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.TICKLE,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.REFLECT,25),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,29),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,39),
                        new MoveLearnSetEntry(Move.POWER_TRICK,44),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,49),
                        new MoveLearnSetEntry(Move.METAL_BURST,56),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,63)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
