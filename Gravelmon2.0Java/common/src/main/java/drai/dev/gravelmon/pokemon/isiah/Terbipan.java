package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Terbipan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terbipan() {
        super("Terbipan",
                Type.GRASS,Type.FLYING,
                new Stats(75,
                        85,
                        68,
                        105,
                        72,
                        80),
                List.of(Ability.TANGLED_FEET,Ability.PINWHEEL,Ability.SECONDWIND), Ability.SECONDWIND,
                8, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                218, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("A single Terbipan can create winds of enough force to power a windmill for a whole day. They are used to help power rural towns with no other access to sources of energy."),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Terbipan");

    }


}
