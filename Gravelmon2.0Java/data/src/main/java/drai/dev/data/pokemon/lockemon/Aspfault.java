package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Aspfault extends Pokemon {
    public Aspfault() {
        super("Aspfault",
                Type.FIRE, Type.GROUND,
                new Stats(65,
                        50,
                        65,
                        25,
                        65,
                        40),
                List.of(Ability.BLAZE), Ability.HYDROPHOBIC,
                13, 216,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Aspfault are highly social creatures. They often use their high body heat to drill through solid rock and stone, creating large tunnel networks inhabited by scores of Therpal and Asfault."),
                List.of(new EvolutionEntry("tarmendoa", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.MUD_SHOT,8),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,13),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,20),
                        new MoveLearnSetEntry(Move.MAGNITUDE,22),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,27),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,29),
                        new MoveLearnSetEntry(Move.FIRE_FANG,34),
                        new MoveLearnSetEntry(Move.AMNESIA,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,41),
                        new MoveLearnSetEntry(Move.RECOVER,43),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,48),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,"egg"),
                        new MoveLearnSetEntry(Move.INFERNO,"egg"),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .isNotRaining()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
