package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sentresha extends drai.dev.data.pokemon.Pokemon {
    public Sentresha() {
        super("Sentresha",
                Type.ELECTRIC, Type.GHOST,
                new Stats(74,
                        80,
                        53,
                        85,
                        64,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 165,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Sentresha are obsessed with reaching their goal, be it a person or place. They set sail in their makeshift bottle-ship, and zap anything deemed an obstacle in their way."),
                List.of(new EvolutionEntry("origalleon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(          new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,5),
                        new MoveLearnSetEntry(Move.PSYWAVE,7),
                        new MoveLearnSetEntry(Move.CHARGE,10),
                        new MoveLearnSetEntry(Move.ION_DELUGE,13),
                        new MoveLearnSetEntry(Move.GYRO_BALL,15),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,18),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,21),
                        new MoveLearnSetEntry(Move.GRAVITY,25),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,27),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,29),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,45),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,48),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,52),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,55),
                        new MoveLearnSetEntry(Move.MEMENTO,60)              ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
