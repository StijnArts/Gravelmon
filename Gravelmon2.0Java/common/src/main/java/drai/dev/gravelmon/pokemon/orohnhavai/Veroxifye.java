package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Veroxifye extends drai.dev.gravelmon.pokemon.Pokemon {
    public Veroxifye() {
        super("Veroxifye",
                Type.FAIRY,Type.FIGHTING,
                new Stats(70,
                        95,
                        70,
                        110,
                        60,
                        105),
                List.of(Ability.PERCEIVE), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Veroxifye's orb is referred to as its 'Third Eye' due to its ability to reveal the truth as well as deception. They will fight to protect their group from Zoroark, their bitter enemies. It is thought this feud began with a vision shown in a Veroxifye's orb."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Veroxifye");

    }


}
