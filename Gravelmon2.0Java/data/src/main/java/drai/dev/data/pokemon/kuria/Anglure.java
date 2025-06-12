package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Anglure extends drai.dev.data.pokemon.Pokemon {
    public Anglure() {
        super("Anglure",
                Type.LIGHT, Type.GHOST,
                new Stats(30,
                        30,
                        35,
                        60,
                        40,
                        60),
                List.of(Ability.WATER_ABSORB,Ability.CURSED_BODY), Ability.ALLURINGGLOW,
                2, 1,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Often living in sunken ships, it is thought that Anglure are the reason the ships sunk in the first place. The lights they emit are seen from deep within the ocean and make those who see it extremely curious, enough so to lead them on a wrong path."),
                List.of(new EvolutionEntry("anglow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(             new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
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
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,58)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Anglure");

    }


}
