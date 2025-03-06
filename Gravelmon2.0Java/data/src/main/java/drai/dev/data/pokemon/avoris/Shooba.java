package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Shooba extends drai.dev.data.pokemon.Pokemon {
    public Shooba() {
        super("Shooba",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FUR_COAT,Ability.ANGER_POINT,Ability.GUARD_DOG), Ability.GUARD_DOG,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Shooba are famous for their bold, loyal, and energetic personality, which is why they are a favorite among many Trainers. While they may seem like the perfect companion, they can easily be aggravated. Their favorite treats usually help calm them down."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shooba");

    }


}
