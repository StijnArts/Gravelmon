package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shelspout extends drai.dev.data.pokemon.Pokemon {
    public Shelspout() {
        super("Shelspout",
                Type.WATER,Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.MEGA_LAUNCHER, Ability.SHELL_ARMOR), Ability.SNIPER,
                UnitConverter.feetToMeters(2, 0), 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Deployster", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 33, 4.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Shelspout");

    }


}
