package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lacina extends drai.dev.data.pokemon.Pokemon {
    public Lacina() {
        super("Lacina",
                Type.WATER,
                new Stats(48,
                        43,
                        43,
                        67,
                        69,
                        44),
                List.of(Ability.TORRENT), Ability.CLEAR_BODY,
                3, 9,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Lacina are known for their carefree and docile tendency. Their bodies are very squishy and transparent, showing the innards."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lacina");

    }


}
