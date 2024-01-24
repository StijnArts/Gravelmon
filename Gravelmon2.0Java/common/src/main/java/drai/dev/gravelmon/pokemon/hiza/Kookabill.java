package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kookabill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kookabill() {
        super("Kookabill",
                Type.STEEL,Type.FLYING,
                new Stats(57,
                        60,
                        77,
                        20,
                        36,
                        50),
                List.of(Ability.UNNERVE), Ability.BIG_PECKS,
                8, 165,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                73, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("Kookabill's beak is one of the few things capable piercing Termunch nests. While the weight of their beaks make them really poor fliers, it protects Kookabill from inevitable impact."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kookabill");

    }


}
