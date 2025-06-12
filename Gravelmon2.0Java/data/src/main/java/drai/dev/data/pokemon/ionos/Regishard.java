package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Regishard extends drai.dev.data.pokemon.Pokemon {
    public Regishard() {
        super("Regishard",
                Type.PSYCHIC, Type.DARK,
                new Stats(60,
                        98,
                        110,
                        92,
                        170,
                        50),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                23, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Regishard's codes were once found in the Toxic Jungles of the southern part of Ionios. Being nearly impossible to encrypt, scientists succeeded to reveal a 'formula for a darker future' in its data. Nobody does however know the true intentions of this Legendary Golem from far beyond."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYBEAM,1),
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,8),
                        new MoveLearnSetEntry(Move.SPITE,16),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,24),
                        new MoveLearnSetEntry(Move.CURSE,30),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,34),
                        new MoveLearnSetEntry(Move.PSYSHOCK,39),
                        new MoveLearnSetEntry(Move.MIND_READER,41),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,46),
                        new MoveLearnSetEntry(Move.GLARE,50),
                        new MoveLearnSetEntry(Move.DARK_PULSE,55),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,61),
                        new MoveLearnSetEntry(Move.SUPERPOWER,67)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Regishard");

    }


}
