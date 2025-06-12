package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanFennekin extends drai.dev.data.pokemon.Pokemon {
    public VesitanFennekin(String name, Aspect aspect) {
        super(name, aspect, "VesitanFennekin",
                Type.GRASS,Type.GHOST,
                new Stats(40,
                        62,
                        60,
                        60,
                        43,
                        50),
                List.of(Ability.OVERGROW,Ability.CONTRARY), null,
                4, 94,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Anstelle eines Snacks kaut es unterwegs auf einem Knochen herum. Knochensammeln ist seine größte Leidenschaft."),
                List.of(new EvolutionEntry("braixen vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,17),
                        new MoveLearnSetEntry(Move.LEECH_SEED,20),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,25),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,31),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SPITE,27),
                        new MoveLearnSetEntry(Move.HORN_LEECH,43),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,46),
                        new MoveLearnSetEntry(Move.WILLOWISP,38),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,14),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,35),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,48),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,41),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.ASTONISH,10),
                        new MoveLearnSetEntry(Move.HOWL,12),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Fennekin");

    }


}
