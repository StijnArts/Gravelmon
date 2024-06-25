package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Magrumble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magrumble() {
        super("Magrumble",
                Type.FIRE, Type.ROCK,
                new Stats(85,
                        50,
                        90,
                        80,
                        80,
                        20),
                List.of(Ability.BLAZE), Ability.EARTH_EATER,
                15, 943,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("Magrumble are noted as being quite simple, enjoying food and basic forms of comedy as entertainment. They will make, quote, 'lava-farts' with their mouths and hand, much to the amusement of more immature trainers."),
                List.of(new EvolutionEntry("obsidious", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.INCINERATE,12),
                        new MoveLearnSetEntry(Move.REFRESH,16),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,22),
                        new MoveLearnSetEntry(Move.RECYCLE,25),
                        new MoveLearnSetEntry(Move.FLAME_BURST,27),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,34),
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,36),
                        new MoveLearnSetEntry(Move.BURN_UP,41),
                        new MoveLearnSetEntry(Move.RECOVER,43),
                        new MoveLearnSetEntry(Move.BODY_PRESS,48),
                        new MoveLearnSetEntry(Move.EARTH_POWER,50),
                        new MoveLearnSetEntry(Move.ERUPTION,55)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER, Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magrumble");

    }


}
