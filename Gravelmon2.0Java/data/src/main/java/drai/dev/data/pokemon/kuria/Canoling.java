package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Canoling extends drai.dev.data.pokemon.Pokemon {
    public Canoling() {
        super("Canoling",
                Type.FIGHTING,
                new Stats(55,
                        50,
                        60,
                        80,
                        50,
                        55),
                List.of(Ability.MEGA_LAUNCHER,Ability.WEAK_ARMOR), Ability.UNBURDEN,
                6, 326,
                new Stats(0,0,0,1,0,0), 95,
                -1,
                101, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Canoling will roll around, finding anything it can to launch out of the cannon on its head. They are often used for fireworks."),
                List.of(new EvolutionEntry("canoblast", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.IRON_DEFENSE.getName()+"\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,8),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,13),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,17),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,20),
                        new MoveLearnSetEntry(Move.RETALIATE,22),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,28),
                        new MoveLearnSetEntry(Move.COACHING,32),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Canoling");

    }


}
