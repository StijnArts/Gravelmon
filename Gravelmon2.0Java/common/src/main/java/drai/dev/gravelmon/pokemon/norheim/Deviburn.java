package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Deviburn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Deviburn() {
        super("Deviburn",
                Type.FIRE,Type.DARK,
                new Stats(76,
                        86,
                        66,
                        116,
                        96,
                        66),
                List.of(Ability.VITAL_SPIRIT,Ability.INTIMIDATE,Ability.WHITE_SMOKE), Ability.WHITE_SMOKE,
                8, 165,
                new Stats(0,0,0,2,1,0), 30,
                0.5,
                243, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Deviburn travels the inside of houses during the night, going through the chimney. On its way in it gathers charcoal to boost the fire power it possesses. Any presents placed by Delibird are burnt to cinder which may also lead to a house fire."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,6),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,16),
                        new MoveLearnSetEntry(Move.SCARY_FACE,19),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,23),
                        new MoveLearnSetEntry(Move.EMBARGO,26),
                        new MoveLearnSetEntry(Move.FLAME_BURST,29),
                        new MoveLearnSetEntry(Move.DRILL_PECK,39),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,43),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,50),
                        new MoveLearnSetEntry(Move.INFERNO,56),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,62),
                        new MoveLearnSetEntry(Move.TORMENT,73)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Deviburn");

    }


}
