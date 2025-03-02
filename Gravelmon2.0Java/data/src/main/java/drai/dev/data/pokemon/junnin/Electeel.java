package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Electeel extends drai.dev.data.pokemon.Pokemon {
    public Electeel() {
        super("Electeel",
                Type.WATER, Type.ELECTRIC,
                new Stats(78,
                        62,
                        62,
                        75,
                        78,
                        50),
                List.of(Ability.TORRENT), Ability.VOLT_ABSORB,
                8, 165,
                new Stats(1,0,0,0,1,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MONSTER),
                List.of("The electrical current that runs through its body is very powerful. When in danger, Electeel load electricity into their dorsal fins, then discharge it as a powerful shock wave."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
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
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,56),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Electeel");

    }


}
