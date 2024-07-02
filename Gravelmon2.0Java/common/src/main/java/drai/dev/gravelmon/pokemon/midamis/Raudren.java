package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Raudren extends drai.dev.gravelmon.pokemon.Pokemon {
    public Raudren() {
        super("Raudren",
                Type.ROCK,
                new Stats(95,
                        95,
                        105,
                        50,
                        50,
                        60),
                List.of(Ability.QUICK_FEET), Ability.SPEED_BOOST,
                13, 165,
                new Stats(0,0,2,0,0,1), 45,
                0.5,
                120, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of("An extremely aggressive Pokemon that lives among the highest mountains and inside the lowest valleys of the world. Not the friendliest of Pokemon, Raudren are known to shatter buildings with their hard head."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,13),
                        new MoveLearnSetEntry(Move.ROCK_THROW,17),
                        new MoveLearnSetEntry(Move.LEER,22),
                        new MoveLearnSetEntry(Move.HYPER_FANG,26),
                        new MoveLearnSetEntry(Move.MUD_SPORT,31),
                        new MoveLearnSetEntry(Move.HEADBUTT,35),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,44),
                        new MoveLearnSetEntry(Move.MEGA_KICK,49),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,53),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.FISSURE,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.HARDEN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 44, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Raudren");

    }


}
