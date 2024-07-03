package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Dubalae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dubalae() {
        super("Dubalae",
                Type.ELECTRIC,
                new Stats(30,
                        45,
                        85,
                        85,
                        50,
                        50),
                List.of(Ability.BATTERY,Ability.CORROSION,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                3, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                68, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its thin shell holds an alkaline material which it uses to produce electricity. Wrapping a cord around its leg will transfer its electrical energy to any device."),
                List.of(new EvolutionEntry("batterode", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.ACID,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,12),
                        new MoveLearnSetEntry(Move.SWIFT,16),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,20),
                        new MoveLearnSetEntry(Move.SPARK,24),
                        new MoveLearnSetEntry(Move.METAL_BURST,28),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,32),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,38),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,42),
                        new MoveLearnSetEntry(Move.ION_DELUGE,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Dubalae");

    }


}
