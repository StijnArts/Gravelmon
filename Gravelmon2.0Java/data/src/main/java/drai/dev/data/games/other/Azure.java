package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Azure extends Game {
    public static final Game INSTANCE = new Azure();

    private Azure() {
        super("Azure", "https://docs.google.com/spreadsheets/d/1V4GtV-2NlbROtyULYroeGRaP9g6_6rhN454JQ6JzcN4/edit?gid=1916559317#gid=1916559317");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new MysticTreecko("Treecko", Aspect.MYSTIC).setPreferredBlocks("minecraft:blue_wool").addLabels(Label.STARTER));
        addNewPokemon(new MysticGrovyle("Grovyle", Aspect.MYSTIC).addLabels(Label.STARTER));
        addNewPokemon(new MysticSceptile("Sceptile", Aspect.MYSTIC).addLabels(Label.STARTER));
        addNewPokemon(new MysticTorchic("Torchic", Aspect.MYSTIC).addLabels(Label.STARTER).setPreferredBlocks("minecraft:amethyst_block"));
        addNewPokemon(new MysticCombusken("Combusken", Aspect.MYSTIC).addLabels(Label.STARTER));
        addNewPokemon(new MysticBlaziken("Blaziken", Aspect.MYSTIC).addLabels(Label.STARTER));
        addNewPokemon(new MysticMudkip("Mudkip", Aspect.MYSTIC).addLabels(Label.STARTER).setPreferredBlocks("minecraft:sandstone"));
        addNewPokemon(new MysticMarshtomp("Marshtomp", Aspect.MYSTIC).addLabels(Label.STARTER));
        addNewPokemon(new MysticSwampert("Swampert", Aspect.MYSTIC).addLabels(Label.STARTER));
        addNewPokemon(new MysticPoochyena("Poochyena", Aspect.MYSTIC).setPreferredBlocks("minecraft:bone_block"));
        addNewPokemon(new MysticMightyena("Mightyena", Aspect.MYSTIC));
        addNewPokemon(new MysticRiolu("", Aspect.MYSTIC).setPreferredBlocks("minecraft:sandstone"));
        addNewPokemon(new MysticLucario("", Aspect.MYSTIC));

        addNewPokemon(new MysticStufful("", Aspect.MYSTIC));
        addNewPokemon(new MysticBewear("", Aspect.MYSTIC));

        addNewPokemon(new MysticVoltorb("", Aspect.MYSTIC).setPreferredBlocks("minecraft:amethyst_block"));
        addNewPokemon(new MysticElectrode("", Aspect.MYSTIC));

        addNewPokemon(new MysticSolosis("", Aspect.MYSTIC));
        addNewPokemon(new MysticDuosion("", Aspect.MYSTIC));
        addNewPokemon(new MysticReuniclus("", Aspect.MYSTIC));
    }
}
