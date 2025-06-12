package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Aerogen extends Pokemon {
    public Aerogen() {
        super("Aerogen",
                Type.FLYING,
                new Stats(65,
                        90,
                        70,
                        110,
                        75,
                        115),
                List.of(Ability.PRANKSTER, Ability.SPEED_BOOST), Ability.GALE_FORCE,
                15, 365,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Aerogen is a lord among flying-type Pokémon, soaring through the skies at sonic speeds. They were originally considered as the fastest Pokémon in the air until Ninjask migrated to Kaskade."),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 33, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
