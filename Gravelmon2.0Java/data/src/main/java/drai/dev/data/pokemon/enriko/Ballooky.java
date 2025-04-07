package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ballooky extends drai.dev.data.pokemon.Pokemon {
    public Ballooky() {
        super("Ballooky",
                Type.FAIRY, Type.FLYING,
                new Stats(65,
                        40,
                        5,
                        80,
                        100,
                        30),
                List.of(Ability.STATIC,Ability.LIMBER,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                6, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.25,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of("Believed to come from the same ancestor as Jigglypuff. It's thin skin is weak, so it uses its flashing eyes to ward off any would-be predators."),
                List.of(new EvolutionEntry("unseelium", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,7),
                        new MoveLearnSetEntry(Move.NUZZLE,10),
                        new MoveLearnSetEntry(Move.GUST,12),
                        new MoveLearnSetEntry(Move.TAILWIND,16),
                        new MoveLearnSetEntry(Move.HEART_STAMP,18),
                        new MoveLearnSetEntry(Move.RECOVER,20),
                        new MoveLearnSetEntry(Move.MINIMIZE,24),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,26),
                        new MoveLearnSetEntry(Move.TWISTER,30),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,36),
                        new MoveLearnSetEntry(Move.MOONBLAST,40),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,44),
                        new MoveLearnSetEntry(Move.HURRICANE,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ballooky");

    }


}
