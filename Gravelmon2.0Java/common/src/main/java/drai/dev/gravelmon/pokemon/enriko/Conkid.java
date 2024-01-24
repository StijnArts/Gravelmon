package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Conkid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conkid() {
        super("Conkid",
                Type.ROCK,
                new Stats(50,
                        50,
                        60,
                        25,
                        65,
                        15),
                List.of(Ability.SKILL_LINK,Ability.ROCK_HEAD,Ability.ANALYTIC), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Highly social, known to get very uncomfortable outside of its group. They sleep in huge piles to protect eachother and preserve body heat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.BIDE,5),
                        new MoveLearnSetEntry(Move.ROCK_THROW,7),
                        new MoveLearnSetEntry(Move.PROTECT,13),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,16),
                        new MoveLearnSetEntry(Move.AMNESIA,21),
                        new MoveLearnSetEntry(Move.BARRAGE,26),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,33),
                        new MoveLearnSetEntry(Move.ENDURE,37),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,43)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conkid");

    }


}
