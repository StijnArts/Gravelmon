package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranMeowthIce extends Pokemon {
    public CefiranMeowthIce(String name, Aspect aspect) {
        super(name, aspect,"CefiranMeowthIce",
                Type.NORMAL, Type.ICE,
                new Stats(50,65,35,90,40,40),
                List.of(Ability.PICKUP), Ability.TECHNICIAN,
                4, 42,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("Due to its delicate fur and its psychic powers, even veteran Trainers find it difficult to raise this Pokemon."),
                List.of(new EvolutionEntry("CefiranPersianIce", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.BITE, 6),
                        new MoveLearnSetEntry(Move.EMBER, 9),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 14),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 22),
                        new MoveLearnSetEntry(Move.TAUNT, 25),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 30),
                        new MoveLearnSetEntry(Move.ICE_FANG, 30),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 30),
                        new MoveLearnSetEntry(Move.SLASH, 33),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 38),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 41),
                        new MoveLearnSetEntry(Move.CAPTIVATE, 46),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 49),
                        new MoveLearnSetEntry(Move.FEINT, 54),

                        new MoveLearnSetEntry(Move.AMNESIA, "egg"),
                        new MoveLearnSetEntry(Move.ASSIST, "egg"),
                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS, "egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "egg"),
                        new MoveLearnSetEntry(Move.RETURN, "egg"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH, "egg"),
                        new MoveLearnSetEntry(Move.PUNISHMENT, "egg"),
                        new MoveLearnSetEntry(Move.SNATCH, "egg"),
                        new MoveLearnSetEntry(Move.SPITE, "egg"),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, "egg")
                ),
                List.of(Label.OPAL, Label.GEN1),
                4, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .setAntiBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Meowth");

    }
}
