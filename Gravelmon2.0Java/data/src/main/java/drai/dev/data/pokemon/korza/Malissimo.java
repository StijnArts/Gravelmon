package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Malissimo extends drai.dev.data.pokemon.Pokemon {
    public Malissimo() {
        super("Malissimo",
                Type.NORMAL,Type.FLYING,
                new Stats(50,
                        55,
                        60,
                        55,
                        60,
                        60),
                List.of(Ability.TANGLED_FEET), Ability.CUTE_CHARM,
                8, 200,
                new Stats(0,0,0,0,0,2), 180,
                0.5,
                119, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Each individual has its own vocal range and musical taste. In the wild, flocks will gather and sing together on the Lake's edge."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,14),
                        new MoveLearnSetEntry(Move.SING,18),
                        new MoveLearnSetEntry(Move.SCREECH,22),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,32),
                        new MoveLearnSetEntry(Move.RETURN,36),
                        new MoveLearnSetEntry(Move.AGILITY,39),
                        new MoveLearnSetEntry(Move.SUPERPOWER,43),
                        new MoveLearnSetEntry(Move.BOOMBURST,47),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,53)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Malissimo");

    }


}
