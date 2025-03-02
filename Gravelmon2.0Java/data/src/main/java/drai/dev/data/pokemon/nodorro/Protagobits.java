package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Protagobits extends drai.dev.data.pokemon.Pokemon {
    public Protagobits() {
        super("Protagobits",
                Type.GHOST, Type.STEEL,
                new Stats(70,
                        80,
                        115,
                        70,
                        110,
                        60),
                List.of(Ability.CURSED_BODY), Ability.SHADOW_TAG,
                6, 607,
                new Stats(1,0,1,0,1,0), 0,
                0.5,
                154, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Protagobits is a spirit that took over a dismantled robot. For years protagobits has been studied by scientists to indentify its origin but without any succes"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CURSE,10),
                        new MoveLearnSetEntry(Move.GRUDGE,12),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,15),
                        new MoveLearnSetEntry(Move.HYPNOSIS,16),
                        new MoveLearnSetEntry(Move.DARK_PULSE,19),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,23),
                        new MoveLearnSetEntry(Move.GEAR_UP,26),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,30),
                        new MoveLearnSetEntry(Move.LOCKON,37),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,40),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,42),
                        new MoveLearnSetEntry(Move.IRON_HEAD,45),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,53),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,55),
                        new MoveLearnSetEntry(Move.RECOVER,60)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Protagobits");

    }


}
