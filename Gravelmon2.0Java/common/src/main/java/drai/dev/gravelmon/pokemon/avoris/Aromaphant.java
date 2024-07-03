package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Aromaphant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aromaphant() {
        super("Aromaphant",
                Type.FAIRY,
                new Stats(110,
                        55,
                        65,
                        80,
                        97,
                        56),
                List.of(Ability.HEALER,Ability.SERENE_GRACE,Ability.AROMA_VEIL), Ability.AROMA_VEIL,
                15, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The reason why the air in Avoris is so clean is because Aromaphant also acts as an air purifier by filtering it through its nose. The aroma it produces varies by the berries it consumes. Their aroma is also collected to make expensive perfumes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,3),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,9),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,12),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,15),
                        new MoveLearnSetEntry(Move.ROUND,18),
                        new MoveLearnSetEntry(Move.STRING_SHOT,21),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,24),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,27),
                        new MoveLearnSetEntry(Move.WISH,30),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,33),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.ENDEAVOR,39)
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 48, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_PLAINS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aromaphant");

    }


}
