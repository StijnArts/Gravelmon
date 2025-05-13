package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.arom.*;
import drai.dev.data.pokemon.elb.*;
import drai.dev.data.pokemon.ferran.*;
import drai.dev.data.pokemon.ferran.Romarlord;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Ferran extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Ferran();
    private Ferran() {
        super("Ferran");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Chamaerol());
        addNewPokemon(new Chamaelik());
        addNewPokemon(new Chamaelec());
        addNewPokemon(new Hogoat());
        addNewPokemon(new Flamalope());
        addNewPokemon(new Shamalope());
        addNewPokemon(new Platyblub());
        addNewPokemon(new Platypuf());
        addNewPokemon(new Platox());
        addNewPokemon(new Puddiny());
        addNewPokemon(new Frosplit());
        addNewPokemon(new Staphug());
        addNewPokemon(new Staphoon());
        addNewPokemon(new Starmortle());
        addPokedexPokemon("barboach-ferranian, whiscash-ferranian");
        addNewPokemon(new Whislong());
        addNewPokemon(new Denhoru());
        addNewPokemon(new Voodoll());
        addNewPokemon(new Voocult());
        addNewPokemon(new Dragose());
        addNewPokemon(new Thoraco());
        addNewPokemon(new Literay());
        addNewPokemon(new Herocray());
        addPokedexPokemon("patrat-ferranian, watchog-ferranian");
        addNewPokemon(new Peanou());
        addNewPokemon(new Peaster());
        addNewPokemon(new Peamash());
        addNewPokemon(new Firy());
        addNewPokemon(new Flaritch());
        addNewPokemon(new Flapurgess());
        addPokedexPokemon("applin-ferranian");
        addNewPokemon(new Jackozard());
        addNewPokemon(new Yumkinpie());
        addNewPokemon(new Froby());
        addNewPokemon(new Froyena());
        addNewPokemon(new Frovalan());
        addNewPokemon(new Ankylub());
        addNewPokemon(new Cluborus());
        addNewPokemon(new Morsterus());
        addNewPokemon(new Pumpcula());
        addNewPokemon(new Nosfercula());
        addNewPokemon(new Gonezia());
        addNewPokemon(new Romarlord());
        addNewPokemon(new Cacteat());
        addNewPokemon(new Cacturst());
        addNewPokemon(new Labee());
        addPokedexPokemon("lapras-ferranian");
        addNewPokemon(new Flouzy());
        addNewPokemon(new Bammerjet());
        addNewPokemon(new Clamoon().fishingSpawnFromExisting());
        addNewPokemon(new Bladark());
        addNewPokemon(new Cauldrogeist());
        addNewPokemon(new Clavase());
        addNewPokemon(new Terapota());
        addNewPokemon(new Easteg());
        addNewPokemon(new Surpeg());
        addNewPokemon(new Bloomeg());
        addNewPokemon(new Hourghas());
        addPokedexPokemon("bagon-ferranian, shelgon-ferranian, salamence-ferranian");
        addNewPokemon(new Scorpait());
        addNewPokemon(new Scorpunter());
        addNewPokemon(new Hummagic());
        addNewPokemon(new Owizard());
        addNewPokemon(new Capernoir());
        addNewPokemon(new Casanoistra());
        addNewPokemon(new Viras());
        addNewPokemon(new Viradle());
        addNewPokemon(new Tracoon());
        addNewPokemon(new Garbagoon());
        addNewPokemon(new Pechick());
        addNewPokemon(new Pegrow());
        addNewPokemon(new Jungrowl());
        addNewPokemon(new Gorilagma()); //fossil
        addNewPokemon(new Calameteo());
        addNewPokemon(new Forestryx()); //fossil
        addNewPokemon(new Bulldozon());
        addNewPokemon(new Poanter()); //fossil
        addNewPokemon(new Smiloachur());
        addNewPokemon(new Babybara());
        addNewPokemon(new Capypapa());
        addNewPokemon(new Machaunt());
        addNewPokemon(new Pillarble());
        addNewPokemon(new Carvarble());
        addPokedexPokemon("wailmer, wailord, wailord-ferranian");
        addNewPokemon(new Gargorble());
        addNewPokemon(new Cunooty());
        addNewPokemon(new Cunignite());
        addNewPokemon(new Jelliamp());
        addNewPokemon(new Jelliora());
        addPokedexPokemon("yamask-ferranian");
        addNewPokemon(new Chematrigus());
        addNewPokemon(new Gerilliki());
        addNewPokemon(new Beavel());
        addNewPokemon(new Totorock());
        addNewPokemon(new Snotom());
        addNewPokemon(new Snonuke());
        addNewPokemon(new Snoraktor());
        addNewPokemon(new Mazzruggle());
        addNewPokemon(new Mazzogre());
        addPokedexPokemon("slakoth-ferranian, vigoroth-ferranian");
        addNewPokemon(new Vigoking());
        addNewPokemon(new ElbianVigoking("", Aspect.ELBIAN));
        removePokedexPokemon("vigoking-elbian");
        addNewPokemon(new Savawl());
        addNewPokemon(new Savannage());
        addNewPokemon(new Plasmind());
        addNewPokemon(new Skadeer());
        addNewPokemon(new Coadeer());
        addNewPokemon(new Crickerist());
        addNewPokemon(new Mantunfu());
        addNewPokemon(new Glorm());
        addNewPokemon(new Glowero());
        addPokedexPokemon("virizion-ferranian, terrakion-ferranian, cobalion-ferranian, bounsweet-ferranian");
        addNewPokemon(new Meleenee());
        removePokedexPokemon("meowth-ferranian");
        addNewPokemon(new Empeero());
        addNewPokemon(new Perrinnip());
        addNewPokemon(new Viceasus());
        addNewPokemon(new Virtryph());
        addNewPokemon(new Inuniferus());
    }

}
