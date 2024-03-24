package drai.dev.gravelmon.pokemon.otopo;

public class Honokomu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Honokomu() {
        super("Honokomu",
                Type.FIRE,Type.NORMAL,
                new Stats(100,
                        70,
                        70,
                        70,
                        70,
                        40),
                List.of(Ability.FLASH_FIRE), Ability.FLAME_BODY,
                9, 200,
                new Stats(3,0,0,0,0,0), 45,
                0.875,
                198, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Honokomu embodies magma's ferocity. It fires huge bursts of fire that completely consume everything they come into contact with."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SWIFT,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,5),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,10),
                        new MoveLearnSetEntry(Move.SMOG,15),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,20),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,25),
                        new MoveLearnSetEntry(Move.INCINERATE,30),
                        new MoveLearnSetEntry(Move.MIMIC,35),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,40),
                        new MoveLearnSetEntry(Move.LAST_RESORT,45),
                        new MoveLearnSetEntry(Move.FIRE_LASH,50),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,55),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,60),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,65),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,70)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Honokomu");

    }


}
