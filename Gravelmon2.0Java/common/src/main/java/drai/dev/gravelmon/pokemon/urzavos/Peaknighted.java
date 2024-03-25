package drai.dev.gravelmon.pokemon.urzavos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Peaknighted extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peaknighted() {
        super("Peaknighted",
                Type.PSYCHIC,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.UNNERVE,Ability.RIVALRY), Ability.BIG_PECKS,
                18, 953,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Peaknighted do not give up, even when defeated in battle. They are quick to use their psychic abilities to confuse foes, then finish them off with powerful pecks."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Peaknighted");

    }


}
