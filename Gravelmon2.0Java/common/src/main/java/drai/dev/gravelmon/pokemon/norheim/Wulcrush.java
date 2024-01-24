package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wulcrush extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wulcrush() {
        super("Wulcrush",
                Type.DARK,Type.WATER,
                new Stats(79,
                        116,
                        80,
                        70,
                        75,
                        90),
                List.of(Ability.MOXIE,Ability.STRONG_JAW,Ability.DARK_AURA), Ability.DARK_AURA,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wulcrush hunts in packs on both shores and in the ocean. They lure their prey by strategically cornering it; while also seeing it as a game."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUASLAP,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wulcrush");

    }


}
