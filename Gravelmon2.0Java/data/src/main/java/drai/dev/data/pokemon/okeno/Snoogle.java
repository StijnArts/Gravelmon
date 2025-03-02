package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Snoogle extends drai.dev.data.pokemon.Pokemon {
    public Snoogle() {
        super("Snoogle",
                Type.ICE,
                new Stats(90,
                        44,
                        70,
                        60,
                        60,
                        14),
                List.of(Ability.SNOOZE), Ability.SNOOZE,
                8, 165,
                new Stats(0,0,0,0,1,0), 205,
                0.5,
                66, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They are often found attached to branches, sleeping soundly. Snoogle also tend to sleep hugging their trainers if carried around."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,3),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,7),
                        new MoveLearnSetEntry(Move.ICE_BALL,12),
                        new MoveLearnSetEntry(Move.REST,16),
                        new MoveLearnSetEntry(Move.SNORE,21),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,26),
                        new MoveLearnSetEntry(Move.AVALANCHE,30),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.SLACK_OFF,37),
                        new MoveLearnSetEntry(Move.FROST_BREATH,42),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,46),
                        new MoveLearnSetEntry(Move.FLAIL,52),
                        new MoveLearnSetEntry(Move.LAST_RESORT,57),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.VINESWING,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Snoogle");

    }


}
