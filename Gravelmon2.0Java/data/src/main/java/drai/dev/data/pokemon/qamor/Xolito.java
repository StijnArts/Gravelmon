package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Xolito extends drai.dev.data.pokemon.Pokemon {
    public Xolito() {
        super("Xolito",
                Type.FAIRY, Type.FIRE,
                new Stats(75,
                        60,
                        50,
                        55,
                        60,
                        50),
                List.of(Ability.CUTE_CHARM), Ability.HUGE_POWER,
                4, 165,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Certain Xolito were selectively bred specifically so they could not evolve. Despite being kept mostly as pets, most Xolito are still very feisty and continue to have a warrior's heart beat within them, they will not pass up an opportunity to battle and will valiantly protect their loved ones from even the most fiercest foes."),
                List.of(new EvolutionEntry("coyohete", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(             new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,10),
                        new MoveLearnSetEntry(Move.LIGHTUP,13),
                        new MoveLearnSetEntry(Move.SWIFT,15),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,19),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,24),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,28),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,32),
                        new MoveLearnSetEntry(Move.STARSTREAM,35),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,37),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,40),
                        new MoveLearnSetEntry(Move.MORNING_SUN,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,49),
                        new MoveLearnSetEntry(Move.SOLARFLARE,53),
                        new MoveLearnSetEntry(Move.WISH,56),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,61),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,64)           ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Xolito");

    }


}
