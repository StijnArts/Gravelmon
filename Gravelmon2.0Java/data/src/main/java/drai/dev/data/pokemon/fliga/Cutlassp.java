package drai.dev.data.pokemon.fliga;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cutlassp extends drai.dev.data.pokemon.Pokemon {
    public Cutlassp() {
        super("Cutlassp",
                Type.BUG, Type.FLYING,
                new Stats(60,
                        120,
                        50,
                        50,
                        70,
                        95),
                List.of(Ability.INFILTRATOR), Ability.STEELY_SPIRIT,
                10, 82,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Waspieres form nests in the damp forests with their own kind. They carry their stingers as sabers, wielding them with intense precision. Waspieres are very competitive, and will spare with just about anything until they either faint or pass out from exhaustion."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,11),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,14),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.SUPERSONIC,22),
                        new MoveLearnSetEntry(Move.UPROAR,27),
                        new MoveLearnSetEntry(Move.PURSUIT,30),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,33),
                        new MoveLearnSetEntry(Move.HYPNOSIS,38),
                        new MoveLearnSetEntry(Move.WING_ATTACK,43),
                        new MoveLearnSetEntry(Move.SCREECH,46),
                        new MoveLearnSetEntry(Move.UTURN,49),
                        new MoveLearnSetEntry(Move.AIR_SLASH,54),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,57)               ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 42, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cutlassp");

    }


}
