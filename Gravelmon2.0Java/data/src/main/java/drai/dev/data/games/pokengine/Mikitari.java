package drai.dev.data.games.pokengine;


import drai.dev.data.pokemon.mikitari.*;
import drai.dev.data.pokemon.mikitari.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Mikitari extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Mikitari();
    private Mikitari() {
        super("Mikitari");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Rhinplink().addLabels(Label.STARTER));
        addNewPokemon(new Trunkorn().addLabels(Label.STARTER));
        addNewPokemon(new Rhintain().addLabels(Label.STARTER));
        addNewPokemon(new Skindling().addLabels(Label.STARTER));
        addNewPokemon(new Skingnite().addLabels(Label.STARTER));
        addNewPokemon(new Eruptile().addLabels(Label.STARTER));
        addNewPokemon(new Dampybara().addLabels(Label.STARTER));
        addNewPokemon(new Glovet().addLabels(Label.STARTER));
        addNewPokemon(new Mortarine().addLabels(Label.STARTER));
        addNewPokemon(new Petidaw());
        addNewPokemon(new Croober());
        addNewPokemon(new Ravendler());
        addNewPokemon(new Chubboink());
        addNewPokemon(new Muchog());
        addNewPokemon(new MikitarianBuneary("", Aspect.MIKITARIAN));
        addNewPokemon(new MikitarianLopunny("", Aspect.MIKITARIAN));
        addNewPokemon(new Furrva());
        addNewPokemon(new Kocomb());
        addNewPokemon(new Granebee());
        addNewPokemon(new Beelitant());
        addNewPokemon(new Hopidey());
        addNewPokemon(new Raknaleap());
        addNewPokemon(new Lilleo());
        addNewPokemon(new Germeit());
        addNewPokemon(new MikitarianSpritzee("", Aspect.MIKITARIAN));
        addNewPokemon(new Traumatisse());
        addNewPokemon(new Troutle().fishingSpawnFromExisting());
        addNewPokemon(new Basstile().fishingSpawnFromExisting());
        addNewPokemon(new Cabat());
        addNewPokemon(new FemaleCabat("", Aspect.FEMALE));
        addNewPokemon(new Stalat()); //renamed from stalad
        addNewPokemon(new Stalass());
        addNewPokemon(new Packbats());
        addNewPokemon(new FemalePackbats("", Aspect.FEMALE));
        addNewPokemon(new Sprousy());
        addNewPokemon(new Petalnia());
        addNewPokemon(new Floramona());
        addNewPokemon(new Geocko());
        addNewPokemon(new Grexclub());
        addNewPokemon(new Geolidon());
        addNewPokemon(new MikitarianOricorio("", Aspect.MIKITARIAN));
        addNewPokemon(new MikitarianYamask("", Aspect.MIKITARIAN));
        addNewPokemon(new Platerigus());
        addNewPokemon(new Sphertle());
        addNewPokemon(new Wroomtoise());
        addNewPokemon(new Octolet());
        addNewPokemon(new Octokinepus());
        addNewPokemon(new Mantoon());
        addNewPokemon(new Stormanta());
        addNewPokemon(new Hauntray().fishingSpawnFromExisting());
        addNewPokemon(new Phantabys().fishingSpawnFromExisting());

        addNewPokemon(new Sneepy());
        addNewPokemon(new Flambafee());
        addNewPokemon(new Homurant());
        addNewPokemon(new Commant());
        addNewPokemon(new MikitarianFalinks("", Aspect.MIKITARIAN));
        addNewPokemon(new Goobolt());
        addNewPokemon(new Chargoo());
        addNewPokemon(new Plasmatina());
        addNewPokemon(new Flampy());
        addNewPokemon(new Murasalem());
        addNewPokemon(new Crishy().fishingSpawnFromExisting());
        addNewPokemon(new Contamullet().fishingSpawnFromExisting());
        addNewPokemon(new Timpot());
        addNewPokemon(new Prankmare());
        addNewPokemon(new Slidune());
        addNewPokemon(new Duntesert());
        addNewPokemon(new Glyptoblock());
        addNewPokemon(new Furnadon());
        addNewPokemon(new Dorewee());
        addNewPokemon(new Doperami());
        addNewPokemon(new Peclay());
        addNewPokemon(new Tektalon());
        addNewPokemon(new Munchill());
        addNewPokemon(new Crunchill());
        addNewPokemon(new Lediastra());
        addNewPokemon(new Glanchog());
        addNewPokemon(new PorygonA());
        addNewPokemon(new MikitarianNoctowl("", Aspect.MIKITARIAN));
        addNewPokemon(new Sufferub());
        addNewPokemon(new Inhalis());
        addNewPokemon(new Gasarnet());
        addNewPokemon(new Lambi());
        addNewPokemon(new Mourin());
        addNewPokemon(new Keerin());
        addNewPokemon(new Flarepent().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Singepent().addLabels(Label.PSEUDO_LEGENDARY));//renamed from searpent
        addNewPokemon(new Conflevour().addLabels(Label.PSEUDO_LEGENDARY));
    }

}
