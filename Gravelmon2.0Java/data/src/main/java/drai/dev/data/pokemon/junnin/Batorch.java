package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Batorch extends drai.dev.data.pokemon.Pokemon {
    public Batorch() {
        super("Batorch",
                Type.FIRE,
                new Stats(36,
                        60,
                        47,
                        59,
                        47,
                        61),
                List.of(Ability.BLAZE), Ability.BLAZE,
                4, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("batrix", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(      new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,6),
                        new MoveLearnSetEntry(Move.SINGE,8),
                        new MoveLearnSetEntry(Move.PECK,11),
                        new MoveLearnSetEntry(Move.SCREECH,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.FLAME_BURST,21),
                        new MoveLearnSetEntry(Move.METAL_SOUND,26),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,29),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,33),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,39),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,47),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,53),
                        new MoveLearnSetEntry(Move.METAL_BURST,59)                  ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
