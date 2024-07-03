package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Elegander extends drai.dev.gravelmon.pokemon.Pokemon {
    public Elegander() {
        super("Elegander",
                Type.GRASS, Type.DRAGON,
                new Stats(85,
                        85,
                        70,
                        114,
                        95,
                        85),
                List.of(Ability.OVERGROW), Ability.OVERCOAT,
                19, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The Dragon of the Pond; a book once written a long time ago. A tale of a royal Pokemon sworn to bring justice to all inland lakes and its inhabitants."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHIRP,5),
                        new MoveLearnSetEntry(Move.SEEDSHOT,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,14),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,17),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,20),
                        new MoveLearnSetEntry(Move.WING_ATTACK,24),
                        new MoveLearnSetEntry(Move.BANANARANG,27),
                        new MoveLearnSetEntry(Move.WORRY_SEED,32),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.TAILWIND,41),
                        new MoveLearnSetEntry(Move.AIR_SLASH,45),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,46),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,48),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,52),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,59)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Elegander");

    }


}
