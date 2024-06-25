package drai.dev.gravelmon.pokemon.norheim;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Fulion extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fulion() {
        super("Fulion",
                Type.STEEL, Type.FIRE,
                new Stats(75,
                        100,
                        100,
                        100,
                        75,
                        75),
                List.of(Ability.STEELY_SPIRIT), Ability.STEELY_SPIRIT,
                17, 0,
                new Stats(0,0,0,0,0,0), 56,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROAR,8),
                        new MoveLearnSetEntry(Move.FLAME_BURST,20),
                        new MoveLearnSetEntry(Move.METAL_SOUND,25),
                        new MoveLearnSetEntry(Move.IRON_TAIL,28),
                        new MoveLearnSetEntry(Move.FIRE_FANG,34),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,45),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,50),
                        new MoveLearnSetEntry(Move.CRUNCH,56),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,62)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fulion");

    }


}
