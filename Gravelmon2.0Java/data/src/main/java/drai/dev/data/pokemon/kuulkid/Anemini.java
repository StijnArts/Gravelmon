package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Anemini extends drai.dev.data.pokemon.Pokemon {
    public Anemini() {
        super("Anemini",
                Type.WATER,Type.POISON,
                new Stats(45,
                        65,
                        45,
                        50,
                        60,
                        50),
                List.of(Ability.TORRENT), Ability.HUSTLE,
                8, 0,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Anemini are always full of energy, much to the dismay of people and pokemon around it. The tips of the tendrils above their heads cause a mild irritation to the touch."),
                List.of(new EvolutionEntry("juggljelly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Anemini");

    }


}
