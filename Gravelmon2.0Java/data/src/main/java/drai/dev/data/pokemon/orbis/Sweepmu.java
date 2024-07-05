package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sweepmu extends drai.dev.data.pokemon.Pokemon {
    public Sweepmu() {
        super("Sweepmu",
                Type.FIRE, Type.FLYING,
                new Stats(61,
                        83,
                        63,
                        70,
                        95,
                        109),
                List.of(Ability.EARLY_BIRD,Ability.OBLIVIOUS), Ability.FLAME_BODY,
                19, 830,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                168, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Sweepmu live on buildings with chimneys where they spend their days burrowing their heads. They absorb the soot and ash into their plumage which makes them incredibly dense. Despite having wings, it is unable to fly and rather relies on jumping to reach rooftops."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,11),
                        new MoveLearnSetEntry(Move.UPROAR,15),
                        new MoveLearnSetEntry(Move.FLAME_BURST,19),
                        new MoveLearnSetEntry(Move.AMNESIA,22),
                        new MoveLearnSetEntry(Move.PLUCK,24),
                        new MoveLearnSetEntry(Move.AGILITY,29),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,34),
                        new MoveLearnSetEntry(Move.BOUNCE,43),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,49)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sweepmu");

    }


}
