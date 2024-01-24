package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Varghast extends drai.dev.gravelmon.pokemon.Pokemon {
    public Varghast() {
        super("Varghast",
                Type.FAIRY,Type.DARK,
                new Stats(78,
                        117,
                        80,
                        90,
                        80,
                        85),
                List.of(Ability.OWN_TEMPO,Ability.MOXIE,Ability.MISTY_SURGE), Ability.MISTY_SURGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Varghast is considered fabled due to its rarity. Long ago, they used to hunt in packs, but today they are solitary Pokémon. It howls with great pride during a full moon; comparing its white fur with the moonlight itself."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Varghast");

    }


}
