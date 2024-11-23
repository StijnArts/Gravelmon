package drai.dev.data.games.pokemmo.done;


import drai.dev.data.pokemon.lagoone.*;
//done
public class Lagoone extends drai.dev.data.games.registry.Game {
    public Lagoone() {
        super("Lagoone");
    }
//TODO add regionals after Webbewulf
    @Override
    public void registerPokemon() {
        pokemon.add(new Leafin().fishingSpawnFromExisting());
        pokemon.add(new Sharkage());
        pokemon.add(new Sharcleave());
        pokemon.add(new Torshell().fishingSpawnFromExisting());
        pokemon.add(new Emberaid());
        pokemon.add(new Galliente());
        pokemon.add(new Squigill().fishingSpawnFromExisting());
        pokemon.add(new Whirlamari());
        pokemon.add(new Douseidon());
        pokemon.add(new Pillunge());
        pokemon.add(new Rumball());
        pokemon.add(new Likandua());
        pokemon.add(new Tamanozzle());
        pokemon.add(new Jellycap());
        pokemon.add(new Jellohat());
        pokemon.add(new Tapiruin());
        pokemon.add(new Dodonut());
        pokemon.add(new Palmfiend());
        pokemon.add(new Golmol());
        pokemon.add(new Phanchasm());
        pokemon.add(new Venemony()); //Renamed from anenemy
        pokemon.add(new Anemace());
        pokemon.add(new Anedusa());
        pokemon.add(new Dynamight());
        pokemon.add(new Cregg());
        pokemon.add(new Crabelette());
        pokemon.add(new Sardive().fishingSpawnFromExisting());
        pokemon.add(new Gigantuna().fishingSpawnFromExisting());
        pokemon.add(new Echolite());
        pokemon.add(new Teravat());
        addPokedexPokemon("chatot");
        pokemon.add(new Symphot());
        pokemon.add(new Clunch().fishingSpawnFromExisting());
        pokemon.add(new Locklusk());
        pokemon.add(new Bountyrant());
        pokemon.add(new Biscaneer());
        pokemon.add(new Gingerbeard());
        addPokedexPokemon("sableye-lagoonan");
        pokemon.add(new Pesteeny());
        pokemon.add(new Tadwobble());
        pokemon.add(new Madhopple());
        pokemon.add(new Jadivine());
        pokemon.add(new Galegant());
        pokemon.add(new Tidakeet().fishingSpawnFromExisting());
        pokemon.add(new Bumpnotic());
        pokemon.add(new Shrizzler());
        pokemon.add(new Flintlaw());
        pokemon.add(new Burnslinger());
        pokemon.add(new Shockitt());
        pokemon.add(new Felightning());
        pokemon.add(new Zenithera());
        pokemon.add(new Driftilla());
        pokemon.add(new Rudeworm());
        pokemon.add(new Coldera());
        pokemon.add(new Coldozer());
        pokemon.add(new Frosterror());
        pokemon.add(new Scubeel().fishingSpawnFromExisting()); //Renamed from moreel
        pokemon.add(new Clankeel());
        pokemon.add(new Nimbun());
        pokemon.add(new Raizinger());
        pokemon.add(new Sandime());
        pokemon.add(new Starena());

        addPokedexPokemon("litwick-lagoonan, lampent-lagoonan, chandelure-lagoonan, finneon-lagoonan, lumineon-lagoonan");
        pokemon.add(new Gloomineon());
        pokemon.add(new Boulblin());
        pokemon.add(new Lonestone());
        pokemon.add(new Geminie());
        pokemon.add(new Colossalgae());
        pokemon.add(new Plumeron());
        pokemon.add(new Kickalon());
        pokemon.add(new Wandream());
        pokemon.add(new Crocrux());
        pokemon.add(new Caimarune());
        pokemon.add(new Barbeetle());
        pokemon.add(new Scourgeon());
        pokemon.add(new Grapearl());
        pokemon.add(new Jamowar());
        pokemon.add(new Perchback());
        pokemon.add(new Skyviator());
        pokemon.add(new Crawlycan());
        pokemon.add(new Webbewulf());
        pokemon.add(new Edeereal());
        pokemon.add(new Stingfray());
        pokemon.add(new Crystalker());
        pokemon.add(new Tyfang());
        pokemon.add(new Furycane());
        pokemon.add(new Gangill());
        pokemon.add(new Codfather());
        pokemon.add(new Mantilist());
        pokemon.add(new Pummelot());
        pokemon.add(new Festivowl());
        pokemon.add(new Gobblelisk());
        pokemon.add(new Drasalys());
        pokemon.add(new Dralytra());
        pokemon.add(new Cerakeet());
        pokemon.add(new Skullocaris());
        pokemon.add(new Exovision());
        pokemon.add(new Corabdis());

    }

}
