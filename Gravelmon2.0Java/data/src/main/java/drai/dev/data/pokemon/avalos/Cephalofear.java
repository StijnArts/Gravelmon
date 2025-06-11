package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cephalofear extends drai.dev.data.pokemon.Pokemon {
    public Cephalofear() {
        super("Cephalofear",
                Type.PSYCHIC, Type.NORMAL,
                new Stats(74,
                        98,
                        63,
                        93,
                        93,
                        69),
                List.of(Ability.DAZZLING,Ability.STICKY_HOLD), Ability.MAGIC_GUARD,
                15, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Despite its far more intimidating appearance, Cephalofear are still quite shy, and prefer to hide their face (or what little remains to fit inside) within the small brown bag it has held onto. To scare away foes or hypnotize prey, it will flash multiple colors across its body, sending any who gaze upon it into a fugue state."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LUMINA_CRASH,45),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                new MoveLearnSetEntry(Move.GROWL,1),
                new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                new MoveLearnSetEntry(Move.FAKE_OUT,8),
                new MoveLearnSetEntry(Move.BITE,13),
                new MoveLearnSetEntry(Move.TEARFUL_LOOK,18),
                new MoveLearnSetEntry(Move.SUCKER_PUNCH,23),
                new MoveLearnSetEntry(Move.CURSE,27),
                new MoveLearnSetEntry(Move.TAIL_SLAP,32),
                new MoveLearnSetEntry(Move.PAIN_SPLIT,37),
                new MoveLearnSetEntry(Move.SUBSTITUTE,42),
                new MoveLearnSetEntry(Move.SCARY_FACE,46),
                new MoveLearnSetEntry(Move.HYPER_VOICE,51),
                new MoveLearnSetEntry(Move.LAST_RESORT,56),
                new MoveLearnSetEntry(Move.FINAL_GAMBIT,61)                ),
        List.of(Label.AVALOS),
                0, List.of(
        ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cephalofear");

    }


}
