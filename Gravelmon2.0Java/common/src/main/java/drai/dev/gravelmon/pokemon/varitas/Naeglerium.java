package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Naeglerium extends drai.dev.gravelmon.pokemon.Pokemon {
    public Naeglerium() {
        super("Naeglerium",
                Type.POISON,Type.PSYCHIC,
                new Stats(105,
                        50,
                        90,
                        85,
                        115,
                        40),
                List.of(Ability.MOODY), Ability.MOODY,
                14, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Naeglerium has the ability to psychically feed on thoughts and emotions. It also often acts very unpredictably. Because of these qualities, long-term exposure to Naeglerium is usually not recommended."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,1),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,5),
                        new MoveLearnSetEntry(Move.SLUDGE,8),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,10),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,14),
                        new MoveLearnSetEntry(Move.TOXIC,20),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,25),
                        new MoveLearnSetEntry(Move.VENOSHOCK,35),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,41),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,48),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,53),
                        new MoveLearnSetEntry(Move.PSYCHIC,60)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Naeglerium");

    }


}
