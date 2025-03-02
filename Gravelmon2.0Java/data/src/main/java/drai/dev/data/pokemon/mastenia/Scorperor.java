package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scorperor extends drai.dev.data.pokemon.Pokemon {
    public Scorperor() {
        super("Scorperor",
                Type.DARK, Type.BUG,
                new Stats(76,
                        126,
                        106,
                        60,
                        76,
                        86),
                List.of(Ability.HYPER_CUTTER,Ability.SHELL_ARMOR), Ability.INTIMIDATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Bug BiteSTAB Bug - Scary Face Normal - Leer Normal - Crush Grip Normal - Crush Claw Normal - Cross Chop Fighting - Cross Poison Poison - Throat ChopSTAB Dark - Fell StingerSTAB Bug - X-ScissorSTAB Bug - Iron Defense Steel - Crabhammer Water - Swords Dance Normal - Sucker PunchSTAB Dark - Obstruct Dark - Metal Claw Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.CROSS_POISON,1),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,1),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.XSCISSOR,1),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,1),
                        new MoveLearnSetEntry(Move.FELL_STINGER,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.CRUSH_GRIP,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.OBSTRUCT,1),
                        new MoveLearnSetEntry(Move.CRABHAMMER,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scorperor");

    }


}
