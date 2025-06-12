package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stingpin extends drai.dev.data.pokemon.Pokemon {
    public Stingpin() {
        super("Stingpin",
                Type.DARK, Type.DRAGON,
                new Stats(67,
                        117,
                        69,
                        72,
                        61,
                        90),
                List.of(Ability.HUSTLE,Ability.EXPLOITATIVE), Ability.SHARPNESS,
                17, 827,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.HUMAN_LIKE),
                List.of("Stingpin use their tails as a powerful sabers, which they aim towards the heart of their enemy if they should feel threatened. They are known to be incredibly selfish and envious of other Pokémon, and sometimes even humans. Stingpin will often meet with Honchkrow to trade stolen goods."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.TRICK,4),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,7),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,11),
                        new MoveLearnSetEntry(Move.SLASH,15),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,20),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,24),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,28),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,30),
                        new MoveLearnSetEntry(Move.TAUNT,32),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,36),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,40),
                        new MoveLearnSetEntry(Move.IRON_TAIL,44),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,48),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,51),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,55),
                        new MoveLearnSetEntry(Move.FAKE_OUT,59),
                        new MoveLearnSetEntry(Move.OUTRAGE,63)                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Stingpin");

    }


}
