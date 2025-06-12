package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Binarray extends drai.dev.data.pokemon.Pokemon {
    public Binarray(Stats stats) {
        super("Binarray",
                Type.NORMAL, Type.ELECTRIC,
                stats,
                List.of(Ability.DOWNLOAD), Ability.INFILTRATOR,
                16, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tampering from various parties caused an unexpected evolution in its code. It eats data and gives off a powerful electric shock which makes it very problematic in technology-heavy areas."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWITCHEROO, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 1),
                        new MoveLearnSetEntry(Move.EMBER, 6),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 14),
                        new MoveLearnSetEntry(Move.SCREECH, 17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 22),
                        new MoveLearnSetEntry(Move.TAUNT, 25),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 28),
                        new MoveLearnSetEntry(Move.ICE_FANG, 33),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 38),
                        new MoveLearnSetEntry(Move.HONE_CLAWS, 44),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 47),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 53)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Binarray");

    }


}
