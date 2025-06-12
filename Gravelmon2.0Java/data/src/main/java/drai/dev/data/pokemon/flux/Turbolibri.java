package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Turbolibri  extends Pokemon {
    public Turbolibri() {
        super("Turbolibri",
                Type.FLYING, Type.NORMAL,
                new Stats(66,
                        100,
                        78,
                        70,
                        50,
                        131),
                List.of(Ability.SAP_SIPPER, Ability.SPEED_BOOST), Ability.BOMBARDIER,
                16, 298,
                new Stats(0,1,0,0,0,2), 45,
                0.5,
                128, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It has a flawless sense of direction, and can memorize migratory routes across hundreds of miles. They act as scouts for the flock."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.BULLET_SEED,14),
                        new MoveLearnSetEntry(Move.AGILITY,19),
                        new MoveLearnSetEntry(Move.DRILL_PECK,24),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,29),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,33),
                        new MoveLearnSetEntry(Move.TAILWIND,39),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,44),
                        new MoveLearnSetEntry(Move.EXPLOSION,49)
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
