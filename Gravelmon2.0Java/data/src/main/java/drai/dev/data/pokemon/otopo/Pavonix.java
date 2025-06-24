package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pavonix extends drai.dev.data.pokemon.Pokemon {
    public Pavonix() {
        super("Pavonix",
                Type.FIRE, Type.FLYING,
                new Stats(90,
                        95,
                        75,
                        115,
                        80,
                        75),
                List.of(Ability.BLAZE,Ability.FLASH_FIRE), Ability.STURDY,
                17, 395,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Pavonix are exceedingly vain and are frequently kept by wealthy households. They are known to spend hours cleaning each feather, but will only stop when confronted with a formidable opponent. According to legend, this Pokemon was created from the ashes of the legendary Ho-oh."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PECK,5),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,11),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,15),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,18),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,24),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,27),
                        new MoveLearnSetEntry(Move.SLASH,33),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,37),
                        new MoveLearnSetEntry(Move.FLAME_BURST,40),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,46),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm")                     ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_HIGHLANDS).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Pavonix");

    }


}
