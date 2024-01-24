package drai.dev.gravelmon.pokemon.varitas.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class VaritasianWobbuffet extends drai.dev.gravelmon.pokemon.Pokemon {
    public VaritasianWobbuffet() {
        super("Wobbuffet",
                Type.DARK,
                new Stats(190,
                        33,
                        58,
                        33,
                        58,
                        33),
                List.of(Ability.INTIMIDATE), Ability.SHADOW_TAG,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It cannot attack on its own, yet its glaring tail intimidates others into doing what it says. The main body seems to be unaware of this and simply thinks it's tougher than it actually is."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PARTING_SHOT,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm")                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wobbuffet");

    }


}
