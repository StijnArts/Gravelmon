package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class TrishoutX extends Pokemon {
    public TrishoutX(String name, Aspect aspect) {
        super(name, aspect,"TrishoutX",
                Type.FIRE, Type.SOUND,
                new Stats(68, 125, 60, 115, 60, 72),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 65,
                new Stats(0,0,0,0,0,1), 45,
                -1,
                90, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("Made of pure X Energy, this Pokemon attacks its enemies ruthlessly until you knock them out."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABBLE,6),
                        new MoveLearnSetEntry(Move.HOWL,9),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,13),
                        new MoveLearnSetEntry(Move.FIRE_FANG,18),
                        new MoveLearnSetEntry(Move.UPROAR,22),
                        new MoveLearnSetEntry(Move.CRUNCH,26),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.SWAGGER,40),
                        new MoveLearnSetEntry(Move.BOOMBURST,45),
                        new MoveLearnSetEntry(Move.INFERNO,51),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,61)
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Trishout");

    }
}
