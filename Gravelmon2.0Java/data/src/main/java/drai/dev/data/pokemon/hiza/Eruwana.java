package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Eruwana extends drai.dev.data.pokemon.Pokemon {
    public Eruwana() {
        super("Eruwana",
                Type.FIRE,
                new Stats(55,
                        55,
                        50,
                        65,
                        40,
                        70),
                List.of(Ability.FIREPROOF), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Eruwana lives exclusively in scalding hot waters or even molten magma. It needs to keep its body temperature extremely high or else it will freeze."),
                List.of(new EvolutionEntry("erupaima", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,7),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,13),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,19),
                        new MoveLearnSetEntry(Move.WILLOWISP,22),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,25),
                        new MoveLearnSetEntry(Move.SCALD,28),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,31),
                        new MoveLearnSetEntry(Move.AGILITY,34),
                        new MoveLearnSetEntry(Move.THRASH,37),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,41),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,46),
                        new MoveLearnSetEntry(Move.ERUPTION,50),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_NETHER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERLAVA)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
