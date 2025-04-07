package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Subterrite extends drai.dev.data.pokemon.Pokemon {
    public Subterrite() {
        super("Subterrite",
                Type.FIRE,Type.GROUND,
                new Stats(60,
                        100,
                        50,
                        90,
                        80,
                        100),
                List.of(Ability.ILLUMINATE,Ability.SAND_RUSH), Ability.TECHNICIAN,
                35, 2377,
                new Stats(0,1,0,0,0,1), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The long lure is used to mimic the glow of Lampy, luring prey close enough to snatch with its powerful jaws. Subterrite are rarely seen above ground, preferring to stay in their burrows."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SINGE,8),
                        new MoveLearnSetEntry(Move.FLASH,11),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.LIGHTUP,19),
                        new MoveLearnSetEntry(Move.INCINERATE,23),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,26),
                        new MoveLearnSetEntry(Move.MUD_BOMB,31),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,35),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,48),
                        new MoveLearnSetEntry(Move.FISSURE,53)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Subterrite");

    }


}
