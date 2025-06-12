package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranFalinks extends Pokemon {
    public CefiranFalinks(String name, Aspect aspect, Stats stats) {
        super(name, aspect,"CefiranFalinks",
                Type.FAIRY, Type.FIGHTING,
                stats,
                List.of(Ability.KEENEYE), Ability.KEENEYE,
                14, 0,
                new Stats(0,1,0,0,1,0), 60,
                0.5,
                173, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                ),
                List.of(Label.GEN8,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 23, 51, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
    }
}
