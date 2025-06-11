package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hooptie extends drai.dev.data.pokemon.Pokemon {
    public Hooptie() {
        super("Hooptie",
                Type.STEEL,
                new Stats(50,
                        50,
                        65,
                        40,
                        70,
                        90),
                List.of(Ability.STEAM_ENGINE,Ability.SPEED_BOOST,Ability.CORROSION), Ability.CORROSION,
                9, 165,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Legends say that Hooptie are born from car crash wreckage, but in reality they just congregate in junkyards. They love to drink oil."),
                List.of(new EvolutionEntry("wreckyard", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,13),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,16),
                        new MoveLearnSetEntry(Move.GEAR_GRIND,20),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,23),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,32),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,36),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,46),
                        new MoveLearnSetEntry(Move.SKULL_BASH,51),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,55),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Hooptie");

    }


}
