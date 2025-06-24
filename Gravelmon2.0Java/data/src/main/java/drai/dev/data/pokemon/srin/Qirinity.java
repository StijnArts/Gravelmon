package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Qirinity extends drai.dev.data.pokemon.Pokemon {
    public Qirinity() {
        super("Qirinity",
                Type.DRAGON,Type.NORMAL,
                new Stats(120,
                        130,
                        110,
                        110,
                        120,
                        90),
                List.of(Ability.PRESSURE), Ability.SERENE_GRACE,
                45, 6800,
                new Stats(0,2,0,0,0,0), 3,
                0.0,
                380, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Qirinity's mane consists of cooled down dragon fire. Its cry can calm down any troubled spirit. A strike with its horn only lands on worthy opponents."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,1),
                        new MoveLearnSetEntry(Move.THUNDER,1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,1),
                        new MoveLearnSetEntry(Move.MEGA_KICK,1),
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,1),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Qirinity");

    }


}
