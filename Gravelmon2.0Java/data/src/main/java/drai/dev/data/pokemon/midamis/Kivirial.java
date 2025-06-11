package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kivirial extends drai.dev.data.pokemon.Pokemon {
    public Kivirial() {
        super("Kivirial",
                Type.STEEL, Type.DRAGON,
                new Stats(95,
                        130,
                        110,
                        85,
                        90,
                        90),
                List.of(Ability.IRON_FIST), Ability.IRON_FIST,
                18, 165,
                new Stats(0,0,0,0,0,0), 15,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.SHARPEN,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,30),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,36),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,40),
                        new MoveLearnSetEntry(Move.IRON_HEAD,46),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,62),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,66)                   ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
