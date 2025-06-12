package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Grimandrill extends drai.dev.data.pokemon.Pokemon {
    public Grimandrill() {
        super("Grimandrill",
                Type.DARK,
                new Stats(68,
                        110,
                        104,
                        93,
                        58,
                        72),
                List.of(Ability.UNNERVE,Ability.INTIMIDATE,Ability.GORILLA_TACTICS), Ability.GORILLA_TACTICS,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FIELD),
                List.of("Grimandril stalk their prey for hours, silently staring them down from behind thickets of trees and bushes. The more agitated they become, the bigger the smile gets. This Pokemon's cry is known to sound uncannily human-like."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,8),
                        new MoveLearnSetEntry(Move.LOW_KICK,12),
                        new MoveLearnSetEntry(Move.SWAGGER,15),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,17),
                        new MoveLearnSetEntry(Move.UPROAR,20),
                        new MoveLearnSetEntry(Move.BEAT_UP,24),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,27),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,31),
                        new MoveLearnSetEntry(Move.THRASH,38),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,40),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,50)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grimandrill");

    }


}
