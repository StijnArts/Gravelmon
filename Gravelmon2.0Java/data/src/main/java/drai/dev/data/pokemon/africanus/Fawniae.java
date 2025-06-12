package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fawniae extends drai.dev.data.pokemon.Pokemon {
    public Fawniae() {
        super("Fawniae",
                Type.FIGHTING,Type.FAIRY,
                new Stats(85,
                        85,
                        80,
                        105,
                        125,
                        75),
                List.of(Ability.OWN_TEMPO), null,
                19, 520,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Ser místico, se dice que vino a Occidentis gracias al dios Fauno, en agradecimiento a los hombres."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,59),
                        new MoveLearnSetEntry(Move.FLEUR_CANNON,66),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,32),
                        new MoveLearnSetEntry(Move.MALENIA,50),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHARM,49),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,16),
                        new MoveLearnSetEntry(Move.SLASH,42),
                        new MoveLearnSetEntry(Move.MOONBLAST,13),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,21),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,18),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,33),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,7),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SECRET_SWORD,44),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,35),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,40),
                        new MoveLearnSetEntry(Move.BULK_UP,28),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,36),
                        new MoveLearnSetEntry(Move.DETECT,1)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(46)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Fawniae");
        this.setPreEvolution("gogoat");
        addAdditionalEvolution("gogoat", new EvolutionEntry("fawniae", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:ocarina"));

    }


}
