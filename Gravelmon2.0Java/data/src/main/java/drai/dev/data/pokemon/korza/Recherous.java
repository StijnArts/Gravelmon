package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Recherous extends drai.dev.data.pokemon.Pokemon {
    public Recherous() {
        super("Recherous",
                Type.DARK,Type.DRAGON,
                new Stats(70,
                        138,
                        80,
                        98,
                        90,
                        124),
                List.of(Ability.RELENTLESS), Ability.RIVALRY,
                18, 658,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("This mon's awful temper and viciousness make it nearly impossible to control or train, with trainers often abandoning it after evolution. The stare of a Recherous is so full of malice that it can stop a charging Radibraze in its tracks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.ROOST,1),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,1),
                        new MoveLearnSetEntry(Move.TWISTER,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.BEAT_UP,14),
                        new MoveLearnSetEntry(Move.SCARY_FACE,19),
                        new MoveLearnSetEntry(Move.PAYBACK,23),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.PLUCK,34),
                        new MoveLearnSetEntry(Move.DARK_PULSE,41),
                        new MoveLearnSetEntry(Move.DRILL_PECK,47),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,56),
                        new MoveLearnSetEntry(Move.SLASH,70)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Recherous");

    }


}
