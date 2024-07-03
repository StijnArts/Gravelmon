package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Grumbale extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grumbale() {
        super("Grumbale",
                Type.DRAGON, Type.ELECTRIC,
                new Stats(93,
                        87,
                        95,
                        54,
                        65,
                        65),
                List.of(Ability.LIGHTNING_ROD,Ability.ANGER_POINT,Ability.HAYHIDE), Ability.HAYHIDE,
                18, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("The hair covering its body scatters as it thrashes about in a rage. Because the hair contains built-up static electricity, it inflicts a terribly prickly feeling when touched."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BERSERK_FURY,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,1),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,1),
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.ELECTRIFY,"tm"),
                        new MoveLearnSetEntry(Move.ION_DELUGE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 53, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grumbale");

    }


}
