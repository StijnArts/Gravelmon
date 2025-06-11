package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nymphemeral extends drai.dev.data.pokemon.Pokemon {
    public Nymphemeral() {
        super("Nymphemeral",
                Type.BUG, Type.GHOST,
                new Stats(70,
                        70,
                        85,
                        85,
                        90,
                        50),
                List.of(Ability.CURSED_BODY,Ability.SHADOW_TAG,Ability.PERISH_BODY), Ability.PERISH_BODY,
                12, 165,
                new Stats(0,0,0,0,2,0), 80,
                0.5,
                158, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The discarded husk of a Maynoon that had reached the end of its life. It's possessed by some lingering essence of its former self, so it floats aimlessly throughout the night."),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,1),
                        new MoveLearnSetEntry(Move.GRUDGE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.ABSORB,23),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,29),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,36),
                        new MoveLearnSetEntry(Move.MIND_READER,43),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,50),
                        new MoveLearnSetEntry(Move.SPITE,57),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,64)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_RIVER)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setCanFly(true);

    }


}
