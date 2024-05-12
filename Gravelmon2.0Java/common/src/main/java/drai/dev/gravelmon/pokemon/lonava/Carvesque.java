package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Carvesque extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carvesque() {
        super("Carvesque",
                Type.DARK, Type.ROCK,
                new Stats(76,
                        87,
                        95,
                        54,
                        65,
                        33),
                List.of(Ability.TRUANT), Ability.TRUANT,
                15, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Carvesque, embittered by how it was mistreated, has adopted a smug and pompous demeanour. It hates to listen to its trainer."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.FORESIGHT, 4),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 8),
                        new MoveLearnSetEntry(Move.ASTONISH, 11),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 15),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 18),
                        new MoveLearnSetEntry(Move.DETECT, 22),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, 25),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 29),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 39),
                        new MoveLearnSetEntry(Move.POWER_GEM, 43),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 46),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 53),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 57),
                        new MoveLearnSetEntry(Move.MEAN_LOOK, 60)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 29, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Carvesque");

    }


}
