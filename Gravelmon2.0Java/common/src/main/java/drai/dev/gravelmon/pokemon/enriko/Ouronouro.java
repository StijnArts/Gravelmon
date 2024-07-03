package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Ouronouro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ouronouro() {
        super("Ouronouro",
                Type.POISON, Type.PSYCHIC,
                new Stats(110,
                        34,
                        34,
                        102,
                        89,
                        34),
                List.of(Ability.LIQUID_OOZE), Ability.PERPLEXING,
                13, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                233, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its existence is hard to prove, as anyone seeing it is lulled into a mysterious, dreamlike trance. It can summon hallucinations in its foes when endangered."),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.PSYCRUSH,1),
                        new MoveLearnSetEntry(Move.CROSS_POISON,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,1),
                        new MoveLearnSetEntry(Move.PRISM_ATTACK,1),
                        new MoveLearnSetEntry(Move.DISABLE,6),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.SLUDGE,12),
                        new MoveLearnSetEntry(Move.DARK_HAND,17),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,20),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,23),
                        new MoveLearnSetEntry(Move.COUNTER,28),
                        new MoveLearnSetEntry(Move.HYPNOPULSE,31),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,34),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,39),
                        new MoveLearnSetEntry(Move.VILE_VENOM,42),
                        new MoveLearnSetEntry(Move.MEDITATE,45),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.MARVEL_TRICK,53),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,56),
                        new MoveLearnSetEntry(Move.GRIMEBUSTER,61)           ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 31, 56, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ouronouro");

    }


}
