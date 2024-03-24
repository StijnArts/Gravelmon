package drai.dev.gravelmon.pokemon.orbis;

public class Drillbee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drillbee() {
        super("Drillbee",
                Type.BUG,Type.FLYING,
                new Stats(65,
                        70,
                        115,
                        55,
                        60,
                        90),
                List.of(Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                8, 120,
                new Stats(0,0,2,0,0,0), 100,
                0.5,
                154, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Drillbee are often used by construction workers to pass materials up to developing buildings, their hard heads resist falling debris. In the wild, they work to build structures for their queen. Drillbee is the most common evolution of Baybee."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BUZZ,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.DRILL_RUN,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.FELL_STINGER,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drillbee");

    }


}
