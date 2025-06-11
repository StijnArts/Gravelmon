package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cereblast extends drai.dev.data.pokemon.Pokemon {
    public Cereblast() {
        super("Cereblast",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(95,
                        85,
                        115,
                        135,
                        100,
                        70),
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                20, 165,
                new Stats(0,0,0,3,0,0), 35,
                0.0,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Most records about this Pokemon were burned down in a fire. However it is known that Cereblast can control multiples of its own species as a hivemind."),
                List.of(),
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
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(51)
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
