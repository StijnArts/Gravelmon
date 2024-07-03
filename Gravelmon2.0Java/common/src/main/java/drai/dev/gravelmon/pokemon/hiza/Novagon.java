package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Novagon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Novagon() {
        super("Novagon",
                Type.DRAGON, Type.STEEL,
                new Stats(65,
                        110,
                        95,
                        130,
                        70,
                        130),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                20, 165,
                new Stats(0,0,0,3,0,0), 25,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("The energy that spills out of its body causes all sorts of strange effects in the atmosphere. At the end of its life cycle, it will fall from the space like a shooting star."),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,6),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,18),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,24),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,42),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,48),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,54),
                        new MoveLearnSetEntry(Move.METAL_BURST,60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,66)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 67, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Novagon");

    }


}
