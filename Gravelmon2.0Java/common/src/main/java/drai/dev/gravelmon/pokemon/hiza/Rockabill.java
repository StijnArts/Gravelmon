package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rockabill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rockabill() {
        super("Rockabill",
                Type.ROCK,Type.FLYING,
                new Stats(68,
                        113,
                        101,
                        40,
                        77,
                        96),
                List.of(Ability.STAMINA), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,2,0,0,0,0), 72,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("Its powerful large beaks are utilized in intense aerial jousts against eachother. Those fights are mostly endurance contests as nothing can scratch their beaks."),
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
           setLangFileName("Rockabill");

    }


}
