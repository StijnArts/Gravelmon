package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanChesnaught extends drai.dev.data.pokemon.Pokemon {
    public VesitanChesnaught(String name, Aspect aspect) {
        super(name, aspect, "VesitanChesnaught",
                Type.WATER,Type.PSYCHIC,
                new Stats(92,
                        67,
                        85,
                        75,
                        107,
                        122),
                List.of(Ability.TORRENT,Ability.BULLETPROOF), null,
                16, 900,
                new Stats(0,0,3,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Meditation hat diesem Pokémon erlaubt in seinen Träumen durch Zeit und Raum zu reisen. Man sagt es hat schon alles gesehen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.WATER_PULSE,15),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,60),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.AQUA_RING,20),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,48),
                        new MoveLearnSetEntry(Move.HYPNOSIS,36),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,40),
                        new MoveLearnSetEntry(Move.PSYCHIC,55),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,70),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.SURF,43),
                        new MoveLearnSetEntry(Move.RECOVER,30),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,75),
                        new MoveLearnSetEntry(Move.PSYSHOCK,35),
                        new MoveLearnSetEntry(Move.PSYBEAM,26)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Chesnaught");

    }


}
