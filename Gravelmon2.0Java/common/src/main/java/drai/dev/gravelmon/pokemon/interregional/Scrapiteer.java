package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Scrapiteer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scrapiteer() {
        super("Scrapiteer",
                Type.STEEL, Type.POISON,
                new Stats(78,
                        65,
                        75,
                        87,
                        78,
                        88),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,5),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,8),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,11),
                        new MoveLearnSetEntry(Move.METAL_CLAW,15),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,22),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,26),
                        new MoveLearnSetEntry(Move.METAL_SOUND,29),
                        new MoveLearnSetEntry(Move.POISON_JAB,33),
                        new MoveLearnSetEntry(Move.SCARY_FACE,36),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,38),
                        new MoveLearnSetEntry(Move.TOXIC,43),
                        new MoveLearnSetEntry(Move.CROSS_POISON,46),
                        new MoveLearnSetEntry(Move.GUILLOTINE,51)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 47, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Scrapiteer");

    }


}
