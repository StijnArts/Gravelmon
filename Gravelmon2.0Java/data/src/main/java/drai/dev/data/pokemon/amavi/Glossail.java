package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glossail extends drai.dev.data.pokemon.Pokemon {
    public Glossail() {
        super("Glossail",
                Type.WATER, Type.ICE,
                new Stats(105,
                        35,
                        85,
                        65,
                        85,
                        35),
                List.of(Ability.TORRENT), Ability.FILTER,
                6, 535,
                new Stats(2,0,0,0,0,0), 45,
                0.75,
                145, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("Atlantice", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHILLING_WATER,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,6),
                        new MoveLearnSetEntry(Move.ICY_WIND,12),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,17),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,23),
                        new MoveLearnSetEntry(Move.TEATIME,28),
                        new MoveLearnSetEntry(Move.FREEZEDRY,34),
                        new MoveLearnSetEntry(Move.POWER_GEM,39),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,45),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,50),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61),
                        new MoveLearnSetEntry(Move.ROYALDECREE,67),
                        new MoveLearnSetEntry(Move.BLIZZARD,72),
                        new MoveLearnSetEntry(Move.SOAK,78),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,83)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
