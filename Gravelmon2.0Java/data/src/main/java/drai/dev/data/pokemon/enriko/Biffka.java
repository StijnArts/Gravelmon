package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Biffka extends drai.dev.data.pokemon.Pokemon {
    public Biffka() {
        super("Biffka",
                Type.NORMAL,
                new Stats(125,
                        95,
                        135,
                        55,
                        60,
                        55),
                List.of(Ability.INTIMIDATE,Ability.IRON_FIST,Ability.THICK_FAT), Ability.THICK_FAT,
                8, 165,
                new Stats(2,0,2,0,0,0), 95,
                0.5,
                184, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is born from a neglected pot pie, left for the buzzards outside. It can often be seen sitting in the middle of major roadways, stubbornly blocking traffic."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,5),
                        new MoveLearnSetEntry(Move.STOCKPILE,12),
                        new MoveLearnSetEntry(Move.SWALLOW,19),
                        new MoveLearnSetEntry(Move.SPIT_UP,22),
                        new MoveLearnSetEntry(Move.CRUNCH,27),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,32),
                        new MoveLearnSetEntry(Move.GLARE,35),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.BULK_UP,45),
                        new MoveLearnSetEntry(Move.BARRIER,54),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,63)                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Biffka");

    }


}
