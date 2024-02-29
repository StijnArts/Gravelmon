package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bufaroon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bufaroon() {
        super("Bufaroon",
                Type.GRASS,Type.NORMAL,
                new Stats(65,
                        75,
                        60,
                        75,
                        65,
                        60),
                List.of(Ability.OVERGROW), Ability.SCRAPPY,
                9, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("If trained properly Bufaroon can become great battlers or even gaurd dogs. Through evolution they grow an aggressive nature, but if trained from a Florcoon they can be more of a help. Wild Bufaroons are quite dangerous and warning is given to those who come across any."),
                List.of(new EvolutionEntry("grandaroon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.RAGE,19),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.FRUSTRATION,31),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,37),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,49),
                        new MoveLearnSetEntry(Move.LEAF_STORM,56),
                        new MoveLearnSetEntry(Move.VINE_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.SPORE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE,  16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_BERRY_BUSH),
                0.28, 0.3,
                List.of());
           setLangFileName("Bufaroon");

    }


}
