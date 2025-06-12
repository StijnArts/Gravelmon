package drai.dev.data.pokemon.rica;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slitharjo extends drai.dev.data.pokemon.Pokemon {
    public Slitharjo() {
        super("Slitharjo",
                Type.GHOST,Type.GROUND,
                new Stats(130,
                        70,
                        60,
                        95,
                        60,
                        100),
                List.of(Ability.MIMICRY,Ability.INFILTRATOR), Ability.REGENERATOR,
                15, 10,
                new Stats(2,0,0,0,0,0), 75,
                0.0,
                181, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_3),
                List.of("With a body that seems neither liquid or solid, this Pokémon slithers around like a shadow. Although harmless, it startles those who are caught offguard when it rises from the ground."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,6),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,10),
                        new MoveLearnSetEntry(Move.MUD_SHOT,14),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,21),
                        new MoveLearnSetEntry(Move.MUD_BOMB,24),
                        new MoveLearnSetEntry(Move.RECOVER,27),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,30),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,33),
                        new MoveLearnSetEntry(Move.JUMPSCARE,37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,41),
                        new MoveLearnSetEntry(Move.MUDSLIDE,45),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,50),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,56),
                        new MoveLearnSetEntry(Move.GLARE,60),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,70),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.WRING_OUT,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 39, 2.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slitharjo");

    }


}
