package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Newcleaur extends drai.dev.data.pokemon.Pokemon {
    public Newcleaur() {
        super("Newcleaur",
                Type.DRAGON,
                new Stats(71,
                        173,
                        53,
                        161,
                        41,
                        71),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                29, 0,
                new Stats(0,0,0,3,0,0), 45,
                0.0,
                231, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-29 Destruction. A member of an Ultra Beast, it's said that it's in a perpetual state of anger that's only stopped by fainting. When aggravated enough, it's believed that being near it distorts time and space itself."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,12),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.SCARY_FACE,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,22),
                        new MoveLearnSetEntry(Move.FLAME_BURST,26),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,30),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,38),
                        new MoveLearnSetEntry(Move.LOCKON,41),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,46),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,50),
                        new MoveLearnSetEntry(Move.DRAGON_ENERGY,1)                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Newcleaur");

    }


}
