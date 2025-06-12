package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranSableye extends Pokemon {
    public CefiranSableye(String name, Aspect aspect) {
        super(name, aspect,"CefiranSableye",
                Type.DARK, Type.ROCK,
                new Stats(50,95,75,80,65,65),
                List.of(Ability.HUSTLE), Ability.PRANKSTER,
                5, 110,
                new Stats(0,1,1,0,0,0), 45,
                0.5,
                133, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
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
                        new MoveLearnSetEntry(Move.MEAN_LOOK, 60),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "egg"),
                        new MoveLearnSetEntry(Move.FEINT, "egg"),
                        new MoveLearnSetEntry(Move.FLATTER, "egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK, "egg"),
                        new MoveLearnSetEntry(Move.METAL_BURST, "egg"),
                        new MoveLearnSetEntry(Move.MOONLIGHT, "egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "egg"),
                        new MoveLearnSetEntry(Move.RECOVER, "egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.TRICK, "egg")
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Sableye");
    }
}
