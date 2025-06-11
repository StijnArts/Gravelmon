package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Flasinge extends Pokemon {
    public Flasinge() {
        super("Flasinge",
                Type.FIRE,
                new Stats(50,50,40,65,65,55),
                List.of(Ability.BLAZE), Ability.INSOMNIA,
                5, 99,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("shaboon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 3),
                        new MoveLearnSetEntry(Move.EMBER, 7),
                        new MoveLearnSetEntry(Move.TAUNT, 9),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 13),
                        new MoveLearnSetEntry(Move.INCINERATE, 17),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 19),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 21),
                        new MoveLearnSetEntry(Move.ACROBATICS, 25),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 27),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, 31),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 33),
                        new MoveLearnSetEntry(Move.CALM_MIND, 37),
                        new MoveLearnSetEntry(Move.MOONBLAST, 39),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, 43),
                        new MoveLearnSetEntry(Move.TRICK, "egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "egg"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, "egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS, "egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "egg"),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, "egg"),
                        new MoveLearnSetEntry(Move.SWEET_KISS, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
