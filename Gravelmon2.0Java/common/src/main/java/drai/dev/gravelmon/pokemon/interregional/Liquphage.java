package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Liquphage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Liquphage() {
        super("Liquphage",
                Type.POISON, Type.PSYCHIC,
                new Stats(46,
                        31,
                        31,
                        120,
                        200,
                        34),
                List.of(Ability.PATHOGENIC), Ability.SYNCHRONIZE,
                4, 165,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                161, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Liquphage have no solid form, allowing them to squeeze into the tiniest of spaces. Despite being dangerous to humans, the diseases they carry are ineffective on them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,5),
                        new MoveLearnSetEntry(Move.SMOG,10),
                        new MoveLearnSetEntry(Move.PSYWAVE,15),
                        new MoveLearnSetEntry(Move.REFLECT,19),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,22),
                        new MoveLearnSetEntry(Move.TOXIC,25),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,29),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,34),
                        new MoveLearnSetEntry(Move.PSYSHOCK,38),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,43),
                        new MoveLearnSetEntry(Move.RECOVER,47),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,52),
                        new MoveLearnSetEntry(Move.POISONBURST,56),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,62),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIONWAVE,"tm")                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 27, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Liquphage");

    }


}
