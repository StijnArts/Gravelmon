package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Manadza extends Pokemon {
    public Manadza() {
        super("Manadza",
                Type.FIRE, Type.PSYCHIC,
                new Stats(105,
                        75,
                        90,
                        160,
                        130,
                        120),
                List.of(Ability.HEAT_HAZE), Ability.HEAT_HAZE,
                35, 9500,
                new Stats(0,0,0,3,0,0), 3,
                -1,
                302, ExperienceGroup.SLOW,
                70,
                200, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokemon is known as 'The embodiment of Summer' by those who know of its existence. Its sheer power locked Kaskade in a seemingly endless summer thousands of years ago."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.VCREATE,1),
                        new MoveLearnSetEntry(Move.WORK_UP,7),
                        new MoveLearnSetEntry(Move.INCINERATE,14),
                        new MoveLearnSetEntry(Move.STORED_POWER,21),
                        new MoveLearnSetEntry(Move.HEADBUTT,28),
                        new MoveLearnSetEntry(Move.ENDURE,35),
                        new MoveLearnSetEntry(Move.PSYCHIC,42),
                        new MoveLearnSetEntry(Move.INFERNO,49),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,56),
                        new MoveLearnSetEntry(Move.SEARING_SHOT,63),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,70),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,77),
                        new MoveLearnSetEntry(Move.OVERHEAT,84),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,91)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(

                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SUMMER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
