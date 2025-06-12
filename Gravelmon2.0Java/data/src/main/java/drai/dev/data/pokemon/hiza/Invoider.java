package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Invoider extends drai.dev.data.pokemon.Pokemon {
    public Invoider() {
        super("Invoider",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(70,
                        60,
                        70,
                        90,
                        70,
                        60),
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                11, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                137, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Its brain makes up for most its body and is its only internal organ. It is able to send out shock waves to disable electronic devices."),
                List.of(new EvolutionEntry("cereblast", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))
                ),
                List.of(      new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,4),
                        new MoveLearnSetEntry(Move.CHARGE,7),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,11),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,16),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,20),
                        new MoveLearnSetEntry(Move.PSYSHOCK,25),
                        new MoveLearnSetEntry(Move.ELECTRIFY,31),
                        new MoveLearnSetEntry(Move.PSYCHIC,38),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,43),
                        new MoveLearnSetEntry(Move.COIL,48),
                        new MoveLearnSetEntry(Move.RECOVER,52),
                        new MoveLearnSetEntry(Move.ION_DELUGE,58),
                        new MoveLearnSetEntry(Move.BOLT_BEAK,65),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                       ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
