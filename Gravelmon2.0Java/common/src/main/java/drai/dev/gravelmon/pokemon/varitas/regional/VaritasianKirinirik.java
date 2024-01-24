package drai.dev.gravelmon.pokemon.varitas.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class VaritasianKirinirik extends drai.dev.gravelmon.pokemon.Pokemon {
    public VaritasianKirinirik() {
        super("Kirinirik",
                Type.DRAGON,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INNER_FOCUS,Ability.INTIMIDATE,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kirinirik's lighter head prefers to approach situations calmly and analytically, while its darker head is much more brash and violent so they don't often get along. However, if Kirinirik's heads both focus their energy in tandem, they are capable of unleashing tremendous mystic power."),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kirinirik");

    }


}
