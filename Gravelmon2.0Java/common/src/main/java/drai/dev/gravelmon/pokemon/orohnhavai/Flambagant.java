package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Flambagant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flambagant() {
        super("Flambagant",
                Type.PSYCHIC, Type.FLYING,
                new Stats(80,
                        80,
                        65,
                        70,
                        100,
                        85),
                List.of(Ability.CUTE_CHARM), Ability.DAZZLING,
                14, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution, they finally have the confidence to show their true feelings and express them through dance. Their feelings radiate psychic energy and may boost the mood to those around it. Flambagant are very popular in Pokemon contests as they love being dressed up. They have been a symbol of love in the region. It is said if a couple finds a feather of Flambagant, they will have everlasting love."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.ENDURE,5),
                        new MoveLearnSetEntry(Move.PECK,8),
                        new MoveLearnSetEntry(Move.YAWN,11),
                        new MoveLearnSetEntry(Move.STORED_POWER,14),
                        new MoveLearnSetEntry(Move.ATTRACT,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,21),
                        new MoveLearnSetEntry(Move.CHERUB_ARROW,24),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,28),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,32),
                        new MoveLearnSetEntry(Move.PSYCHIC,36),
                        new MoveLearnSetEntry(Move.CALM_MIND,41),
                        new MoveLearnSetEntry(Move.AIR_SLASH,47),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,52),
                        new MoveLearnSetEntry(Move.HEALING_WISH,60)
                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Flambagant");

    }


}
