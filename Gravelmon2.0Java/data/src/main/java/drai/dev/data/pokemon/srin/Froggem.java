package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Froggem extends drai.dev.data.pokemon.Pokemon {
    public Froggem() {
        super("Froggem",
                Type.GROUND,Type.FIGHTING,
                new Stats(88,
                        52,
                        74,
                        42,
                        72,
                        56),
                List.of(Ability.SIMPLE,Ability.STICKY_HOLD), Ability.RATTLED,
                12, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("When startled, it blows up its hand-like cheeks and then throws soft and sticky punches at the target. It never means any harm."),
                List.of(new EvolutionEntry("toady", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.FISSURE,1),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,1),
                        new MoveLearnSetEntry(Move.FORCE_PALM,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(18).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MANGROVE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Froggem");

    }


}
