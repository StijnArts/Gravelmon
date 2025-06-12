package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Structica extends drai.dev.data.pokemon.Pokemon {
    public Structica() {
        super("Structica",
                Type.ICE,
                new Stats(97,
                        24,
                        98,
                        70,
                        106,
                        20),
                List.of(Ability.SHELL_ARMOR,Ability.SLUSH_RUSH,Ability.ARENA_TRAP), Ability.ARENA_TRAP,
                15, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It catches its prey in its sticky pseudopodia and digests them externally. Fossilized remains of Structica can be found in ancient limestones."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,7),
                        new MoveLearnSetEntry(Move.ICE_BALL,11),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,16),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,21),
                        new MoveLearnSetEntry(Move.GRUDGE,26),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,31),
                        new MoveLearnSetEntry(Move.FLIP_TURN,36),
                        new MoveLearnSetEntry(Move.SELFREPAIR,42),
                        new MoveLearnSetEntry(Move.BLIZZARD,46),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,52)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Structica");

    }


}
