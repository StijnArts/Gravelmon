package drai.dev.data.games.pokengine;


import drai.dev.data.pokemon.lagoone.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//done https://pokengine.org/collections/10uvah5o/Lagoone
public class Lagoone extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Lagoone();
    private Lagoone() {
        super("Lagoone");
    }
//TODO update
    @Override
    public void registerPokemon() {
        addNewPokemon(new Leafin().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Sharkage().addLabels(Label.STARTER));
        addNewPokemon(new Sharcleave().addLabels(Label.STARTER));
        addNewPokemon(new Torshell().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Emberaid().addLabels(Label.STARTER));
        addNewPokemon(new Galliente().addLabels(Label.STARTER));
        addNewPokemon(new Squigill().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Whirlamari().addLabels(Label.STARTER));
        addNewPokemon(new Douseidon().addLabels(Label.STARTER));
        addNewPokemon(new Pillunge());
        addNewPokemon(new Rumball());
        addNewPokemon(new Likandua());
        addNewPokemon(new Tamanozzle());
        addNewPokemon(new Jellycap());
        addNewPokemon(new Jellohat());
        addNewPokemon(new Tapiruin());
        addNewPokemon(new Dodonut());
        addNewPokemon(new Palmfiend());
        addNewPokemon(new Golmol());
        addNewPokemon(new Phanchasm());
        addNewPokemon(new Venemony()); //Renamed from anenemy
        addNewPokemon(new Anemace());
        addNewPokemon(new Anedusa());
        addNewPokemon(new Dynamight());
        addNewPokemon(new Cregg());
        addNewPokemon(new Crabelette());
        addNewPokemon(new Sardive().fishingSpawnFromExisting());
        addNewPokemon(new Gigantuna().fishingSpawnFromExisting());
        addNewPokemon(new Echolite());
        addNewPokemon(new Teravat());
        addPokedexPokemon("chatot");
        addNewPokemon(new Symphot());
        addNewPokemon(new Clunch().fishingSpawnFromExisting());
        addNewPokemon(new Locklusk());
        addNewPokemon(new Bountyrant());
        addNewPokemon(new Biscaneer());
        addNewPokemon(new Gingerbeard());
        addNewPokemon(new LagoonanSableye("", Aspect.LAGOONAN));
        addNewPokemon(new Pesteeny());
        addNewPokemon(new Tadwobble());
        addNewPokemon(new Madhopple());
        addNewPokemon(new Jadivine());
        addNewPokemon(new Galegant());
        addNewPokemon(new Tidakeet().fishingSpawnFromExisting());
        addNewPokemon(new Bumpnotic());
        addNewPokemon(new Shrizzler());
        addNewPokemon(new Flintlaw());
        addNewPokemon(new Burnslinger());
        addNewPokemon(new Shockitt().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Felightning().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Zenithera().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Driftilla());
        addNewPokemon(new Rudeworm());
        addNewPokemon(new Coldera());
        addNewPokemon(new Coldozer());
        addNewPokemon(new Frosterror());
        addNewPokemon(new Scubeel().fishingSpawnFromExisting()); //Renamed from moreel
        addNewPokemon(new Clankeel());
        addNewPokemon(new Nimbun());
        addNewPokemon(new Raizinger());
        addNewPokemon(new Sandime());
        addNewPokemon(new Starena());

        addNewPokemon(new LagoonanLitwick("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanLampent("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanChandelure("", Aspect.LAGOONAN));
        addNewPokemon(new Caskute());
        addNewPokemon(new Barammer());
        addNewPokemon(new LagoonanFinneon("", Aspect.LAGOONAN).fishingSpawnFromExisting());
        addNewPokemon(new LagoonanLumineon("", Aspect.LAGOONAN).fishingSpawnFromExisting());
        addNewPokemon(new Gloomineon());
        addNewPokemon(new Boulblin());
        addNewPokemon(new Lonestone());
        addNewPokemon(new Geminie());
        addNewPokemon(new Colossalgae());
        addNewPokemon(new Plumeron());
        addNewPokemon(new Kickalon());
        addNewPokemon(new Wandream());
        addNewPokemon(new Crocrux());
        addNewPokemon(new Caimarune());
        addNewPokemon(new Barbeetle());
        addNewPokemon(new Scourgeon());
        addNewPokemon(new Grapearl());
        addNewPokemon(new Jamowar());
        addNewPokemon(new Perchback());
        addNewPokemon(new Skyviator());
        addNewPokemon(new Crawlycan());
        addNewPokemon(new Webbewulf());
        addNewPokemon(new LagoonanHatenna("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanHattrem("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanHatterene("", Aspect.LAGOONAN));
        addNewPokemon(new Edeereal());
        addNewPokemon(new Stingfray());
        addNewPokemon(new LagoonanRemoraid("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanOctillery("", Aspect.LAGOONAN));
        addNewPokemon(new Crystalker());
        addNewPokemon(new Tyfang());
        addNewPokemon(new Furycane());
        addNewPokemon(new LagoonanBinacle("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanBarbaracle("", Aspect.LAGOONAN));
        addNewPokemon(new Gangill());
        addNewPokemon(new Codfather());
        addNewPokemon(new Mantilist());
        addNewPokemon(new Pummelot());
        addNewPokemon(new Festivowl());
        addNewPokemon(new Gobblelisk());
        addNewPokemon(new Drasalys());
        addNewPokemon(new Dralytra());
        addNewPokemon(new Cerakeet());
        addNewPokemon(new LagoonanTinkatink("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanTinkatuff("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanTinkaton("", Aspect.LAGOONAN));
        addPokedexPokemon("goldeen");
        addNewPokemon(new Seasurper());
        addNewPokemon(new Veneko());
        addNewPokemon(new Toxunken());
        addNewPokemon(new Skullocaris());
        addNewPokemon(new Exovision());
        addNewPokemon(new Corabdis().addLabels(Label.LEGENDARY));
//        addNewPokemon(new Biovereign().addLabels(Label.LEGENDARY)); TODO

    }

}
