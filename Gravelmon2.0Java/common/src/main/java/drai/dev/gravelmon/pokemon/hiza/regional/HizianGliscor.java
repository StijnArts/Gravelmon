package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianGliscor extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianGliscor() {
        super("Gliscor",
                Type.ICE,Type.FLYING,
                new Stats(75,
                        95,
                        125,
                        45,
                        75,
                        95),
                List.of(Ability.ICE_SCALES), Ability.ICE_SCALES,
                8, 165,
                new Stats(0,0,2,0,0,0), 30,
                0.5,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It freezes its food with its icy breath inside cave walls, so other Pokémon are unable to take it. When hungry it uses its sharp claws and fangs to easily break through those fronzen walls."),
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
           setLangFileName("Gliscor");

    }


}
