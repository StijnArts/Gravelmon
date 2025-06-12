package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Teekaboo extends drai.dev.data.pokemon.Pokemon {
    public Teekaboo() {
        super("Teekaboo",
                Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("pendodoom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.PSYGATLING,1),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,5),
                        new MoveLearnSetEntry(Move.CURSE,8),
                        new MoveLearnSetEntry(Move.SPITE,13),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,16),
                        new MoveLearnSetEntry(Move.WILLOWISP,20),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,23),
                        new MoveLearnSetEntry(Move.CORNER,28),
                        new MoveLearnSetEntry(Move.DIZZY_WHIRL,31),
                        new MoveLearnSetEntry(Move.LIFE_DRAIN,35),
                        new MoveLearnSetEntry(Move.DARK_HAND,37),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,39),
                        new MoveLearnSetEntry(Move.SNATCH,45),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,51),
                        new MoveLearnSetEntry(Move.GRUDGE,58),
                        new MoveLearnSetEntry(Move.POSSESS,64),
                        new MoveLearnSetEntry(Move.TRICK,72)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Teekaboo");

    }


}
