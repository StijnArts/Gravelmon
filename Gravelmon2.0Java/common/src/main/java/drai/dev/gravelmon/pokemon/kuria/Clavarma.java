package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Clavarma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clavarma() {
        super("Clavarma",
                Type.STEEL, Type.FIRE,
                new Stats(55,
                        57,
                        85,
                        50,
                        85,
                        28),
                List.of(Ability.HEATPROOF,Ability.CURSED_BODY), Ability.CLEAR_BODY,
                12, 827,
                new Stats(0,0,1,0,0,0), 45,
                0.0,
                110, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("They can raise their internal temperature extremely high. They use this to completely incinerate anything they put inside their body."),
                List.of(new EvolutionEntry("sarcospike", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.EMBER,3),
                        new MoveLearnSetEntry(Move.SMOG,6),
                        new MoveLearnSetEntry(Move.BOLTIN,10),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,15),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,26),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,30),
                        new MoveLearnSetEntry(Move.BURN_UP,34),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,39),
                        new MoveLearnSetEntry(Move.FLAME_BURST,42),
                        new MoveLearnSetEntry(Move.IRON_TAIL,46),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,50),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,55)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 28, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Clavarma");

    }


}
