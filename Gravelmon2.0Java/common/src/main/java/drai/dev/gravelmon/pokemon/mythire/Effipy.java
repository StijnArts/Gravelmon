package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Effipy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Effipy() {
        super("Effipy",
                Type.STEEL, Type.FLYING,
                new Stats(45,
                        45,
                        60,
                        60,
                        50,
                        60),
                List.of(Ability.SERENE_GRACE,Ability.UNBURDEN,Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                3, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.25,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.HUMAN_LIKE),
                List.of("Its feathers are made of sharp metal fibers that can cut through stone. This Pokemon is very hard to please and will chirp incessantly if it doesn't get its way."),
                List.of(new EvolutionEntry("harpiron", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.HARROWING_WAIL,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.PERISH_SONG,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.ALLURING_VOICE,1),
                        new MoveLearnSetEntry(Move.ENERGY_LOOP,1)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 33, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SANDY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Effipy");

    }


}
