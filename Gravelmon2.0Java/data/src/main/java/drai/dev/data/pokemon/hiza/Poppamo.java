package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Poppamo extends drai.dev.data.pokemon.Pokemon {
    public Poppamo() {
        super("Poppamo",
                Type.WATER,
                new Stats(50,
                        25,
                        20,
                        45,
                        30,
                        25),
                List.of(Ability.WATER_BUBBLE), Ability.RAIN_DISH,
                5, 165,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("Poppamo can be seen floating around riverbanks. A large concentration of Poppamo is a sign that the water is warm."),
                List.of(new EvolutionEntry("soappo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,10),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,16),
                        new MoveLearnSetEntry(Move.UPROAR,19),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.RECOVER,31),
                        new MoveLearnSetEntry(Move.SOAK,35),
                        new MoveLearnSetEntry(Move.BOUNCE,40),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_RIVER)
    .setAntiBiomes(Biome.IS_WINTER, Biome.IS_AUTUMN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
