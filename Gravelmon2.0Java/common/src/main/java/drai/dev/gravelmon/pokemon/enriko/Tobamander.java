package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tobamander extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tobamander() {
        super("Tobamander",
                Type.FIRE, Type.DRAGON,
                new Stats(55,
                        96,
                        64,
                        67,
                        89,
                        94),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Feeding off of rare herbs, each Tobamander's smoke has a distinct smell. When they shed, the old skin is burnt off, leaving trails of ash."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.INFERNO,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.TWISTER,4),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.WHIRLWIND,13),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,16),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,19),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,25),
                        new MoveLearnSetEntry(Move.WING_ATTACK,28),
                        new MoveLearnSetEntry(Move.AGILITY,31),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,36),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,39),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,44),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,45),
                        new MoveLearnSetEntry(Move.OVERHEAT,52)             ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 53, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT, Biome.IS_NETHER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA),
                0.28, 0.3,
                List.of());
           setLangFileName("Tobamander");

    }


}
