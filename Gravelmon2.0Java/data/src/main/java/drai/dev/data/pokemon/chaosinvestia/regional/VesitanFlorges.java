package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanFlorges extends drai.dev.data.pokemon.Pokemon {
    public VesitanFlorges(String name, Aspect aspect) {
        super(name, aspect, "VesitanFlorges",
                Type.FAIRY,Type.POISON,
                new Stats(80,
                        67,
                        74,
                        73,
                        117,
                        137),
                List.of(Ability.FLOWER_VEIL,Ability.SYMBIOSIS), null,
                11, 100,
                new Stats(0,0,0,0,0,3), 255,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Wunderschöne Blumengärten sind sein Revier. Sollte sich jemand ungewollt nähern, setzt es ein tödliches Giftgas frei."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,10),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,51),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,58),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VENOSHOCK,25),
                        new MoveLearnSetEntry(Move.MOONBLAST,46),
                        new MoveLearnSetEntry(Move.WISH,20),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,33),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,38),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,43),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,27)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 46, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Florges");

    }


}
