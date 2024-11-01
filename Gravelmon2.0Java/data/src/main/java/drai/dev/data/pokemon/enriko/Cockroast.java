package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cockroast extends drai.dev.data.pokemon.Pokemon {
    public Cockroast() {
        super("Cockroast",
                Type.BUG, Type.FIRE,
                new Stats(45,
                        60,
                        40,
                        65,
                        45,
                        65),
                List.of(Ability.SHIELD_DUST,Ability.ADAPTABILITY,Ability.FLAME_BODY), Ability.FLAME_BODY,
                11, 165,
                new Stats(0,0,0,0,0,0), 245,
                0.8,
                64, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("cockroast live in packs, sharing their body heat to keep their nests warm. They are widely regarded as pests due to how well they can adapt to urban environments."),
                List.of(new EvolutionEntry("roaspector", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.TWINEEDLE,12),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,16),
                        new MoveLearnSetEntry(Move.SILVER_WIND,20),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,24),
                        new MoveLearnSetEntry(Move.SILVER_WIND,28),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,34),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,38),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,44),
                        new MoveLearnSetEntry(Move.ERUPTION,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 32, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cockroast");

    }


}
