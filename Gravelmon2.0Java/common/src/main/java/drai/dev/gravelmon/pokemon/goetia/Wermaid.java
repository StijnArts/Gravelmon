package drai.dev.gravelmon.pokemon.goetia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Wermaid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wermaid() {
        super("Wermaid",
                Type.WATER, Type.FAIRY,
                new Stats(85,
                        55,
                        110,
                        85,
                        105,
                        50),
                List.of(Ability.WONDER_SKIN,Ability.WATER_ABSORB), Ability.LIQUID_VOICE,
                12, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.PECK, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.CUTE_SHOT, 6),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 9),
                        new MoveLearnSetEntry(Move.WISH, 12),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 15),
                        new MoveLearnSetEntry(Move.AQUA_JET, 18),
                        new MoveLearnSetEntry(Move.SCREECH, 20),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 21),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 24),
                        new MoveLearnSetEntry(Move.SONAR_PULSE, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29)               ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 23, 38, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Wermaid");

    }


}
