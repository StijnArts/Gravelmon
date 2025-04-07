package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skenteur extends drai.dev.data.pokemon.Pokemon {
    public Skenteur() {
        super("Skenteur",
                Type.FAIRY, Type.POISON,
                new Stats(63,
                        41,
                        41,
                        74,
                        47,
                        63),
                List.of(Ability.AROMA_VEIL), Ability.FUR_COAT,
                5, 194,
                new Stats(0,0,0,1,0,0), 225,
                0.25,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Skenteur are known for their sweet aromas that are used in the finest perfumes across the world. However like their cousins Stunky, they are able to create putrid smelling gas that they fire at their opponents when threatened."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.SMOG,3),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,7),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,14),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,18),
                        new MoveLearnSetEntry(Move.SLUDGE,20),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,22),
                        new MoveLearnSetEntry(Move.ENCORE,27),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,32),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,37),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,43),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,46),
                        new MoveLearnSetEntry(Move.BELCH,49),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SMOG,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Skenteur");

    }


}
