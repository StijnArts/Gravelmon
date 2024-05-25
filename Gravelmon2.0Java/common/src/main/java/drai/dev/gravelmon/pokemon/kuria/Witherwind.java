package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Witherwind extends drai.dev.gravelmon.pokemon.Pokemon {
    public Witherwind() {
        super("Witherwind",
                Type.BUG, Type.PSYCHIC,
                new Stats(78,
                        65,
                        65,
                        99,
                        108,
                        83),
                List.of(Ability.LEVITATE), Ability.MERCILESS,
                11, 152,
                new Stats(0,0,0,0,2,0), 45,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Witherwind are seen as bad omens to people and Pokémon. They are incredibly immune to disease, they use their psychic ability to neutralize viruses and then telepathically pass them on to fester in other organisms as a survival mechanic. Witherwind has the power to consume anything in its white belly, which is deeper than an Ultra Wormhole."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,7),
                        new MoveLearnSetEntry(Move.DISABLE,11),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,19),
                        new MoveLearnSetEntry(Move.PSYBEAM,22),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,26),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,30),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,33),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,37),
                        new MoveLearnSetEntry(Move.PSYCHIC,41),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,46),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,50),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,55)             ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Witherwind");

    }


}
