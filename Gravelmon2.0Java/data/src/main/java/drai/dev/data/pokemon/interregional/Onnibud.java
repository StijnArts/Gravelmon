package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Onnibud extends drai.dev.data.pokemon.Pokemon {
    public Onnibud() {
        super("Onnibud",
                Type.GRASS, Type.FIRE,
                new Stats(90,
                        75,
                        95,
                        40,
                        65,
                        25),
                List.of(Ability.STAMINA), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("vittion", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,5),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,9),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,12),
                        new MoveLearnSetEntry(Move.BULLET_SEED,17),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.BIDE,23),
                        new MoveLearnSetEntry(Move.FLAME_BURST,27),
                        new MoveLearnSetEntry(Move.SEED_BOMB,34),
                        new MoveLearnSetEntry(Move.EXPLOSION,38),
                        new MoveLearnSetEntry(Move.INFERNO,44),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,47),
                        new MoveLearnSetEntry(Move.SYNTHESIS,53)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(19)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Onnibud");

    }


}
