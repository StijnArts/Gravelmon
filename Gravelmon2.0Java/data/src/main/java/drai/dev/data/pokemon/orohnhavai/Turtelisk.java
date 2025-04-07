package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Turtelisk extends drai.dev.data.pokemon.Pokemon {
    public Turtelisk() {
        super("Turtelisk",
                Type.DRAGON,
                new Stats(55,
                        71,
                        70,
                        49,
                        50,
                        35),
                List.of(Ability.RIVALRY,Ability.BATTLE_ARMOR,Ability.STURDY), Ability.STURDY,
                8, 165,
                new Stats(0,1,0,0,0,0), 120,
                0.667,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Its sturdy shell is made from iron and won't take a scratch from any attack. With its sharp beak, it can bite through the toughest tree trunks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,6),
                        new MoveLearnSetEntry(Move.METAL_SOUND,10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,14),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.ROAR,23),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,27),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,40),
                        new MoveLearnSetEntry(Move.CRUNCH,45),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,53),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Turtelisk");

    }


}
