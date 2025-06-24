package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Striger extends drai.dev.data.pokemon.Pokemon {
    public Striger() {
        super("Striger",
                Type.WATER, Type.FIGHTING,
                new Stats(85,
                        120,
                        85,
                        70,
                        70,
                        100),
                List.of(Ability.TORRENT,Ability.RIVALRY), Ability.DEFIANT,
                18, 0,
                new Stats(0,2,0,0,0,1), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Striger has a wild side. It finishes opponents by biting them with their enormous fangs after launching violent slashes. Its untamed nature can only be tamed by the most powerful of trainers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,12),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,15),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,18),
                        new MoveLearnSetEntry(Move.SNARL,22),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.SKULL_BASH,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,34),
                        new MoveLearnSetEntry(Move.WATER_PULSE,36),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.LIQUIDATION,48),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SHEDFANGS,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm") ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Striger");

    }


}
