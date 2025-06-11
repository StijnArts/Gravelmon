package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bleakonda extends drai.dev.data.pokemon.Pokemon {
    public Bleakonda() {
        super("Bleakonda",
                Type.POISON,
                new Stats(90,
                        90,
                        100,
                        74,
                        90,
                        58),
                List.of(Ability.SHED_SKIN,Ability.DRY_SKIN,Ability.MERCILESS), Ability.MERCILESS,
                17, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("It constricts prey and eats them whole. The extremely corrosive acids in its stomach will destroy the body so that the nutrients can be absorbed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COIL,37),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm") ,
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.GLARE,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,18),
                        new MoveLearnSetEntry(Move.SLAM,21),
                        new MoveLearnSetEntry(Move.SCARY_FACE,25),
                        new MoveLearnSetEntry(Move.POISON_FANG,30),
                        new MoveLearnSetEntry(Move.TOXIC,35),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,40),
                        new MoveLearnSetEntry(Move.CORROSIVEBITE,45),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,49),
                        new MoveLearnSetEntry(Move.WRING_OUT,53),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm")),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(36)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
