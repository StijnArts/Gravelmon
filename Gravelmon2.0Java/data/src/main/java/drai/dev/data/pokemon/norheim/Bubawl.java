package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Bubawl extends drai.dev.data.pokemon.Pokemon {
    public Bubawl() {
        super("Bubawl",
                Type.WATER, Type.FAIRY,
                new Stats(88,
                        88,
                        50,
                        55,
                        65,
                        68),
                List.of(Ability.TORRENT), Ability.HEALER,
                12, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Bubawl cries large pools of water when scared and is terrified of the thunder. Its tongue has magical properties and will heal any wound."),
                List.of(new EvolutionEntry("brinarder", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
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
                ), new PokemonSpawnDataBuilder(2)
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
