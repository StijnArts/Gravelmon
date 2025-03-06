package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Motholus extends drai.dev.data.pokemon.Pokemon {
    public Motholus() {
        super("Motholus",
                Type.BUG, Type.GHOST,
                new Stats(80,
                        71,
                        50,
                        102,
                        99,
                        79),
                List.of(Ability.INTIMIDATE,Ability.SWARM), Ability.SHADOW_TAG,
                0, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite being primarily a nocturnal Pokémon, Motholus is awake during any time of the day. The forest floor in the dark and dense forests where it resides has never seen the light of day. Traveling through the very same forests will certainly make you go astray and eyes will be watching you as you loose your sense of direction."),
                List.of(),
                List.of(               new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SPITE,7),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,10),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,21),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,25),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,33),
                        new MoveLearnSetEntry(Move.TAILWIND,38),
                        new MoveLearnSetEntry(Move.CORROSIVEBITE,43),
                        new MoveLearnSetEntry(Move.STICKY_WEB,48),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,52),
                        new MoveLearnSetEntry(Move.NIGHTMARE,59)         ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 34, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Motholus");

    }


}
