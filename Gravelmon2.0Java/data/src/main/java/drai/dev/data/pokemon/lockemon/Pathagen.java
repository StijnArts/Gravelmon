package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pathagen extends Pokemon {
    public Pathagen() {
        super("Pathagen",
                Type.POISON,
                new Stats(90,
                        70,
                        110,
                        75,
                        115,
                        65),
                List.of(Ability.CORROSION, Ability.POISON_TOUCH), Ability.POLLUTION,
                15, 365,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Despite their appearance, Pathagen are extremely caring, frequently accepting abandoned Pokémon into their lounge. Their venom is incredibly powerful, and a single bite is enough to knock a Mamoswine out in minutes."),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 33, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
