package drai.dev.data.games.pokengine;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.flux.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
//TODO update https://pokengine.org/collections/10lj54e1/Flux
public class Flux extends Game {
    public static final Game INSTANCE = new Flux();
    private Flux() {super("Flux");}

    @Override
    public void registerPokemon() {
        addNewPokemon(new Mozz().addLabels(Label.STARTER));
        addNewPokemon(new Mosseer().addLabels(Label.STARTER));
        addNewPokemon(new Daemoth().addLabels(Label.STARTER));
        addNewPokemon(new Chiklit().addLabels(Label.STARTER));
        addNewPokemon(new Burnychus().addLabels(Label.STARTER));
        addNewPokemon(new Pyropteryx().addLabels(Label.STARTER));
        addNewPokemon(new Findolf().addLabels(Label.STARTER));
        addNewPokemon(new Delfender().addLabels(Label.STARTER));
        addNewPokemon(new Hydrocean().addLabels(Label.STARTER));
        addNewPokemon(new Minyan());
        addNewPokemon(new Vilucard());
        addNewPokemon(new Lunapup());
        addNewPokemon(new Herolune());
        addNewPokemon(new Selkid());
        addNewPokemon(new Syrentide());
        addNewPokemon(new Cavamie());
        addNewPokemon(new Capymigo());
        addNewPokemon(new Humborb());
        addNewPokemon(new Navibri());
        addNewPokemon(new Turbolibri());
        addPokedexPokemon("ledyba");
        addNewPokemon(new AlteranLedian("", Aspect.ALTERAN));
        addNewPokemon(new Squrmy());
        addNewPokemon(new Durtwurm());
        addNewPokemon(new Wurmiterra());
        addNewPokemon(new AlteranOwten("", Aspect.ALTERAN));
        addNewPokemon(new AlteranEshouten("", Aspect.ALTERAN));
        addNewPokemon(new Tanupy());
        addNewPokemon(new Tanscure());
        addNewPokemon(new Sluchuu());
        addNewPokemon(new Gullitt());
        addNewPokemon(new Garbagull());
        addNewPokemon(new AlteranNidoranWinterCoat("Nidoranf", Aspect.ALTERAN_WINTER_COAT));
        addNewPokemon(new AlteranNidoranSummerCoat("Nidoranm", Aspect.ALTERAN_SUMMER_COAT));
        var nidorimewinter = new NidorimeWinterCoat();
        addNewPokemon(nidorimewinter);
        addNewPokemon(new NidorimeSummerCoat("NidorimeWinterCoat", Aspect.SUMMER));
        addNewPokemon(new Nidoregina());
        addNewPokemon(new Nidoregus());
        addNewPokemon(new Roadillo());
        addNewPokemon(new Armarauder());
        addNewPokemon(new Pouchelet());
        addNewPokemon(new Grimmposs());
        addNewPokemon(new DeepWishiwashi("", Aspect.DEEP));
        addNewPokemon(new Salmini());
        addNewPokemon(new SalmosaultFreshwater());
        addNewPokemon(new SalmosaultSaltwater());
        addNewPokemon(new Taroot());
        addNewPokemon(new Daikongus());
        addNewPokemon(new AlteranShroomish("Shroomish", Aspect.ALTERAN));
        addNewPokemon(new AlteranBreloom("Breloom", Aspect.ALTERAN));
        addNewPokemon(new Brontoloom());
        addNewPokemon(new Magief());
        addNewPokemon(new Corsuave());
//        addNewPokemon(new Raverogue()); Not Made yet
        addNewPokemon(new AlteranZorua("", Aspect.ALTERAN));
        addNewPokemon(new Zorotsune());
        addNewPokemon(new Nursa());
        addNewPokemon(new Cuspide());
        addNewPokemon(new Tarandible());
        addNewPokemon(new Gunafix());
        addNewPokemon(new Fixinit());
        addNewPokemon(new Artifixt());
        addNewPokemon(new Comite());
        addNewPokemon(new Cometeor());
        addNewPokemon(new Astronite());
        addNewPokemon(new Spelotl());
        addNewPokemon(new Salamancer());
        addNewPokemon(new Ledlite());
        addNewPokemon(new Insulatex());
        addNewPokemon(new Negawatt());
        addNewPokemon(new Sputya());
//        addNewPokemon(new Kosmisha()); Not Made yet
//        addNewPokemon(new Debrichka()); Not Made yet
        addNewPokemon(new Flager());
        addNewPokemon(new Inflagetah());
        addNewPokemon(new Jerbolta());
        addNewPokemon(new Karmilarie());
        addNewPokemon(new AlteranEkans("", Aspect.ALTERAN));
        addNewPokemon(new AlteranArbok("", Aspect.ALTERAN));
        addNewPokemon(new Scarablaze());
        addNewPokemon(new Cactana());
        addNewPokemon(new AlteranHagoop("", Aspect.ALTERAN));
        addNewPokemon(new Haagmaa());
        addNewPokemon(new Flintling());
        addNewPokemon(new Obsygnus());
//        addNewPokemon(new AlteranChimical()); //unfinished
        addNewPokemon(new Emberge());
        addNewPokemon(new Glubble());
        addNewPokemon(new Garblgoyle());
        addNewPokemon(new Aerapin());
        addNewPokemon(new Albashell());
        addNewPokemon(new Amperincus());
        addNewPokemon(new Ramhorn());
        addNewPokemon(new Purrchance());
        addNewPokemon(new Grizzlet().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Geogriff().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Diastryx().addLabels(Label.PSEUDO_LEGENDARY));

        addNewPokemon(new AlteranMeowth("", Aspect.ALTERAN));
    }
}
