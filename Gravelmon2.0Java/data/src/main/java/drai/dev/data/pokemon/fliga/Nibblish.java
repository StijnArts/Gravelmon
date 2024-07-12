package drai.dev.data.pokemon.fliga;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nibblish extends drai.dev.data.pokemon.Pokemon {
    public Nibblish() {
        super("Nibblish",
                Type.WATER,
                new Stats(65,
                        57,
                        50,
                        44,
                        41,
                        56),
                List.of(Ability.TORRENT), Ability.GUTS,
                9, 200,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                63, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Nibblish are rough-and-tumble by nature, and enjoy playfighting with all sorts of Pokémon. They often will bite too hard while playing, and will feel bad for days."),
                List.of(new EvolutionEntry("vicera", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
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
                        new MoveLearnSetEntry(Move.AGILITY,55)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Nibblish");

    }


}
