package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Scourgeon extends drai.dev.data.pokemon.Pokemon {
    public Scourgeon() {
        super("Scourgeon",
                Type.STEEL, Type.FAIRY,
                new Stats(65,
                        98,
                        75,
                        75,
                        97,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It uses its steel appendages to gouge Cavitrio from the walls of caves, doing so even when not hungry. They sleep in the rain to allow their metal to oxidize overnight."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,11),
                        new MoveLearnSetEntry(Move.VICE_GRIP,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,21),
                        new MoveLearnSetEntry(Move.SUPER_FANG,26),
                        new MoveLearnSetEntry(Move.BATON_PASS,31),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,36),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,41),
                        new MoveLearnSetEntry(Move.METAL_PINCER,46),
                        new MoveLearnSetEntry(Move.SPIT_UP,51),
                        new MoveLearnSetEntry(Move.STOCKPILE,51),
                        new MoveLearnSetEntry(Move.SWALLOW,51),
                        new MoveLearnSetEntry(Move.IRON_HEAD,56),
                        new MoveLearnSetEntry(Move.METAL_BLAST,61),
                        new MoveLearnSetEntry(Move.GUILLOTINE,66)               ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(36)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Scourgeon");

    }


}
