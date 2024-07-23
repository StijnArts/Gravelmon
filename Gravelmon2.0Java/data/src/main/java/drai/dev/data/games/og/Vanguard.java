package drai.dev.data.games.og;


import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.ayrei.Solacor;
import drai.dev.data.pokemon.ayrei.*;

public class Vanguard extends Game {
    public Vanguard() {
        super("Vanguard");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Magnemelt());
        pokemon.add(new Fleumingo());
        pokemon.add(new Loathedisc());
        pokemon.add(new Gyropass());
        pokemon.add(new Amacorala());
        pokemon.add(new Solacor());
        pokemon.add(new Dunmyth());
        pokemon.add(new Dundragon());
        pokemon.add(new Wolfum());
        pokemon.add(new Supiritto());
        pokemon.add(new Infernadeer());
        pokemon.add(new Cradecart());
        pokemon.add(new Sylure());
        pokemon.add(new Syrallure());
        pokemon.add(new Syrenade());
        pokemon.add(new Tartot());
        pokemon.add(new Teranigrade());
        pokemon.add(new Setsarec());
        //TODO
//        pokemon.add(new Panvolt()); //MISSING ART
//        pokemon.add(new Simivolt()); //MISSING ART
//        pokemon.add(new Klawbby()); //MISSING ART
        pokemon.add(new Dunemoth());
        pokemon.add(new Dofrio());
        pokemon.add(new Siginome());
        pokemon.add(new Khortares());
        pokemon.add(new Reincarnape());
        pokemon.add(new Togenix());
        pokemon.add(new Reapatisse());
        pokemon.add(new Habaneevil());
        pokemon.add(new Gatiriopteryx()); //TODO fossil
        pokemon.add(new Therapex()); //TODO fossil
        pokemon.add(new Astralaxy()); //TODO fossil
        pokemon.add(new Masimuthi());
        pokemon.add(new Wraifanggal());
        pokemon.add(new Mujineon());
        pokemon.add(new Spareon());
        pokemon.add(new Almireon());
//        pokemon.add(new Quartzeon()); //MISSING ART
        pokemon.add(new Evoleon());
        pokemon.add(new Caeleon());
        pokemon.add(new Saureon());
        pokemon.add(new Burreon());
        pokemon.add(new Halluceon());
        pokemon.add(new Vultema());
        pokemon.add(new Parlomai());
        pokemon.add(new Valevant());
        pokemon.add(new Narwail());
        pokemon.add(new Morphias());
//        pokemon.add(new Posuirin()); //MISSING ART
        pokemon.add(new Svetrier());
        pokemon.add(new Drukknir());
        pokemon.add(new Sleihesnire());
//        pokemon.add(new Golmachina()); //MISSING ART
    }
}
