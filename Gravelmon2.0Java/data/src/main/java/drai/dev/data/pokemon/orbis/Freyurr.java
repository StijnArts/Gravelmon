package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Freyurr extends drai.dev.data.pokemon.Pokemon {
    public Freyurr() {
        super("Freyurr",
                Type.PSYCHIC, Type.NORMAL,
                new Stats(70,
                        70,
                        60,
                        105,
                        110,
                        80),
                List.of(Ability.FLUFFY,Ability.TELEPATHY), Ability.FUR_COAT,
                18, 1450,
                new Stats(0,0,0,1,1,0), 45,
                0.33,
                216, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Freyurr surround itself with orbs using its psychic energy and fires them at anyone who threatens its trainer. Their fur is incredibly soft and dense."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,4),
                        new MoveLearnSetEntry(Move.CONFUSION,8),
                        new MoveLearnSetEntry(Move.ASSIST,15),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,22),
                        new MoveLearnSetEntry(Move.PSYBEAM,26),
                        new MoveLearnSetEntry(Move.RETURN,29),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,31),
                        new MoveLearnSetEntry(Move.ATTRACT,35),
                        new MoveLearnSetEntry(Move.MYSTICORB,37),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,43),
                        new MoveLearnSetEntry(Move.REVIVAL_BLESSING,45),
                        new MoveLearnSetEntry(Move.CAPTIVATE,48),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,51),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ASSIST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Freyurr");

    }


}
