package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Twigit extends drai.dev.data.pokemon.Pokemon {
    public Twigit() {
        super("Twigit",
                Type.GRASS,
                new Stats(58,
                        35,
                        65,
                        45,
                        67,
                        50),
                List.of(Ability.OVERGROW), Ability.SUDDENSEED,
                5, 104,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Twigit are rare Pokémon found in deep forests. While typically smug, if they see a Pokémon in need they will do what they can. The bush around their neck will actually grow berries, which they horde for the winter season."),
                List.of(new EvolutionEntry("harestic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(          new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,3),
                        new MoveLearnSetEntry(Move.LEAFAGE,8),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,43),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,48)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Twigit");

    }


}
