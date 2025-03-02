package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stickisticky extends drai.dev.data.pokemon.Pokemon {
    public Stickisticky() {
        super("Stickisticky",
                Type.FAIRY,
                new Stats(110,
                        45,
                        30,
                        75,
                        150,
                        45),
                List.of(Ability.THICK_FAT,Ability.SWEET_VEIL), Ability.MISTY_SURGE,
                8, 130,
                new Stats(0,0,0,0,2,0), 100,
                0.5,
                231, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of("- Explosion Normal - Misty ExplosionSTAB Fairy - Play Nice Normal - Stockpile Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.STOCKPILE,1),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Stickisticky");

    }


}
