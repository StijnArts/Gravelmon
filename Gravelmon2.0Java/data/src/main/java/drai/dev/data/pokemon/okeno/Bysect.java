package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bysect extends drai.dev.data.pokemon.Pokemon {
    public Bysect() {
        super("Bysect",
                Type.BUG,
                new Stats(54,
                        131,
                        95,
                        55,
                        50,
                        85),
                List.of(Ability.HYPER_CUTTER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its mandibles can move back and foward at extreme speeds. The friction allows it to cut through its prey and even metal They build nests in trees that they have hollowed out."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PESTER,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bysect");

    }


}
