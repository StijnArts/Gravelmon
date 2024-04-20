package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cemu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cemu() {
        super("Cemu",
                Type.NORMAL, Type.FLYING,
                new Stats(60,
                        65,
                        50,
                        20,
                        30,
                        75),
                List.of(Ability.SAND_VEIL,Ability.BIG_PECKS,Ability.BOMBARDIER), Ability.BOMBARDIER,
                11, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Their feathers provide perfect camouflage in the sand. Despite their small stature, they pack a vicious kick."),
                List.of(new EvolutionEntry("solkiwi", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,5),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,8),
                        new MoveLearnSetEntry(Move.LOCKON,13),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,18),
                        new MoveLearnSetEntry(Move.WING_ATTACK,24),
                        new MoveLearnSetEntry(Move.MUD_BOMB,27),
                        new MoveLearnSetEntry(Move.AGILITY,34),
                        new MoveLearnSetEntry(Move.REVENGE,38),
                        new MoveLearnSetEntry(Move.ROOST,43),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,49),
                        new MoveLearnSetEntry(Move.EGG_BOMB,55)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 1, 17, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cemu");

    }


}
