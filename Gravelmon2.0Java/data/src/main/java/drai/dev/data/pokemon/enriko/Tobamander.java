package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tobamander extends drai.dev.data.pokemon.Pokemon {
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
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_LAVA)
    .build(), List.of());
	
           setLangFileName("Tobamander");

    }


}
