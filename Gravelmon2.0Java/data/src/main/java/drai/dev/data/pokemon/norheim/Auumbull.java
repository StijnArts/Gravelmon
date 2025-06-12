package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Auumbull extends drai.dev.data.pokemon.Pokemon {
    public Auumbull() {
        super("Auumbull",
                Type.PSYCHIC, Type.GROUND,
                new Stats(100,
                        130,
                        100,
                        80,
                        90,
                        70),
                List.of(Ability.RECKLESS), Ability.ANGER_POINT,
                29, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legends speak of a bull whom corrupted the spirit of a cow. Auðumbull uses its tongue, licking the nutrients from both rock and ice; granting the power of gods only for itself."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.MAGNITUDE,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.PSYSHOCK,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,1)),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Auðumbull");

    }


}
