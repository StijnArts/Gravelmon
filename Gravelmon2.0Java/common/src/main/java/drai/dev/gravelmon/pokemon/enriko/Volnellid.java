package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Volnellid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Volnellid() {
        super("Volnellid",
                Type.FIRE,
                new Stats(45,
                        30,
                        40,
                        65,
                        75,
                        50),
                List.of(Ability.SWIFT_SWIM), Ability.STORM_DRAIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Volnellid need extreme heat to survive. Normally they live around hydrothermal vents, but undersea lava tubes sometimes bring them to the surface."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.HARDEN,6),
                        new MoveLearnSetEntry(Move.EMBER,13),
                        new MoveLearnSetEntry(Move.SMOG,18),
                        new MoveLearnSetEntry(Move.FLAIL,23),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,27),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,34),
                        new MoveLearnSetEntry(Move.AQUA_RING,38),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,42),
                        new MoveLearnSetEntry(Move.MEGAHORN,48),
                        new MoveLearnSetEntry(Move.ERUPTION,56),
                        new MoveLearnSetEntry(Move.AGILITY,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Volnellid");

    }


}
