package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.arom.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.elb.*;
import drai.dev.data.pokemon.sahl.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Arom extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Arom();
    private Arom() {
        super("Arom");
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

        addNewPokemon(new Spramarro());
        addNewPokemon(new Sprafiti());
        addNewPokemon(new Spravinci());
        addNewPokemon(new Blaapra());
        addNewPokemon(new Blaastaa());
        addNewPokemon(new Breestaa());
        addNewPokemon(new Blubbybara());
        addNewPokemon(new Rowybara());
        addNewPokemon(new Caquypapa());
        addNewPokemon(new Gourmaus());
        addNewPokemon(new Gourmilin());
        addNewPokemon(new Papoe());
        addNewPokemon(new Delipoe());
        addNewPokemon(new Newpapoe());
        addNewPokemon(new Mantaby());
        addNewPokemon(new Caestymp());
        addNewPokemon(new Mantaestus());
        addNewPokemon(new Weakalf());
        addNewPokemon(new Oxacles());
        addNewPokemon(new Charlami());
        addNewPokemon(new Dalsiccia());
        addNewPokemon(new Gattuccio());
        addNewPokemon(new Nerocchio());
        addNewPokemon(new Gumarai());
        addNewPokemon(new Gorumarai());
        addNewPokemon(new Gusskit());
        addNewPokemon(new Danderain());
        addNewPokemon(new Bloburchin());
        addNewPokemon(new Bomburchin());
        removePokedexPokemon("kapsakid, scovillain");
        addNewPokemon(new Scornovilain());
        removePokedexPokemon("bonsly, sudowoodo");
        addNewPokemon(new Charcowoodo());
        removePokedexPokemon("tailow, swellow");
        addNewPokemon(new Swellaposs());
        addNewPokemon(new Orphovi());
        addNewPokemon(new Orthiator());
        addNewPokemon(new Ciciano());
        addNewPokemon(new Cicalegro());
        addNewPokemon(new Lemlin());
        addNewPokemon(new Zapplem());
        addNewPokemon(new Terekko());
        addNewPokemon(new Gekkerra());
        addNewPokemon(new AromianSmoliv("", Aspect.AROMIAN)); 
        addNewPokemon(new AromianDolliv("", Aspect.AROMIAN));
        addNewPokemon(new Arbovino());
        removePokedexPokemon("shroomish, breloom");
        addNewPokemon(new Scippoloom());
        addNewPokemon(new Leektonik());
        addNewPokemon(new Leektoross());
        addNewPokemon(new Sweepoke());
        addNewPokemon(new Sweebro());
        addNewPokemon(new Sweeking());
        addNewPokemon(new Aromianmilkitt());
        addNewPokemon(new Aromianferalassi());
        addNewPokemon(new Stakebble());
        addNewPokemon(new Gargolith());
        addNewPokemon(new Gigargolith());
        addNewPokemon(new Santhill());
        addNewPokemon(new Scampizza());
        addNewPokemon(new Sluffin());
        addNewPokemon(new Slugettone());
        addNewPokemon(new Truffant());
        addNewPokemon(new Truffaraboar());
        addNewPokemon(new Triglio());
        addNewPokemon(new Ciporror());
        addNewPokemon(new Sinicecrea());
        addNewPokemon(new Polcreagiced());
        addNewPokemon(new Appafrigion());
        removePokedexPokemon("vanillite-aromian, vanillish-aromian");
        addNewPokemon(new AromianVanillite("", Aspect.AROMIAN));
        addNewPokemon(new AromianVanillish("", Aspect.AROMIAN));
        addNewPokemon(new Chocolluxe());
        addNewPokemon(new Frequenfly());
        addNewPokemon(new Mothamantra());
        addNewPokemon(new Badalocco());
        addNewPokemon(new Flowacarpa());
        addNewPokemon(new Numeal());
        addNewPokemon(new Glacerus());
        addNewPokemon(new AromianKlink("", Aspect.AROMIAN)); 
        addNewPokemon(new AromianKlang("", Aspect.AROMIAN));
        addNewPokemon(new Klinkopta());
        addNewPokemon(new Poiduck());
        addNewPokemon(new Velduck());
        addNewPokemon(new Tangasta());
        addNewPokemon(new Tanghetti());
        addNewPokemon(new Puddacuta());
        addNewPokemon(new Tiramisoul());
        removePokedexPokemon("elgyem, beheeyem");
        addNewPokemon(new Gemineeyem());
        removePokedexPokemon("swirlix, slurpuff");
        addNewPokemon(new Slurruff());
        removePokedexPokemon("milcery-fabelian, alcheesie");
        addNewPokemon(new Formagie());
        addNewPokemon(new Bancon());
        addNewPokemon(new Tesoroink());
        addNewPokemon(new Terowl());
        addNewPokemon(new Tarostrix());
        removePokedexPokemon("scraggy, scrafty");
        addNewPokemon(new Scraponey());
        removePokedexPokemon("remoraid, octillery");
        addNewPokemon(new Whalship());
        removePokedexPokemon("slugma, magcargo");
        addNewPokemon(new Vespargo());
        addNewPokemon(new Gondozia());
        addNewPokemon(new Romarlord());
        addNewPokemon(new Mazzamimp());
        addNewPokemon(new Mazzamoga());
        addNewPokemon(new Mazzamonsta());
        addNewPokemon(new Montlett());
        addNewPokemon(new Montrio());
        addNewPokemon(new Montattro());
        addNewPokemon(new Puppoof());
        addNewPokemon(new Doggoof());
        addNewPokemon(new Madromooff());
        addNewPokemon(new AromianStonjourner("", Aspect.AROMIAN)); 
        addNewPokemon(new Stonleaner());
        addNewPokemon(new AromianSpritzee("", Aspect.AROMIAN)); 
        addNewPokemon(new AromianAromatisse("", Aspect.AROMIAN));
        addNewPokemon(new Aromiasma());
        addNewPokemon(new Cutelon());
        addNewPokemon(new Loafelon());
        addNewPokemon(new Caebelon());
        addNewPokemon(new Breabatch().fishingSpawnFromExisting());
        addNewPokemon(new Breabecue());
        addNewPokemon(new Clavase());
        addNewPokemon(new Terapota());
        addNewPokemon(new Reptifia());
        addNewPokemon(new Ferraraptor());
        addNewPokemon(new Sponpoi().fishingSpawnFromExisting());
        addNewPokemon(new Ritturtell());
        addNewPokemon(new Poironell());
        removePokedexPokemon("charcadet, armarouge, ceruledge");
        addNewPokemon(new Amethius());
        removePokedexPokemon("gible");
        addNewPokemon(new AromianGabite("", Aspect.AROMIAN)); 
        addNewPokemon(new AromianGarchomp("", Aspect.AROMIAN));
        addNewPokemon(new Brickonet());
        addNewPokemon(new Twallgon());
        addNewPokemon(new Strowacor());
        removePokedexPokemon("slakoth-elbian, vigoroth-elbian, vigoking-elbian");
//        addNewPokemon(new AromianGulpin("", Aspect.AROMIAN)); TODO
//        addNewPokemon(new AromianSwalot("", Aspect.AROMIAN));
        addNewPokemon(new Cervelot());
        addNewPokemon(new AromianSentret("", Aspect.AROMIAN)); 
        addNewPokemon(new AromianFurret("", Aspect.AROMIAN));
        addNewPokemon(new Justret());
        removePokedexPokemon("chingling");
        addNewPokemon(new AromianChimecho("", Aspect.AROMIAN)); 
        addNewPokemon(new Belldong());
        addNewPokemon(new Diveloon());
        addNewPokemon(new Diveblim());
        addNewPokemon(new Divemarine());
        removePokedexPokemon("snubbull, granbull");
        addNewPokemon(new Terribull());
        removePokedexPokemon("ekans, arbok");
        addNewPokemon(new Twiparok());
        addNewPokemon(new AromianMeowth("", Aspect.AROMIAN)); 
        addNewPokemon(new Purrow());
        addNewPokemon(new AromianRhyhorn("", Aspect.AROMIAN)); 
        addNewPokemon(new Tricerior());
        addNewPokemon(new Clouffing());
        addNewPokemon(new Breezing());
        removePokedexPokemon("lediba, ledian");
        addNewPokemon(new Lumedian());

        removePokedexPokemon("sunkern, sunflora");
        addNewPokemon(new Solaflora());
        removePokedexPokemon("lunatone");
        addNewPokemon(new Glaciluna());
        removePokedexPokemon("solrock");
        addNewPokemon(new Pyrosol());
        removePokedexPokemon("hooh-aromian, lugia-aromian");
        addNewPokemon(new Tennomoru());
        addNewPokemon(new Piozizi());
        addNewPokemon(new Pioorso());
        addNewPokemon(new Piopeca());
        addNewPokemon(new Piokovu());
        addNewPokemon(new Regifly());
        addNewPokemon(new Regibug());
        removePokedexPokemon("cobalion-sahlian, terakion-sahlian, verizion-sahlian");
        addNewPokemon(new Suimoru());
        addNewPokemon(new Kinmoru());
        addNewPokemon(new Domoru());
        addNewPokemon(new Araemon());
        addNewPokemon(new Mokuonei());
        addNewPokemon(new Kaimarei());
        addNewPokemon(new Meikourkei());
        
    }

}
