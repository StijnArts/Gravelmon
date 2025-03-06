package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Rainu extends drai.dev.data.pokemon.Pokemon {
    public Rainu() {
        super("Rainu",
                Type.ELECTRIC,
                new Stats(70,
                        97,
                        70,
                        115,
                        100,
                        128),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                8, 165,
                new Stats(0,0,0,0,0,3), 3,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- SparkSTAB Electric - Howl Normal 5 Noble Roar Normal 10 Team Up Normal 15 Haze Ice 20 Helping Hand Normal 25 Squall Flying 30 Roar Normal 35 Slash Normal 40 Tailwind Flying 45 ThunderboltSTAB Electric 50 Dragon Claw Dragon 55 Hurricane Flying 60 ThunderSTAB Electric 65 Dragon Dance Dragon 70 Weather Ball Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,5),
                        new MoveLearnSetEntry(Move.TEAMUP,10),
                        new MoveLearnSetEntry(Move.HAZE,15),
                        new MoveLearnSetEntry(Move.HELPING_HAND,20),
                        new MoveLearnSetEntry(Move.SQUALL,25),
                        new MoveLearnSetEntry(Move.ROAR,30),
                        new MoveLearnSetEntry(Move.SLASH,35),
                        new MoveLearnSetEntry(Move.TAILWIND,40),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,45),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.HURRICANE,55),
                        new MoveLearnSetEntry(Move.THUNDER,60),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,65),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,70)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Rainu");

    }


}
