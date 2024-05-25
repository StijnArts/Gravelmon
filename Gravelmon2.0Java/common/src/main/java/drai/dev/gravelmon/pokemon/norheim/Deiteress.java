package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Deiteress extends drai.dev.gravelmon.pokemon.Pokemon {
    public Deiteress() {
        super("Deiteress",
                Type.FAIRY, Type.GRASS,
                new Stats(175,
                        80,
                        65,
                        110,
                        90,
                        80),
                List.of(Ability.FLOWER_VEIL), Ability.AROMA_VEIL,
                24, 165,
                new Stats(2,0,0,1,0,0), 3,
                0.0,
                306, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- Sweet Scent Normal - Tackle Normal 5 Aromatic Mist Fairy 10 Disarming VoiceSTAB Fairy 15 Nature Power Normal 20 Stomp Normal 25 Aromatherapy Grass 30 Growth Normal 35 Magical LeafSTAB Grass 40 Flower Shield Fairy 45 Floral Healing Fairy 50 Take Down Normal 55 Petal BlizzardSTAB Grass 60 MoonblastSTAB Fairy 65 Heal Pulse Psychic 70 Petal DanceSTAB Grass 75 Play RoughSTAB Fairy 80 Grassy Terrain Grass 85 Last Resort Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,10),
                        new MoveLearnSetEntry(Move.NATURE_POWER,15),
                        new MoveLearnSetEntry(Move.STOMP,20),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.GROWTH,30),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,35),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,40),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,45),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,50),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,55),
                        new MoveLearnSetEntry(Move.MOONBLAST,60),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,65),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,70),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,75),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,80),
                        new MoveLearnSetEntry(Move.LAST_RESORT,85)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Deiteress");

    }


}
