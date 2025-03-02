package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Battrolor extends drai.dev.data.pokemon.Pokemon {
    public Battrolor() {
        super("Battrolor",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(85,
                        100,
                        80,
                        70,
                        80,
                        120),
                List.of(Ability.MOTOR_DRIVE), Ability.LIGHTNING_ROD,
                20, 980,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                190, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
                List.of("Battrolor are used by the Orbopolis Police Force as a means of both transport and to detect criminal activity. They are able to fly high above the clouds and detect prey with ease. When in pursuit they are able to travel at extreme speeds and leaving lightning strikes where they travel."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.SPARK,5),
                        new MoveLearnSetEntry(Move.WING_ATTACK,14),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,29),
                        new MoveLearnSetEntry(Move.THUNDER,46),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,51)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Battrolor");

    }


}
