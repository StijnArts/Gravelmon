package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Thistelle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Thistelle(Stats stats) {
        super("Thistelle",
                Type.POISON, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GRASS_KNOT,1),
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.POISON_POWDER,12),
                        new MoveLearnSetEntry(Move.STUN_SPORE,12),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,15),
                        new MoveLearnSetEntry(Move.INGRAIN,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,22),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,26),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,29),
                        new MoveLearnSetEntry(Move.LEECH_SEED,33),
                        new MoveLearnSetEntry(Move.SYNTHESIS,36),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,43),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,47),
                        new MoveLearnSetEntry(Move.WORRY_SEED,50),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,54),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,57)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 45, 1.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thistelle");

    }


}
