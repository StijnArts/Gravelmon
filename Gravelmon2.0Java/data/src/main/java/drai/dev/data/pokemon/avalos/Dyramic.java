package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dyramic extends drai.dev.data.pokemon.Pokemon {
    public Dyramic() {
        super("Dyramic",
                Type.GRASS, Type.FIGHTING,
                new Stats(93,
                        105,
                        122,
                        52,
                        93,
                        30),
                List.of(Ability.SOLID_ROCK,Ability.IRON_FIST), Ability.REFLEXSTRIKE,
                15, 815,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Fierce defenders of gardens across all of Fliga, Dyramic will halt any would-be tramplers with it's awesome strength. Somewhat selfishly, however, Dyramic will often battle others of it's kind for a beautiful flower to plant in it's vase shell."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.LOW_KICK,13),
                        new MoveLearnSetEntry(Move.ARM_THRUST,17),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,21),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,25),
                        new MoveLearnSetEntry(Move.BULK_UP,33),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,37),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,41),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,45),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,49),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,53),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,57),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,60),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm")                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Dyramic");

    }


}
