package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Steetic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Steetic() {
        super("Steetic",
                Type.NORMAL, Type.ELECTRIC,
                new Stats(40,
                        65,
                        40,
                        65,
                        40,
                        100),
                List.of(Ability.STATIC), Ability.PICKPOCKET,
                6, 147,
                new Stats(0,0,0,0,0,1), 120,
                0.25,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Steetic is a very weak Pokémon that steals and deceives to survive. It uses the immense amounts of static electricity in its mane to stun enemies and escape battles."),
                List.of(new EvolutionEntry("cheetatic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.SWITCHEROO, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 1),
                        new MoveLearnSetEntry(Move.EMBER, 6),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 14),
                        new MoveLearnSetEntry(Move.SCREECH, 17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 22),
                        new MoveLearnSetEntry(Move.TAUNT, 25),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 28),
                        new MoveLearnSetEntry(Move.ICE_FANG, 33),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 38),
                        new MoveLearnSetEntry(Move.HONE_CLAWS, 44),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 47),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 53)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 29, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Steetic");

    }


}
