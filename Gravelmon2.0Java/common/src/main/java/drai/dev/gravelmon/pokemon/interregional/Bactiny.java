package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bactiny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bactiny() {
        super("Bactiny",
                Type.POISON,Type.PSYCHIC,
                new Stats(30,
                        15,
                        15,
                        70,
                        100,
                        34),
                List.of(Ability.PATHOGENIC), Ability.SYNCHRONIZE,
                2, 165,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                52, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Bactiny are believed to be tied to the origin of the Pokerus virus. Contact with these Pokemon can cause numerous illnesses."),
                List.of(new EvolutionEntry("liquphage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,5),
                        new MoveLearnSetEntry(Move.SMOG,10),
                        new MoveLearnSetEntry(Move.PSYWAVE,15),
                        new MoveLearnSetEntry(Move.REFLECT,19),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,22),
                        new MoveLearnSetEntry(Move.TOXIC,25),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,28),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,32),
                        new MoveLearnSetEntry(Move.PSYSHOCK,36),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,40),
                        new MoveLearnSetEntry(Move.RECOVER,43),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,47),
                        new MoveLearnSetEntry(Move.POISONBURST,51),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,56),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIONWAVE,"tm")                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 7, 32, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bactiny");

    }


}
