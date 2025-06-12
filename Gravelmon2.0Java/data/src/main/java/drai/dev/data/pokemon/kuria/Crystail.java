package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crystail extends drai.dev.data.pokemon.Pokemon {
    public Crystail() {
        super("Crystail",
                Type.CRYSTAL,
                new Stats(58,
                        58,
                        58,
                        58,
                        58,
                        58),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 50,
                new Stats(0,1,0,1,0,0), 120,
                0.0,
                118, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A strange creature only talked about in ancient legends of the Kuria region. They roam the halls of crystal power, and swarm any invaders they can find in hopes of keeping their secrets safe."),
                List.of(new EvolutionEntry("glacyo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.IRON_DEFENSE.getName())))),
                List.of(      new MoveLearnSetEntry(Move.PEBBLE_SHOT, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.SAND_WAVE, 6),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 9),
                        new MoveLearnSetEntry(Move.WISH, 12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 15),
                        new MoveLearnSetEntry(Move.PROTECT, 18),
                        new MoveLearnSetEntry(Move.MUDSLAP, 20),
                        new MoveLearnSetEntry(Move.SEISMIC_WAVE, 21),
                        new MoveLearnSetEntry(Move.CALM_MIND, 24),
                        new MoveLearnSetEntry(Move.SHRAPNEL_SPHERE, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29),
                        new MoveLearnSetEntry(Move.POWER_GEM, 32),
                        new MoveLearnSetEntry(Move.SEISMIC_PULSE, 36),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 40),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 42),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 47),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 51),
                        new MoveLearnSetEntry(Move.RECOVER, 61),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 67)                  ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Crystail");

    }


}
