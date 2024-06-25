package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Dragerg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dragerg() {
        super("Dragerg",
                Type.DRAGON, Type.FAIRY,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                70, 1250,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                189, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("A mystical Pokémon that exudes a mystical energy. Described in legend, its skin gives off the most entrancing spectrum of colour. If shed, this skin can be used to make clothes impervious to damage."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKY_ATTACK,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.WITHDRAW,10),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,19),
                        new MoveLearnSetEntry(Move.CHARM,23),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,28),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,34),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,40),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,44),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,50),
                        new MoveLearnSetEntry(Move.MOONLIGHT,53),
                        new MoveLearnSetEntry(Move.MOONBLAST,59),
                        new MoveLearnSetEntry(Move.OUTRAGE,65),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,72),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm")                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dragergé");

    }


}
