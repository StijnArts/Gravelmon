package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chinchul extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chinchul() {
        super("Chinchul",
                Type.NORMAL,
                new Stats(50,
                        35,
                        35,
                        20,
                        30,
                        60),
                List.of(Ability.FLUFFY,Ability.PICKUP,Ability.WONDER_SKIN), Ability.WONDER_SKIN,
                3, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                46, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Chinchul is treasured by many trainers because of its soft fur, so the softer the fur, the more desired the Chinchul. Even some trainers give it food for its soft fur."),
                List.of(new EvolutionEntry("chilleap", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))
                ),
                List.of(          new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,16),
                        new MoveLearnSetEntry(Move.ASSURANCE,19),
                        new MoveLearnSetEntry(Move.CRUNCH,22),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,25),
                        new MoveLearnSetEntry(Move.SUPER_FANG,28),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,31),
                        new MoveLearnSetEntry(Move.ENDEAVOR,34)
                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chinchul");

    }


}
