package drai.dev.data.pokemon.varitas.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class VaritasianDrakloak extends drai.dev.data.pokemon.Pokemon {
    public VaritasianDrakloak() {
        super("Drakloak",
                Type.DRAGON, Type.WATER,
                new Stats(68,
                        80,
                        50,
                        60,
                        50,
                        102),
                List.of(Ability.HYDRATION,Ability.INFILTRATOR,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                144, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.DRAGON),
                List.of("It's capable of flying faster than 120 mph. It battles alongside Dreepy and dotes on them until they successfully evolve."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.LOCKON,6),
                        new MoveLearnSetEntry(Move.ASSURANCE,12),
                        new MoveLearnSetEntry(Move.HEX,18),
                        new MoveLearnSetEntry(Move.AGILITY,24),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,30),
                        new MoveLearnSetEntry(Move.UTURN,36),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,42),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,48),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,54),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,61),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,66),
                        new MoveLearnSetEntry(Move.LAST_RESORT,72),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm")                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Drakloak");

    }


}
