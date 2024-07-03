package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Sirender extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sirender() {
        super("Sirender",
                Type.DARK, Type.DRAGON,
                new Stats(85,
                        125,
                        55,
                        55,
                        80,
                        145),
                List.of(Ability.CUTE_CHARM,Ability.ARENA_TRAP), Ability.INTIMIDATE,
                14, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.INCINERATE,7),
                        new MoveLearnSetEntry(Move.HEADBUTT,14),
                        new MoveLearnSetEntry(Move.SCARY_FACE,21),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,28),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,35),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,49),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,56)                     ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 32, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.SHIP_WRECK, SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
