package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hatgic extends drai.dev.data.pokemon.Pokemon {
    public Hatgic() {
        super("Hatgic",
                Type.GHOST,
                new Stats(55,
                        45,
                        50,
                        80,
                        50,
                        70),
                List.of(Ability.MAGICIAN,Ability.CLEAR_BODY), Ability.MAGIC_BOUNCE,
                3, 50,
                new Stats(0,0,0,1,0,0), 50,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- Confusion Psychic 5 Confuse Ray Ghost 13 Trick Psychic 16 Curse Ghost 20 Psywave Psychic 24 Ominous WindSTAB Ghost 27 Psyshock Psychic 29 Trick Room Psychic 32 Switcheroo Dark 34 Teleport Psychic 40 Destiny Bond Ghost 45 Shadow BallSTAB Ghost"),
                List.of(new EvolutionEntry("hoodrikus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,5),
                        new MoveLearnSetEntry(Move.TRICK,13),
                        new MoveLearnSetEntry(Move.CURSE,16),
                        new MoveLearnSetEntry(Move.PSYWAVE,20),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,24),
                        new MoveLearnSetEntry(Move.PSYSHOCK,27),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,29),
                        new MoveLearnSetEntry(Move.SWITCHEROO,32),
                        new MoveLearnSetEntry(Move.TELEPORT,34),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,40),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,45)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hatgic");

    }


}
