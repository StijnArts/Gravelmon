package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Torpeban extends drai.dev.gravelmon.pokemon.Pokemon {
    public Torpeban() {
        super("Torpeban",
                Type.FIRE,
                new Stats(85,
                        85,
                        85,
                        85,
                        85,
                        85),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                12, 127,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                180, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("They roam around hot areas lighting anything it sees on fire. No one is sure if the markings on Torpeban are its face, or if it even has a face at all."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,11),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,15),
                        new MoveLearnSetEntry(Move.ROLLOUT,18),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.INFERNO,23),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,27),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,31),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,35),
                        new MoveLearnSetEntry(Move.OVERHEAT,40)                  ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 32, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Torpeban");

    }


}
