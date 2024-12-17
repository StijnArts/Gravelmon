package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marawder extends drai.dev.data.pokemon.Pokemon {
    public Marawder() {
        super("Marawder",
                Type.WATER, Type.DARK,
                new Stats(90,
                        120,
                        85,
                        75,
                        65,
                        100),
                List.of(Ability.TORRENT), Ability.GUTS,
                22, 1923,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Marawder are towering, brutal Pokémon that have forsaken their kindly demeanor and have fully adopted their instincts as fighters. That is, that's what they'd like for you to think. In private, Marawder are as jovial as ever."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.AQUASLAP,6),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,10),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,13),
                        new MoveLearnSetEntry(Move.ICE_FANG,17),
                        new MoveLearnSetEntry(Move.AQUA_JET,20),
                        new MoveLearnSetEntry(Move.FLIP_TURN,23),
                        new MoveLearnSetEntry(Move.CRUNCH,26),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,30),
                        new MoveLearnSetEntry(Move.LIQUIDATION,34),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,38),
                        new MoveLearnSetEntry(Move.THRASH,42),
                        new MoveLearnSetEntry(Move.GLARE,46),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,50),
                        new MoveLearnSetEntry(Move.AGILITY,55)             ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Marawder");

    }


}
