package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pendelf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pendelf() {
        super("Pendelf",
                Type.FAIRY,Type.STEEL,
                new Stats(70,
                        41,
                        60,
                        80,
                        63,
                        63),
                List.of(Ability.MAGIC_BOUNCE,Ability.LIGHT_METAL,Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                7, 165,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                132, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.MINERAL),
                List.of("It pays close attention to its wearer's heartbeat to monitor its health. It radiates an aura that wards off hex."),
                List.of(new EvolutionEntry("encrona", EvolutionType.TRADE, List.of(),
                        List.of())),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,5),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.HELPING_HAND,11),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,15),
                        new MoveLearnSetEntry(Move.FLASH,19),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.BODY_PRESS,31),
                        new MoveLearnSetEntry(Move.HEAL_BELL,35),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,38),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,42),
                        new MoveLearnSetEntry(Move.CALM_MIND,47),
                        new MoveLearnSetEntry(Move.STORED_POWER,50),
                        new MoveLearnSetEntry(Move.MOONBLAST,56)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 37, 53, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN, Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pendelf");

    }


}
