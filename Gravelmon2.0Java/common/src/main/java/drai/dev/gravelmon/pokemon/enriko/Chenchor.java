package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Chenchor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chenchor() {
        super("Chenchor",
                Type.FIRE, Type.POISON,
                new Stats(67,
                        45,
                        60,
                        105,
                        97,
                        86),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its long antlers are used to collect chemicals from the air, which it synthesizes into food. While it looks like a worm, it is more closely related to Crabyss."),
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
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 33, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_MAGMA),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Chenchor");

    }


}
