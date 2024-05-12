package drai.dev.gravelmon.pokemon.orbis.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Smeargle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Smeargle(int dex) {
        super(dex, "Smeargle",
                Type.NORMAL,
                new Stats(55,
                        20,
                        35,
                        20,
                        45,
                        75),
                List.of(Ability.OWN_TEMPO,Ability.TECHNICIAN), Ability.MOODY,
                12, 580,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A special fluid oozes from the tip of its tail. It paints the fluid everywhere to mark its territory. Once it becomes an adult, it has a tendency to let its comrades plant footprints on its back."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKETCH,91)                        ),
                List.of(Label.ORBIS),
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
