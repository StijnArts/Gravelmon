package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.lagoone.*;

public class Lagoone extends drai.dev.data.games.registry.Game {
    public Lagoone() {
        super("Lagoone");
    }
//TODO add regionals after Webbewulf
    @Override
    public void registerPokemon() {
        addNewPokemon(new Leafin().fishingSpawnFromExisting());
        addNewPokemon(new Sharkage());
        addNewPokemon(new Sharcleave());
        addNewPokemon(new Torshell().fishingSpawnFromExisting());
        addNewPokemon(new Emberaid());
        addNewPokemon(new Galliente());
        addNewPokemon(new Squigill().fishingSpawnFromExisting());
        addNewPokemon(new Whirlamari());
        addNewPokemon(new Douseidon());
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
        addNewPokemon(new Anepunch()); //Renamed from anenemy
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
        addPokedexPokemon("sableye-lagoonan");
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
        addNewPokemon(new Shockitt());
        addNewPokemon(new Felightnin());
        addNewPokemon(new Zenithera());
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
        addPokedexPokemon("litwick-lagoonan, lampent-lagoonan, chandelure-lagoonan, finneon-lagoonan, lumineon-lagoonan");
        addNewPokemon(new Gloomineon());
        addNewPokemon(new Boulblin());
        addNewPokemon(new Colossalgae());
    }

}
