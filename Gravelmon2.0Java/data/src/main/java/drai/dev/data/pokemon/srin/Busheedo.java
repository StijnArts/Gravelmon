package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Busheedo extends drai.dev.data.pokemon.Pokemon {
    public Busheedo() {
        super("Busheedo",
                Type.FIGHTING,Type.GRASS,
                new Stats(51,
                        121,
                        96,
                        88,
                        46,
                        78),
                List.of(Ability.SHARPNESS,Ability.INTIMIDATE), Ability.DEFIANT,
                15, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Busheedo are fearsome yet noble warriors. Their red, armored skin comes from a diet consisting only of safflower, making their exterior incredibly valuable."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.SECRET_SWORD,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,1),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,1),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.REVERSAL,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,1),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,1)),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(32).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Busheedo");

    }


}
