package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hunibee extends drai.dev.data.pokemon.Pokemon {
    public Hunibee() {
        super("Hunibee",
                Type.BUG,Type.FLYING,
                new Stats(90,
                        40,
                        62,
                        95,
                        80,
                        128),
                List.of(Ability.HONEY_GATHER), Ability.DAZZLING,
                7, 191,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                166, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Hunibee are hard workers- pollinating local flowers and making honey. They will fiercely defend the hive when needed, using painful stings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HONEYBOMB,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.GUST,26),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,28),
                        new MoveLearnSetEntry(Move.DETECT,31),
                        new MoveLearnSetEntry(Move.ME_FIRST,35),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,38),
                        new MoveLearnSetEntry(Move.ACROBATICS,41),
                        new MoveLearnSetEntry(Move.UTURN,44),
                        new MoveLearnSetEntry(Move.AGILITY,46),
                        new MoveLearnSetEntry(Move.AIR_SLASH,49),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,53),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hunibee");

    }


}
