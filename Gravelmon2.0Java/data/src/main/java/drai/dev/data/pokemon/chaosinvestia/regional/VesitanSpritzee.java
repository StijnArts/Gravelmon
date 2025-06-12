package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanSpritzee extends drai.dev.data.pokemon.Pokemon {
    public VesitanSpritzee(String name, Aspect aspect) {
        super(name, aspect, "VesitanSpritzee",
                Type.FAIRY,Type.PSYCHIC,
                new Stats(78,
                        23,
                        60,
                        70,
                        63,
                        52),
                List.of(Ability.HEALER,Ability.AROMA_VEIL), null,
                2, 5,
                new Stats(1,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Der von ihm verströmte Duft verzückt jeden, der ihn riecht. Es benutzt ihn um seine Gegner kurzzeitig zu kontrollieren."),
                List.of(new EvolutionEntry("aromatisse vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLAIL,38),
                        new MoveLearnSetEntry(Move.CALM_MIND,17),
                        new MoveLearnSetEntry(Move.CHARM,35),
                        new MoveLearnSetEntry(Move.MOONBLAST,31),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,21),
                        new MoveLearnSetEntry(Move.SWEET_KISS,6),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,50),
                        new MoveLearnSetEntry(Move.PSYCHIC,48),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,8),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,44),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.ATTRACT,29),
                        new MoveLearnSetEntry(Move.CONFUSION,13),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,42),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Spritzee");

    }


}
