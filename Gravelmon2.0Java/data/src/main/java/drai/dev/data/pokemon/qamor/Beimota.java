package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Beimota extends drai.dev.data.pokemon.Pokemon {
    public Beimota() {
        super("Beimota",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(75,
                        40,
                        50,
                        120,
                        100,
                        80),
                List.of(Ability.PRANKSTER), Ability.PRANKSTER,
                16, 165,
                new Stats(0,0,0,2,0,0), 55,
                0.5,
                163, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.MONSTER),
                List.of("Beimota love playing pranks on unsuspecting factory workers, which range from simple stuff like misplacing their tools to shocking them full of electricity. They have a strange mental connection with technology, and can somehow communicate with and through electronics."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,4),
                        new MoveLearnSetEntry(Move.CHARGE,7),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,11),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,16),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,20),
                        new MoveLearnSetEntry(Move.PSYSHOCK,25),
                        new MoveLearnSetEntry(Move.ELECTRIFY,31),
                        new MoveLearnSetEntry(Move.PSYCHIC,38),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,43),
                        new MoveLearnSetEntry(Move.COIL,48),
                        new MoveLearnSetEntry(Move.RECOVER,52),
                        new MoveLearnSetEntry(Move.ION_DELUGE,58),
                        new MoveLearnSetEntry(Move.BOLT_BEAK,65),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Beimota");

    }


}
