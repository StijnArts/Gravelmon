package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Germinell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Germinell() {
        super("Germinell",
                Type.NORMAL,
                new Stats(85,
                        20,
                        10,
                        35,
                        60,
                        30),
                List.of(Ability.CLEAR_BODY,Ability.DAMP,Ability.REGENERATOR), Ability.REGENERATOR,
                1, 165,
                new Stats(1,0,0,0,0,0), 180,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("hyriginell", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))
                ),
                List.of(           new MoveLearnSetEntry(Move.CONVERSION,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,15),
                        new MoveLearnSetEntry(Move.PSYBEAM,20),
                        new MoveLearnSetEntry(Move.CONVERSION_2,25),
                        new MoveLearnSetEntry(Move.AGILITY,30),
                        new MoveLearnSetEntry(Move.RECOVER,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,45),
                        new MoveLearnSetEntry(Move.LOCKON,50),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,55),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,60)),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Germinell");

    }


}
