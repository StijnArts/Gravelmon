package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Buppie extends drai.dev.data.pokemon.Pokemon {
    public Buppie() {
        super("Buppie",
                Type.WATER,
                new Stats(65,
                        65,
                        40,
                        45,
                        45,
                        48),
                List.of(Ability.TORRENT), Ability.HEALER,
                8, 165,
                new Stats(1,1,0,0,0,0), 45,
                0.87,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A trainer's best friend. Buppie enjoys playing in shallow pools of water while barking to the sound of thunder."),
                List.of(new EvolutionEntry("bubawl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,5),
                        new MoveLearnSetEntry(Move.BUBBLE,8),
                        new MoveLearnSetEntry(Move.GROWL,11),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,13),
                        new MoveLearnSetEntry(Move.LICK,17),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,19),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,23),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,31),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,35),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,37),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,43)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
