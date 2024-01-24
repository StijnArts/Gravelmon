package drai.dev.gravelmon.pokemon.flux.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AlteranBreloom extends Pokemon {
    public AlteranBreloom(int dexNo) {
        super(dexNo,"AlteranBreloom",
                Type.GRASS, Type.POISON,
                new Stats(60, 100, 80, 75, 75, 70),
                List.of(Ability.EFFECT_SPORE, Ability.POISON_TOUCH), Ability.MOLD_BREAKER,
                12, 392,
                new Stats(1,1,0,0,0,0), 90,
                0.5,
                161, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FAIRY),
                List.of("Its strikes have less force behind them than its cousins from Hoenn. However, the deadly spores it delivers with each blow definitely pack a punch!"),
                List.of(new EvolutionEntry("brontoloom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_TAIL,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,1),
                        new MoveLearnSetEntry(Move.SPORE,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,1),
                        new MoveLearnSetEntry(Move.INGRAIN,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.VENOSHOCK,19),
                        new MoveLearnSetEntry(Move.HEADBUTT,22),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,28),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,33),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,39),
                        new MoveLearnSetEntry(Move.TOXIC,44),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,44),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"egg"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"egg")
                        ),
                List.of(Label.GEN3,Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 23, 45, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Shroomish");
        this.setPortraitXYZ(0,1.8,0);
    }
}
