package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.vanguard.*;
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Vanguard extends Game {
    public Vanguard() {
        super("Vanguard");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon(("Bulbasaur-ayreian, Ivysaur-ayreian, Venusaur-ayreian, Charmander-ayreian, Charmeleon-ayreian, " +
                "Charizard-ayreian, Squirtle-ayreian, Wartortle-ayreian, Blastoise-ayreian, Caterpie-ayreian, Metapod-ayreian, " +
                "Butterfree-ayreian, Pidgey-ayreian, Pidgeotto-ayreian, Pidgeot-ayreian, Diglett-ayreian, Dugtrio-ayreian, " +
                "Abra-ayreian, Kadabra-ayreian, Alakazam-ayreian, Grimer-ayreian, Muk-ayreian, Gastly-ayreian, Haunter-ayreian, " +
                "Gengar-ayreian, Voltorb-ayreian, Electrode-ayreian, Pinsir-ayreian, Chikorita-ayreian, Bayleef-ayreian, " +
                "Meganium-ayreian, Cyndaquil-ayreian, Quilava-ayreian, Typhlosion-ayreian, Totodile-ayreian, Croconaw-ayreian, " +
                "Feraligatr-ayreian, Spinarak-ayreian, Ariados-ayreian, Stantler-ayreian, Torchic-ayreian, Combusken-ayreian, " +
                "Blaziken-ayreian, Nosepass-ayreian, Aron-ayreian, Lairon-ayreian, Aggron-ayreian, Roselia-ayreian, Numel-ayreian, " +
                "Camerupt-ayreian, Trapinch-ayreian, Vibrava-ayreian, Flygon-ayreian, Swablu-ayreian, Altaria-ayreian, " +
                "Lunatone-ayreian, Relicanth-ayreian, Shinx-ayreian, Luxio-ayreian, Luxray-ayreian, Budew-ayreian, Roserade-ayreian, " +
                "Drifloon-ayreian, Drifblim-ayreian, Dwebble-ayreian, Archen-ayreian, Archeops-ayreian, Minccino-ayreian, " +
                "Cinccino-ayreian, Ducklett-ayreian, Swanna-ayreian, Vanillite-ayreian, Vanillish-ayreian, Vanilluxe-ayreian, " +
                "Fletchling-ayreian, Fletchinder-ayreian, Pancham-ayreian, Pangoro-ayreian, Carbink-ayreian, Klefki-ayreian, " +
                "Pumpkaboo-ayreian, Gourgeist-ayreian, Noibat-ayreian, Noivern-ayreian, Yungoos-ayreian, Gumshoos-ayreian, " +
                "Grookey-ayreian, Thwackey-ayreian, Rillaboom-ayreian, Sizzlipede-ayreian, Centiskorch-ayreian, Sprigatito-ayreian, " +
                "Floragato-ayreian, Meowscarada-ayreian, Quaxly-ayreian, Quaxwell-ayreian, Quaquaval-ayreian").toLowerCase());
        
        addPokedexPokemon("magnemite-ayreian, magneton-ayreian");
        addNewPokemon(new Magnemelt());
        addNewPokemon(new Fleumingo());
        addPokedexPokemon("luvdisc-ayreian");
        addNewPokemon(new Loathedisc());
        addNewPokemon(new Gyropass());
        addPokedexPokemon("corsola");
        addNewPokemon(new Amacorala());
        addNewPokemon(new Solacor());
        addPokedexPokemon("dunsparce");
        addNewPokemon(new Dunmyth());
        addNewPokemon(new Dundragon());
        addNewPokemon(new Merlicun());
        addNewPokemon(new Firomenis());
        addNewPokemon(new Wolfum());
        addNewPokemon(new Supiritto());
        addNewPokemon(new Infernadeer());
        addNewPokemon(new Cradecart());
        addNewPokemon(new Sylure());
        addNewPokemon(new Syrallure());
        addNewPokemon(new Syrenade());
        addNewPokemon(new Tartot());
        addNewPokemon(new Teranigrade());
        addNewPokemon(new Setsarec());

    }
}
