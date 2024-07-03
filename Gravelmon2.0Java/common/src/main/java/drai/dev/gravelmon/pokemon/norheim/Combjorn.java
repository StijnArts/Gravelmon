package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Combjorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Combjorn() {
        super("Combjorn",
                Type.FIRE, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.BLAZE,Ability.TOUGH_CLAWS,Ability.HONEY_GATHER), Ability.HONEY_GATHER,
                12, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The fire within Combjorn's body keeps it warm during the winter. The only thing that keeps this Pokemon from falling asleep is the sweetness from honey and different berries."),
                List.of(new EvolutionEntry("burnbjorn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.ROAR,7),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,12),
                        new MoveLearnSetEntry(Move.ENCORE,15),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,18),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,23),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,26),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,29),
                        new MoveLearnSetEntry(Move.FRUSTRATION,34),
                        new MoveLearnSetEntry(Move.RETURN,34),
                        new MoveLearnSetEntry(Move.RECOVER,37),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,40),
                        new MoveLearnSetEntry(Move.AGILITY,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48),
                        new MoveLearnSetEntry(Move.HEAL_BELL,51),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,56)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Combjorn");

    }


}
