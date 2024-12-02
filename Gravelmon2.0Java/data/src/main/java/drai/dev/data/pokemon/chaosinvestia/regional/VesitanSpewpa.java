package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanSpewpa extends drai.dev.data.pokemon.Pokemon {
    public VesitanSpewpa(String name, Aspect aspect) {
        super(name, aspect, "VesitanSpewpa",
                Type.BUG,Type.FAIRY,
                new Stats(45,
                        22,
                        60,
                        29,
                        27,
                        30),
                List.of(Ability.SHED_SKIN,Ability.FRIEND_GUARD), null,
                3, 84,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Es lebt versteckt im schattigen Dickicht. Wird es von einem Feind angegriffen, stellt es sein Fell zur Abschreckung zu scharfen Spitzen auf."),
                List.of(new EvolutionEntry("vivillon vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"12")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.PROTECT,9)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 9, 16, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spewpa");

    }


}
