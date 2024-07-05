package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Destructos extends drai.dev.data.pokemon.Pokemon {
    public Destructos() {
        super("Destructos",
                Type.ROCK, Type.FIGHTING,
                new Stats(80,
                        120,
                        100,
                        80,
                        90,
                        49),
                List.of(Ability.MAGIC_BOUNCE,Ability.SHEER_FORCE), Ability.IRON_FIST,
                23, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Destructos is a force to be reckoned with. Each step that this ancient Pokémon takes causes small earthquakes. Only the finest marble pillar is chosen as its weapon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REVENGE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.RELICPILLAR,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,11),
                        new MoveLearnSetEntry(Move.AMNESIA,17),
                        new MoveLearnSetEntry(Move.BULK_UP,20),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,23),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,27),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,30),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,35),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,40),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,45),
                        new MoveLearnSetEntry(Move.SAND_TOMB,49),
                        new MoveLearnSetEntry(Move.STONE_EDGE,52),
                        new MoveLearnSetEntry(Move.SUPERPOWER,60),
                        new MoveLearnSetEntry(Move.POWER_GEM,65),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,70),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,"tm")                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 36, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPRING))
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Destructos");

    }


}
