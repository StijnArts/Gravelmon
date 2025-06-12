package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Droophant extends drai.dev.data.pokemon.Pokemon {
    public Droophant() {
        super("Droophant",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TORRENT), Ability.MEGA_LAUNCHER,
                13, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("cyclodon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.WRAP,10),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,15),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,19),
                        new MoveLearnSetEntry(Move.AQUA_RING,23),
                        new MoveLearnSetEntry(Move.SLAM,27),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,32),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,37),
                        new MoveLearnSetEntry(Move.COIL,41),
                        new MoveLearnSetEntry(Move.WRING_OUT,45),
                        new MoveLearnSetEntry(Move.DISCHARGE,50),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,56)                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Droophant");

    }


}
