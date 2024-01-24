package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Greapper extends drai.dev.gravelmon.pokemon.Pokemon {
    public Greapper() {
        super("Greapper",
                Type.STEEL,Type.GHOST,
                new Stats(75,
                        140,
                        110,
                        35,
                        80,
                        60),
                List.of(Ability.STEADFAST,Ability.INSOMNIA,Ability.CONTRARY), Ability.CONTRARY,
                8, 165,
                new Stats(0,2,0,0,0,0), 25,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The two sharp horns beside its head protect it from any attack. It appears in deflorested areas seeking to punish those responsable."),
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
           setLangFileName("Greapper");

    }


}
