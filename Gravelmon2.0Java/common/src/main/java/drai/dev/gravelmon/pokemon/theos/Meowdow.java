package drai.dev.gravelmon.pokemon.theos;

public class Meowdow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Meowdow() {
        super("Meowdow",
                Type.GRASS,
                new Stats(45,
                        70,
                        50,
                        55,
                        50,
                        55),
                List.of(Ability.OVERGROW), Ability.DEFIANT,
                6, 45,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Meowdow, known for their feisty nature, constantly hones their claws on rocks and trees, sharpening them into formidable weapons."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,4),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.DETECT,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,20),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,25),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,30)                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meowdow");

    }


}
