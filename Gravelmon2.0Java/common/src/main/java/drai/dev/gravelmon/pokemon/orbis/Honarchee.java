package drai.dev.gravelmon.pokemon.orbis;

public class Honarchee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Honarchee() {
        super("Honarchee",
                Type.BUG,Type.FIGHTING,
                new Stats(78,
                        113,
                        68,
                        83,
                        73,
                        105),
                List.of(Ability.QUEENLY_MAJESTY), Ability.QUEENLY_MAJESTY,
                13, 210,
                new Stats(0,1,0,1,0,0), 45,
                0.0,
                198, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Honarchee control whole colonies ordering younglings to create lavish structures from surrounding items. It produces a beautiful tasting royal jelly that is said to contain healing elements."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PERISH_SONG,1),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,1),
                        new MoveLearnSetEntry(Move.DEFEND_ORDER,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,1),
                        new MoveLearnSetEntry(Move.FELL_STINGER,1),
                        new MoveLearnSetEntry(Move.ATTRACT,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Honarchee");

    }


}
