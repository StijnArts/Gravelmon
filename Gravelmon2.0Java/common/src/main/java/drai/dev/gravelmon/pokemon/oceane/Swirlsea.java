package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Swirlsea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swirlsea() {
        super("Swirlsea",
                Type.BUG,Type.POISON,
                new Stats(40,
                        30,
                        30,
                        40,
                        30,
                        30),
                List.of(Ability.POISON_TOUCH), Ability.POISON_POINT,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                40, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Swirlsea can untangle their head tentacles and use them to wrap and strangle their prey. Although their venom is still weak, their barbs are as bad as a bee sting."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POISON_STING,4),
                        new MoveLearnSetEntry(Move.BUBBLE,8),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swirlsea");

    }


}
