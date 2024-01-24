package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Facadino extends drai.dev.gravelmon.pokemon.Pokemon {
    public Facadino() {
        super("Facadino",
                Type.DRAGON,
                new Stats(40,
                        55,
                        50,
                        35,
                        55,
                        55),
                List.of(Ability.STEADFAST,Ability.SHELL_ARMOR,Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                58, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("It continues to wear pieces of its egg long after it has hatched. While most of the eggshell falls off as it grows, the piece on its face remains forever, and will eventually merge with its skin when it evolves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.JUMPSCARE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Facadino");

    }


}
