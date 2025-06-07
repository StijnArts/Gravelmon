package drai.dev.data.pokemon.solarlightlunardark;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Atomix extends drai.dev.data.pokemon.Pokemon {
    public Atomix() {
        super("Atomix",
                Type.ELECTRIC,Type.STEEL,
                new Stats(45,
                        30,
                        45,
                        85,
                        55,
                        50),
                List.of(Ability.INFILTRATOR,Ability.GALVANIZE), Ability.RECEIVER,
                2, 1,
                new Stats(0,0,0,0,1,0), 180,
                -1.0,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("Atomix possess a body structure that heavily resembles atoms; researches are being committed on whether this is simply a coincident or something else."),
                List.of(new EvolutionEntry("atomotro", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(
                        new MoveLearnSetEntry(Move.ENERGY_BALL,45),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,41),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,25),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,17),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,33),
                        new MoveLearnSetEntry(Move.ION_DELUGE,21),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.MAGNETPULSE,13),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,49),
                        new MoveLearnSetEntry(Move.WORK_UP,9),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,53),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,29),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,5)),
                List.of(Label.SOLARLIGHTLUNARDARK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Atomix");

    }


}
