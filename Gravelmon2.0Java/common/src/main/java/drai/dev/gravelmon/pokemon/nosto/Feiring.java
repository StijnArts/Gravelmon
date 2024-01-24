package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Feiring extends drai.dev.gravelmon.pokemon.Pokemon {
    public Feiring() {
        super("Feiring",
                Type.FAIRY,Type.STEEL,
                new Stats(51,
                        23,
                        40,
                        56,
                        48,
                        43),
                List.of(Ability.MAGIC_BOUNCE,Ability.LIGHT_METAL,Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                52, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.MINERAL),
                List.of("If it takes a liking to a human, it will give them its ring and protect that person from any harm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,5),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.HELPING_HAND,11),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,15),
                        new MoveLearnSetEntry(Move.FLASH,19),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.BODY_PRESS,31),
                        new MoveLearnSetEntry(Move.HEAL_BELL,35),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,38),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,42)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Feiring");

    }


}
