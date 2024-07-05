package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Harpiron extends drai.dev.data.pokemon.Pokemon {
    public Harpiron() {
        super("Harpiron",
                Type.STEEL, Type.FLYING,
                new Stats(65,
                        70,
                        105,
                        90,
                        70,
                        100),
                List.of(Ability.SERENE_GRACE,Ability.UNBURDEN,Ability.STALWART), Ability.STALWART,
                13, 165,
                new Stats(0,0,1,0,0,1), 45,
                0.25,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.HUMAN_LIKE),
                List.of("Harpiron are very fussy and stubborn Pokemon that aren't willing to back down from what they've learned. In ancient times, they were used to guard sacred places."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.HARROWING_WAIL,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.PERISH_SONG,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.ALLURING_VOICE,1),
                        new MoveLearnSetEntry(Move.ENERGY_LOOP,1)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 56, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SANDY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
