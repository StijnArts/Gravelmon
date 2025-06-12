package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lagostr extends drai.dev.data.pokemon.Pokemon {
    public Lagostr() {
        super("Lagostr",
                Type.WATER, Type.DARK,
                new Stats(80,
                        70,
                        65,
                        105,
                        85,
                        75),
                List.of(Ability.UNNERVE,Ability.WATER_VEIL,Ability.ANTICIPATION), Ability.ANTICIPATION,
                15, 165,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                168, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,4),
                        new MoveLearnSetEntry(Move.FLAIL,8),
                        new MoveLearnSetEntry(Move.AQUA_JET,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.SCARY_FACE,20),
                        new MoveLearnSetEntry(Move.HEADBUTT,24),
                        new MoveLearnSetEntry(Move.SOAK,28),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,36),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,40),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,44),
                        new MoveLearnSetEntry(Move.THRASH,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,52),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,56)),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
