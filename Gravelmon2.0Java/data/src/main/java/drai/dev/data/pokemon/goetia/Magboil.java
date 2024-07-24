package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magboil extends drai.dev.data.pokemon.Pokemon {
    public Magboil(Stats stats) {
        super("Magboil",
                Type.PSYCHIC, Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Looking into its eye-like organs as they pulsate causes its thoughts to be transmitted telepathically. However, its mind is so alien that whatever it communicates ranges from cryptic to incomprehensible. It makes consistent reference to “headfriends”, presumed to be the mysterious larvae-like beings visible inside its sacs."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 51, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magboil");

    }


}
