package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bluble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bluble() {
        super("Bluble",
                Type.WATER, Type.COSMIC,
                new Stats(50,
                        30,
                        60,
                        60,
                        60,
                        57),
                List.of(Ability.UNAWARE,Ability.OVERCOAT), Ability.WATER_BUBBLE,
                4, 104,
                new Stats(0,0,0,0,1,0), 150,
                0.5,
                61, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Bluble are seen as the most adorable cosmic Pokémon that exist. Their odd ears release a liquid that protects it from harm, necessary to survive in the rough cosmos."),
                List.of(new EvolutionEntry("humideor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLIP_TURN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,20),
                        new MoveLearnSetEntry(Move.FROST_BREATH,26),
                        new MoveLearnSetEntry(Move.LIQUIDATION,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,37),
                        new MoveLearnSetEntry(Move.SAFEGUARD,42),
                        new MoveLearnSetEntry(Move.SUPERPOWER,48),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 34, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN, Biome.IS_END)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Bluble");

    }


}
