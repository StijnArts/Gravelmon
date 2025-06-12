package drai.dev.data.pokemon.norheim.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class NorheimanMismagius extends drai.dev.data.pokemon.Pokemon {
    public NorheimanMismagius(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Mismagius",
                Type.GHOST, Type.GRASS,
                stats,
                List.of(Ability.LEVITATE), Ability.GRASSY_SURGE,
                9, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Norheiman Mismagius wanders south as winter approaches. When the cold has passed, it greets spring with harmonic music. It hypnotizes families with children, making them gather around it; and they all begin to dance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.WORRY_SEED,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,3),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,6),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,9),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,13),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,20),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,24),
                        new MoveLearnSetEntry(Move.WILLOWISP,27),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,30),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,34),
                        new MoveLearnSetEntry(Move.HORN_LEECH,38),
                        new MoveLearnSetEntry(Move.CURSE,42),
                        new MoveLearnSetEntry(Move.KARMA_BEAM,47),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,51),
                        new MoveLearnSetEntry(Move.TERRORIZE,55),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,60),
                        new MoveLearnSetEntry(Move.LEAF_STORM,64),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,1)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Mismagius");
        addAdditionalEvolution("misdreavus", new EvolutionEntry("mismagius norheiman", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:dawn_stone"));

    }


}
