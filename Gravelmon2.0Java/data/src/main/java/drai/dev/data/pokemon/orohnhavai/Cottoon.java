package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Cottoon extends drai.dev.data.pokemon.Pokemon {
    public Cottoon() {
        super("Cottoon",
                Type.BUG, Type.GRASS,
                new Stats(50,
                        20,
                        40,
                        30,
                        55,
                        15),
                List.of(Ability.OVERCOAT,Ability.TANGLING_HAIR,Ability.SHIELD_DUST), Ability.SHIELD_DUST,
                6, 165,
                new Stats(1,0,1,0,0,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Their soft bodies cushions itself if it may fall. With its wings, it can only fly a little. Strong winds often carry them far away from their breeding grounds."),
                List.of(new EvolutionEntry("sedavlin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"12")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,7),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,14),
                        new MoveLearnSetEntry(Move.LEECH_SEED,20)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cottoon");

    }


}
