package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Lemini extends drai.dev.data.pokemon.Pokemon {
    public Lemini() {
        super("Lemini",
                Type.NORMAL,
                new Stats(20,
                        30,
                        20,
                        30,
                        30,
                        50),
                List.of(Ability.OVERCOAT,Ability.RUN_AWAY,Ability.THICK_FAT), Ability.THICK_FAT,
                3, 165,
                new Stats(0,0,0,0,0,1), 240,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When frightened, Lemini escapes danger by jumping off cliffs in search for safety. Its round and soft body guarantees a safe landing."),
                List.of(new EvolutionEntry("Gnimmel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"180")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.ENDURE,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .setAntiBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lemini");

    }


}
