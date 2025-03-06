package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class Aerapin extends Pokemon {
    public Aerapin() {
        super("Aerapin",
                Type.FLYING,
                new Stats(70,
                        50,
                        65,
                        50,
                        60,
                        40),
                List.of(Ability.CLOUD_NINE, Ability.SHELL_ARMOR), Ability.SERENE_GRACE,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                67, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.FLYING),
                List.of("It can retract its legs into its body and appear to be an ordinary rock. Stories say they arrived on an asteroid hundreds of years ago."),
                List.of(new EvolutionEntry("albashell", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.TWISTER,6),
                        new MoveLearnSetEntry(Move.PLUCK,10),
                        new MoveLearnSetEntry(Move.CHARM,14),
                        new MoveLearnSetEntry(Move.WHIRLWIND,17),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,21),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,25),
                        new MoveLearnSetEntry(Move.AIR_SLASH,28),
                        new MoveLearnSetEntry(Move.TAILWIND,32),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,39),
                        new MoveLearnSetEntry(Move.DEFOG,43),
                        new MoveLearnSetEntry(Move.HURRICANE,47),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,50),
                        new MoveLearnSetEntry(Move.SKULL_BASH,54),
                        new MoveLearnSetEntry(Move.CURSE,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
