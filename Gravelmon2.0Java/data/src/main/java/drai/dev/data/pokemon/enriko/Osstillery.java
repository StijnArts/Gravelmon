package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Osstillery extends drai.dev.data.pokemon.Pokemon {
    public Osstillery() {
        super("Osstillery",
                Type.NORMAL, Type.FLYING,
                new Stats(77,
                        97,
                        75,
                        67,
                        84,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,5),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,8),
                        new MoveLearnSetEntry(Move.LOCKON,13),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,18),
                        new MoveLearnSetEntry(Move.WING_ATTACK,24),
                        new MoveLearnSetEntry(Move.MUD_BOMB,27),
                        new MoveLearnSetEntry(Move.AGILITY,34),
                        new MoveLearnSetEntry(Move.REVENGE,38),
                        new MoveLearnSetEntry(Move.ROOST,43),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,49),
                        new MoveLearnSetEntry(Move.EGG_BOMB,55)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(34)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Osstillery");

    }


}
