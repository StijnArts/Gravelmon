package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Celestapir extends drai.dev.data.pokemon.Pokemon {
    public Celestapir() {
        super("Celestapir",
                Type.PSYCHIC,
                new Stats(102,
                        70,
                        84,
                        115,
                        98,
                        66),
                List.of(Ability.ILLUMINATE,Ability.TRACE,Ability.SYNCHRONIZE), Ability.SYNCHRONIZE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Celestapir were nearly hunted to extinction in the past. Sadly, their incredible starry-patterned pelts are still sought after today, but efforts for preserving the species are fruitful."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STARSTREAM,1),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Celestapir");

    }


}
