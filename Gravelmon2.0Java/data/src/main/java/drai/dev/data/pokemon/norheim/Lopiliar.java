package drai.dev.data.pokemon.norheim;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lopiliar extends drai.dev.data.pokemon.Pokemon {
    public Lopiliar() {
        super("Lopiliar",
                Type.GHOST, Type.PSYCHIC,
                new Stats(80,
                        80,
                        50,
                        82,
                        80,
                        78),
                List.of(Ability.KEEN_EYE,Ability.INFILTRATOR), Ability.MAGICIAN,
                13, 0,
                new Stats(0,0,0,0,0,0), 56,
                -1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MILK_DRINK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.GRUDGE,8),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.CONFUSION,18),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,22),
                        new MoveLearnSetEntry(Move.MEMENTO,26),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,30),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,34),
                        new MoveLearnSetEntry(Move.PSYSHOCK,40),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,46),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,52)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lopiliar");

    }


}
