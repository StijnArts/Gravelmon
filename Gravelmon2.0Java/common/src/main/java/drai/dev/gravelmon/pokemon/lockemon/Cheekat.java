package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cheekat extends Pokemon {
    public Cheekat() {
        super("Cheekat",
                Type.NORMAL,
                new Stats(80,
                        75,
                        70,
                        50,
                        60,
                        85),
                List.of(Ability.CHEEK_POUCH, Ability.PRANKSTER), Ability.GLUTTONY,
                9, 220,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                153, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.FAIRY),
                List.of("Cheekat isn't able evolve in the wild, so it's thought that they chose a feline form to be better suited for humans. This seems to have worked, as Cheekat are often used for their hypnotic abilities by those with insomnia."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.PAY_DAY,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.HYPNOSIS,24),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,31),
                        new MoveLearnSetEntry(Move.SCREECH,36),
                        new MoveLearnSetEntry(Move.SLASH,42),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,48),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,54),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.COMMON, 20, 42, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
