package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Glowarm extends drai.dev.data.pokemon.Pokemon {
    public Glowarm() {
        super("Glowarm",
                Type.WATER, Type.FIRE,
                new Stats(60,
                        80,
                        68,
                        101,
                        115,
                        28),
                List.of(Ability.REELIN), Ability.ADHESIVE,
                8, 165,
                new Stats(0,0,0,1,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Fire-type move that is SE on Water-types."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Glowarm");

    }


}
