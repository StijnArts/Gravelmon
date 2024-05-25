package drai.dev.gravelmon.pokemon.aristos.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class AristosianGrowlithe extends drai.dev.gravelmon.pokemon.Pokemon {
    public AristosianGrowlithe(int dexNo) {
        super(dexNo,"AristosianGrowlithe",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        60),
                List.of(Ability.INTIMIDATE,Ability.SNOW_CLOAK), Ability.SLUSH_RUSH,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.75,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Aristian Growlithe is often used in sled teams carrying people to and from Mt. Zenith highlands. Its fur seems like it would be warm, but it’s freezing to the touch."),
                List.of(new EvolutionEntry("aristosianarcanine", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:shiny_stone")),
                List.of(           new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,1),
                        new MoveLearnSetEntry(Move.ICICLE_PUNCH,1),
                        new MoveLearnSetEntry(Move.LICK,5),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,8),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,11),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,15),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,18),
                        new MoveLearnSetEntry(Move.HEART_STAMP,21),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,25),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,28),
                        new MoveLearnSetEntry(Move.ICY_KISS,33),
                        new MoveLearnSetEntry(Move.AVALANCHE,39),
                        new MoveLearnSetEntry(Move.BODY_SLAM,44),
                        new MoveLearnSetEntry(Move.FROSTBITE,51),
                        new MoveLearnSetEntry(Move.PERISH_SONG,59),
                        new MoveLearnSetEntry(Move.BLIZZARD,66)             ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 35, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Growlithe");

    }


}
