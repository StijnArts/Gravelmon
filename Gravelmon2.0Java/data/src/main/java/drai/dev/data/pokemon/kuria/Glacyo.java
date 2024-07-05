package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glacyo extends drai.dev.data.pokemon.Pokemon {
    public Glacyo() {
        super("Glacyo",
                Type.QUESTION_MARK,
                new Stats(58,
                        85,
                        103,
                        120,
                        85,
                        103),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                10, 100,
                new Stats(0,2,0,2,0,0), 30,
                0.0,
                226, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("These Pokémon were once trusted to guard the secrets of the crystal power. They use Crystail to swarm intruders and then finish them off with a powerful crystal attack. No one knows where they came from."),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.PEBBLE_SHOT, 1),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 56, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glacyo");

    }


}
