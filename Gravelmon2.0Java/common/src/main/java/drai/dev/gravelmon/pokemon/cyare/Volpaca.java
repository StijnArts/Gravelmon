package drai.dev.gravelmon.pokemon.cyare;

public class Volpaca extends drai.dev.gravelmon.pokemon.Pokemon {
    public Volpaca() {
        super("Volpaca",
                Type.FIRE,
                new Stats(60,
                        55,
                        78,
                        69,
                        86,
                        64),
                List.of(Ability.FLAME_BODY), Ability.FLUFFY,
                11, 372,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                145, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Evolves by Fire Stone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,9),
                        new MoveLearnSetEntry(Move.EMBER,11),
                        new MoveLearnSetEntry(Move.STOMP,15),
                        new MoveLearnSetEntry(Move.SAFEGUARD,18),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,22),
                        new MoveLearnSetEntry(Move.BODY_SLAM,27),
                        new MoveLearnSetEntry(Move.FLAMEWOOL,34),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,40),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,49),
                        new MoveLearnSetEntry(Move.HEAL_BELL,56),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,61)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Volpaca");

    }


}
