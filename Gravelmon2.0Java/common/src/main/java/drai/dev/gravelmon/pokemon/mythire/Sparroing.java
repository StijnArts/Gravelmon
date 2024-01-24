package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sparroing extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sparroing() {
        super("Sparroing",
                Type.FIGHTING,Type.STEEL,
                new Stats(75,
                        80,
                        50,
                        50,
                        75,
                        75),
                List.of(Ability.QUICK_FEET,Ability.RECKLESS,Ability.PRANKSTER), Ability.PRANKSTER,
                8, 165,
                new Stats(0,0,0,0,1,1), 100,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Sparroing nimbly bound across rooftops with their springy feet, damaging roofs and causing all sorts of trouble. The coiled legs can extend up to ten times in length to kick enemies with iron force."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RUSHDOWN,1),
                        new MoveLearnSetEntry(Move.AXE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sparroing");

    }


}
