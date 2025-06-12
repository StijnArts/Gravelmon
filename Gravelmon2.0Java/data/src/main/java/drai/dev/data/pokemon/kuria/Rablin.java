package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rablin extends drai.dev.data.pokemon.Pokemon {
    public Rablin() {
        super("Rablin",
                Type.NORMAL, Type.QUESTION_MARK,
                new Stats(65,
                        125,
                        70,
                        125,
                        70,
                        70),
                List.of(Ability.HEAVYEYED), Ability.HEAVYEYED,
                7, 55,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                167, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Rablin spend most of their life asleep as if under some sort of spell. They are still able to function when asleep, but it's almost as if they're being controlled. When Rablin awakes, they're back to their normal self."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.WILLOWISP,20),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,28),
                        new MoveLearnSetEntry(Move.CURSE,34),
                        new MoveLearnSetEntry(Move.IMPRISON,40),
                        new MoveLearnSetEntry(Move.CALM_MIND,52),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,58)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rablin");

    }


}
