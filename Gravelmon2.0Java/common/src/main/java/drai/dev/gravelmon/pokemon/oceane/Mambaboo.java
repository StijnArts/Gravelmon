package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Mambaboo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mambaboo() {
        super("Mambaboo",
                Type.GHOST, Type.POISON,
                new Stats(81,
                        65,
                        67,
                        74,
                        108,
                        92),
                List.of(Ability.PRANKSTER), Ability.POWER_OF_ALCHEMY,
                8, 165,
                new Stats(0,0,0,0,1,1), 60,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Mambaboo channel their Ghost powers through the gem in their rod. Different variations of Mambaboo have been found with different coloured Gems. Their power is so great that they have been known to temporarily revive dead brethen to aid them in battle."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.TOXIC,1),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.VENOSHOCK,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.HEX,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.GLARE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.TRICK,1),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,1),
                        new MoveLearnSetEntry(Move.BONE_CLUB,1),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,1),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 32, 54, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))
                ), List.of(),
                List.of(SpawnPreset.ILLAGER_STRUCTURES),
                0.28, 0.3,
                List.of());
           setLangFileName("Mambaboo");

    }


}
