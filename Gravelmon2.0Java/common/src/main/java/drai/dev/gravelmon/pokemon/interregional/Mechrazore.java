package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Mechrazore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mechrazore() {
        super("Mechrazore",
                Type.STEEL, Type.DRAGON,
                new Stats(170,
                        140,
                        130,
                        90,
                        80,
                        70),
                List.of(Ability.OVERWHELMING), Ability.OVERWHELMING,
                38, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mechrazore is a man-made mechanical beast, with it's gigantic strength used to fight the Ultra Beast threat. Though it proves ultimately destructive of any environment it's placed in, it's methods of disposing of Ultra Beasts are effective."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.LEER,1),
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
                        new MoveLearnSetEntry(Move.HYPER_BEAM,66),
                        new MoveLearnSetEntry(Move.DESTRUCTOBEAM,1)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mechrazore");

    }


}
