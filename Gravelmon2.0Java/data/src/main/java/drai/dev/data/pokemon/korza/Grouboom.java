package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grouboom extends drai.dev.data.pokemon.Pokemon {
    public Grouboom() {
        super("Grouboom",
                Type.GROUND,Type.FLYING,
                new Stats(50,
                        60,
                        80,
                        100,
                        60,
                        100),
                List.of(Ability.RUN_AWAY), Ability.QUICK_FEET,
                14, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                158, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nicknamed prairie boomers for their unique cry, carried across vast distances using their large vocal sac. Grouboom are capable of short flight, but are better suited for running."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.PECK,5),
                        new MoveLearnSetEntry(Move.MUDSLAP,11),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,20),
                        new MoveLearnSetEntry(Move.MUD_SPORT,24),
                        new MoveLearnSetEntry(Move.MUD_SHOT,29),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,31),
                        new MoveLearnSetEntry(Move.WHIRLWIND,34),
                        new MoveLearnSetEntry(Move.AIR_SLASH,38),
                        new MoveLearnSetEntry(Move.MUD_BOMB,42),
                        new MoveLearnSetEntry(Move.AGILITY,47),
                        new MoveLearnSetEntry(Move.BOOMBURST,53),
                        new MoveLearnSetEntry(Move.ROOST,58),
                        new MoveLearnSetEntry(Move.MUDSLIDE,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Grouboom");

    }


}
