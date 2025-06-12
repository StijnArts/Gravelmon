package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranPetilil extends Pokemon {
    public CefiranPetilil(String name, Aspect aspect) {
        super(name, aspect,"CefiranPetilil",
                Type.GRASS, Type.POISON,
                new Stats(45,35,50,30,70,50),
                List.of(Ability.PRANKSTER, Ability.OWN_TEMPO), Ability.LEAF_GUARD,
                5, 66,
                new Stats(0,0,0,1,0,0), 190,
                0,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("Cefiranlilligant", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB, 1),
                        new MoveLearnSetEntry(Move.GROWTH, 4),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 8),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER, 10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 13),
                        new MoveLearnSetEntry(Move.SYNTHESIS, 17),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, 19),
                        new MoveLearnSetEntry(Move.STUN_SPORE, 22),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, 26),
                        new MoveLearnSetEntry(Move.AROMATHERAPY, 28),
                        new MoveLearnSetEntry(Move.HELPING_HAND, 31),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, 35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, 37),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, 40),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, 44),
                        new MoveLearnSetEntry(Move.LEAF_STORM, 46),
                        new MoveLearnSetEntry(Move.TACKLE, "egg"),
                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, "egg"),
                        new MoveLearnSetEntry(Move.HEALING_WISH, "egg"),
                        new MoveLearnSetEntry(Move.INGRAIN, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT, "egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "egg")
                ),
                List.of(Label.GEN5,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 27, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Petilil");
    }
}
