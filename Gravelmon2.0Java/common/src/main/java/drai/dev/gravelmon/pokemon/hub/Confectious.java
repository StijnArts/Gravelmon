package drai.dev.gravelmon.pokemon.hub;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Confectious extends drai.dev.gravelmon.pokemon.Pokemon {
    public Confectious() {
        super("Confectious",
                Type.FAIRY, Type.POISON,
                new Stats(95,
                        55,
                        70,
                        55,
                        70,
                        10),
                List.of(Ability.GLUTTONY,Ability.STICKY_HOLD,Ability.SWEET_VEIL), Ability.SWEET_VEIL,
                8, 165,
                new Stats(1,0,0,0,0,0), 225,
                0.0,
                71, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of("It is a being of discarded candy that somehow gained sentience and now roams the fairgrounds searching for more sweets to eat. It ensnares opponents in a sticky sugary goo that's nearly impossible to escape by force."),
                List.of(new EvolutionEntry("garbadjinn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,3),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SLUDGE,9),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.SPIT_UP,17),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,20),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,23),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,27),
                        new MoveLearnSetEntry(Move.BELCH,36),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,40),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,44),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,50),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,55),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm")                        ),
                List.of(Label.HUB),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 26, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Confectious");

    }


}
