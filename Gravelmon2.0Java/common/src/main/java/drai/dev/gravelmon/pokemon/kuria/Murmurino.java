package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Murmurino extends drai.dev.gravelmon.pokemon.Pokemon {
    public Murmurino() {
        super("Murmurino",
                Type.FIRE, Type.SOUND,
                new Stats(53,
                        66,
                        74,
                        83,
                        74,
                        30),
                List.of(Ability.ROARINGHORN), Ability.ROARINGHORN,
                11, 549,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                103, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("cerarmor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABBLE,6),
                        new MoveLearnSetEntry(Move.HOWL,9),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,13),
                        new MoveLearnSetEntry(Move.FIRE_FANG,18),
                        new MoveLearnSetEntry(Move.UPROAR,23),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.SWAGGER,40),
                        new MoveLearnSetEntry(Move.BOOMBURST,45),
                        new MoveLearnSetEntry(Move.INFERNO,51),
                        new MoveLearnSetEntry(Move.CRUNCH,56),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,61)         ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Murmurino");

    }


}
