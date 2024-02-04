package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Phoncrawl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phoncrawl() {
        super("Phoncrawl",
                Type.STEEL,Type.ELECTRIC,
                new Stats(45,
                        55,
                        75,
                        45,
                        50,
                        50),
                List.of(Ability.ANTICIPATION,Ability.SOUNDPROOF,Ability.DOWNLOAD), Ability.DOWNLOAD,
                3, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.0,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.BUG),
                List.of("An early foray into communications tech that became a Pokémon. It can broadcast messages to other Phoncrawl over very long distances."),
                List.of(new EvolutionEntry("techknot", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dubious_disc")),
                List.of(
                        new MoveLearnSetEntry(Move.BARRIER,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,10),
                        new MoveLearnSetEntry(Move.SPARK,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,19),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,22),
                        new MoveLearnSetEntry(Move.SELFREPAIR,25),
                        new MoveLearnSetEntry(Move.STUNJAB,27),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,31),
                        new MoveLearnSetEntry(Move.PSYCH_UP,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,38),
                        new MoveLearnSetEntry(Move.LOCKON,42),
                        new MoveLearnSetEntry(Move.METAL_BURST,46),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,52),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Phoncrawl");

    }


}
