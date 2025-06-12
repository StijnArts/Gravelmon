package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pawstiche extends drai.dev.data.pokemon.Pokemon {
    public Pawstiche() {
        super("Pawstiche",
                Type.GHOST,
                new Stats(101,
                        131,
                        80,
                        62,
                        74,
                        67),
                List.of(Ability.RATTLED), Ability.INTIMIDATE,
                18, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("This Pokemon is startled by any loud noise or sudden movent. However, it also tends to scare others because of its frightening looks. The fur it sheds is commonly used as stuffing in toys."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COTTON_SPORE,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,40),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,2),
                        new MoveLearnSetEntry(Move.SPITE,6),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,10),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,14),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,18),
                        new MoveLearnSetEntry(Move.FRUSTRATION,23),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,28),
                        new MoveLearnSetEntry(Move.BODY_SLAM,33),
                        new MoveLearnSetEntry(Move.CURSE,35),
                        new MoveLearnSetEntry(Move.LASH_OUT,37),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,41),
                        new MoveLearnSetEntry(Move.GRUDGE,45),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,49),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,54),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,"tm")),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(40)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Pawstiche");

    }


}
