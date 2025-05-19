package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Harvesdale extends drai.dev.data.pokemon.Pokemon {
    public Harvesdale() {
        super("Harvesdale",
                Type.PSYCHIC,Type.GROUND,
                new Stats(80,
                        90,
                        105,
                        65,
                        75,
                        85),
                List.of(Ability.HARVEST,Ability.ANGER_POINT), Ability.SHEER_FORCE,
                19, 845,
                new Stats(0,1,2,0,0,0), 40,
                0.5,
                213, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("This hardy mon's durability is unmatched. Harvesdale's body and mind have become incredibly strong, and are often used in rural communities instead of vehicles and equipment."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.TELEKINESIS,6),
                        new MoveLearnSetEntry(Move.MAGNITUDE,14),
                        new MoveLearnSetEntry(Move.PSYWAVE,20),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,25),
                        new MoveLearnSetEntry(Move.MUD_BOMB,29),
                        new MoveLearnSetEntry(Move.BULLDOZE,33),
                        new MoveLearnSetEntry(Move.REVERSAL,38),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.FISSURE,58)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Harvesdale");

    }


}
