package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Crapore extends drai.dev.data.pokemon.Pokemon {
    public Crapore() {
        super("Crapore",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SNIPER,Ability.WATER_ABSORB,Ability.WATER_VEIL), Ability.WATER_VEIL,
                6, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.WATER_1),
                List.of("It feeds by filtering the water through its porous carapace, which retains both algae and small plankton."),
                List.of(new EvolutionEntry("sniponge", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,3),
                        new MoveLearnSetEntry(Move.FLASH,7),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.SAFEGUARD,20),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,24),
                        new MoveLearnSetEntry(Move.BRINE,28),
                        new MoveLearnSetEntry(Move.MEMENTO,33),
                        new MoveLearnSetEntry(Move.SCREECH,38),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,43),
                        new MoveLearnSetEntry(Move.RECOVER,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Crapore");

    }


}
