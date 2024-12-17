package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Calligraphis extends drai.dev.data.pokemon.Pokemon {
    public Calligraphis() {
        super("Calligraphis",
                Type.GHOST, Type.WATER,
                new Stats(41,
                        73,
                        73,
                        107,
                        113,
                        163),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                34, 0,
                new Stats(0,0,0,0,0,3), 30,
                0.0,
                257, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-025 Inkstroke. One of the Ultra Beasts. Its body can fit into any gap, even if the gap is down to the molecular level. Despite this, it's body possess volume like any other living creature."),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.AGILITY,7),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,9),
                        new MoveLearnSetEntry(Move.SPITE,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.SING,20),
                        new MoveLearnSetEntry(Move.NIGHTMARE,21),
                        new MoveLearnSetEntry(Move.HEART_STAMP,22),
                        new MoveLearnSetEntry(Move.FLAIL,26),
                        new MoveLearnSetEntry(Move.GRUDGE,31),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,34),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,37),
                        new MoveLearnSetEntry(Move.AQUA_RING,40),
                        new MoveLearnSetEntry(Move.SOAK,42),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,49)           ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Calligraphis");
        setCanSwim(true);
        setCanBreathUnderwater(true);

    }


}
