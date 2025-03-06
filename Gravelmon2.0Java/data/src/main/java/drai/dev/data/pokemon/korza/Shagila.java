package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shagila extends drai.dev.data.pokemon.Pokemon {
    public Shagila() {
        super("Shagila",
                Type.GROUND,
                new Stats(66,
                        76,
                        53,
                        48,
                        45,
                        92),
                List.of(Ability.SAND_VEIL,Ability.DRY_SKIN), Ability.SAND_FORCE,
                10, 156,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                133, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Although Shagila is still able to shed its tail, it takes much longer to grow back. Its tail is filled with dirt or sand, depending on what is in its environment."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shagila");

    }


}
