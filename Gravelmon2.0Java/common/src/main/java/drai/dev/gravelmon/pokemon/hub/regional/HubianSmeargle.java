package drai.dev.gravelmon.pokemon.hub.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HubianSmeargle extends drai.dev.gravelmon.pokemon.Pokemon {
    public HubianSmeargle() {
        super("Smeargle",
                Type.GROUND,Type.FAIRY,
                new Stats(55,
                        20,
                        35,
                        20,
                        45,
                        75),
                List.of(Ability.OWN_TEMPO), Ability.TECHNICIAN,
                8, 165,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Smeargle on Easter Island is just as artistic as its Johto counterpart, filling the walls of its cave home with hundreds of colorful chalk drawings. It is unable to learn any move, instead it is born capable of an endless possibility of potential."),
                List.of(),
                List.of(                        ),
                List.of(Label.HUB),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Smeargle");

    }


}
