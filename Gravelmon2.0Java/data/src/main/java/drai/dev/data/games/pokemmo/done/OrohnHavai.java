package drai.dev.data.games.pokemmo.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.atlas.Akrovern;
import drai.dev.data.pokemon.atlas.Albivore;
import drai.dev.data.pokemon.atlas.Carosella;
import drai.dev.data.pokemon.atlas.Eletize;
import drai.dev.data.pokemon.atlas.Emperiegle;
import drai.dev.data.pokemon.atlas.Eriegle;
import drai.dev.data.pokemon.atlas.Glozard;
import drai.dev.data.pokemon.atlas.Karaggon;
import drai.dev.data.pokemon.atlas.Luvenny;
import drai.dev.data.pokemon.atlas.Meritrot;
import drai.dev.data.pokemon.atlas.Nursee;
import drai.dev.data.pokemon.atlas.Nurturse;
import drai.dev.data.pokemon.atlas.Radiaze;
import drai.dev.data.pokemon.atlas.Radizorb;
import drai.dev.data.pokemon.atlas.Spartzle;
import drai.dev.data.pokemon.atlas.Stalliot;
import drai.dev.data.pokemon.atlas.Suavenny;
import drai.dev.data.pokemon.atlas.Trillowee;
import drai.dev.data.pokemon.atlas.Turtelisk;
import drai.dev.data.pokemon.atlas.Wilspri;
import drai.dev.data.pokemon.orohnhavai.*;
import drai.dev.data.pokemon.orohnhavai.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done
public class OrohnHavai extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new OrohnHavai();
    private OrohnHavai() {
        super("Orohn-Havai");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Ekopi());
        addNewPokemon(new Ekoraft());
        addNewPokemon(new Expertri());
        addNewPokemon(new Flaero());
        addNewPokemon(new Impferno());
        addNewPokemon(new Pyrovern());
        addNewPokemon(new Kelpony());
        addNewPokemon(new Maritide());
        addNewPokemon(new Reefallion());
        addNewPokemon(new Chenileaf());
        addNewPokemon(new Cottoon());
        addNewPokemon(new Sedavlin());
        addNewPokemon(new Warblu());
        addNewPokemon(new Territore());
        addNewPokemon(new Warshrike());
//        addNewPokemon(new Troopant()); Missing art
//        addNewPokemon(new Antzooka()); Missing art
        addNewPokemon(new Goosea());
        addNewPokemon(new Neinei());
        addNewPokemon(new Zapillar());
        addNewPokemon(new Zapcoon());
        addNewPokemon(new Zaptenna());
        addNewPokemon(new Thistling());
        addNewPokemon(new Withettle());
        addNewPokemon(new Bonzumi());
        addNewPokemon(new Bonzire());
        addNewPokemon(new Imbumi());
        addNewPokemon(new Frossit());
        addNewPokemon(new Petumi());
        addNewPokemon(new Fleuroma());
        addNewPokemon(new Dorentu());
        addNewPokemon(new Grandorent());
        addNewPokemon(new Eriegle());
        addNewPokemon(new Albivore());
        addNewPokemon(new Emperiegle());
        addNewPokemon(new Elfini());
        addNewPokemon(new Aidelf());
        addNewPokemon(new Mousense());
        addNewPokemon(new Sensarat());
        addNewPokemon(new Spartzle());
        addNewPokemon(new Eletize());
        addNewPokemon(new Slickitty());
        addNewPokemon(new Axeleraze());
        addNewPokemon(new Kroach());
        addNewPokemon(new Kloakroach());
        addNewPokemon(new Timiby());
        addNewPokemon(new Nervreck());
        addNewPokemon(new Wreckore());
        addNewPokemon(new Lilabaa());
        addNewPokemon(new Lulabaa());
        addNewPokemon(new Glumence());
        addNewPokemon(new Glumexin());
        addNewPokemon(new Nursee());
        addNewPokemon(new Nurturse());
        addNewPokemon(new Chiroo());
        addNewPokemon(new Trairoo());
        addNewPokemon(new Luvenny());
        addNewPokemon(new Suavenny());
        addNewPokemon(new Pebblent());
        addNewPokemon(new Rocroset());
        addNewPokemon(new Granderosa(new Stats(512, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Reefermal());
        addNewPokemon(new Veilvid());
        addNewPokemon(new Brambarb());
        addNewPokemon(new Wickvine());
        addNewPokemon(new Wicktrive());
        addNewPokemon(new Winklit());
        addNewPokemon(new Gleamur());
        addPokedexPokemon("pichu, pikachu, raichu");
        addNewPokemon(new Pixiechu());
        var chemecko = new Chemecko();
        addNewPokemon(chemecko);
//        addNewPokemon(new AvorianChemecko(chemecko.getPokedexNumber()));
        addNewPokemon(new Molozard());
        addNewPokemon(new Twirpant());
        addNewPokemon(new Kombantis());
        addNewPokemon(new Barbenin());
        addNewPokemon(new Scoprikon());

        addNewPokemon(new Kraklam());
        addNewPokemon(new Krakshen());
        addNewPokemon(new Caraprisma());
        addNewPokemon(new Clawconut());
        addNewPokemon(new Clawgigus());
        addNewPokemon(new Fribitad());
        addNewPokemon(new Ribivine());
        addNewPokemon(new Meritrot());
        addNewPokemon(new Stalliot());
        addNewPokemon(new Carosella());
        addNewPokemon(new Timingo());
        addNewPokemon(new Flambagant());
        addNewPokemon(new HavaiianGastly("", Aspect.HAVAIIAN));
        addNewPokemon(new HavaiianHaunter("", Aspect.HAVAIIAN));
        addNewPokemon(new HavaiianGengar("", Aspect.HAVAIIAN));
//        addNewPokemon(new Glimpid()); Member of line not finished
//        addNewPokemon(new Cryosect()); Missing Art
        addNewPokemon(new Hematick());
        addNewPokemon(new Vorvosip());
        addNewPokemon(new Vorvosip());
        addNewPokemon(new Stegrump());
        addNewPokemon(new Stegovore());
        addNewPokemon(new Devostoric());
        addNewPokemon(new Petirex());
        addNewPokemon(new Wreckasaur());
        addNewPokemon(new Arrocknid());
        addNewPokemon(new Exoroknid());
        addNewPokemon(new Kragodon(new Stats(415, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Therasloth());
        addNewPokemon(new Slotherror());
        addNewPokemon(new Pitopyre(new Stats(378, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Wooble());
        addNewPokemon(new Snowool());
        addNewPokemon(new Shiveram());
        addNewPokemon(new Burnuki(new Stats(388, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Turtelisk());
        addNewPokemon(new Karaggon());
        addNewPokemon(new Akrovern());
        addNewPokemon(new Glozard());
        addNewPokemon(new Radizorb());
        addNewPokemon(new Radiaze());
        addNewPokemon(new Clastroid());
        addNewPokemon(new Colistroid());
        addNewPokemon(new Galixoid());
        addNewPokemon(new Ferobite());
        addNewPokemon(new Purswayer());
        addNewPokemon(new Fortibal());
        addNewPokemon(new Armodieval());
        addNewPokemon(new Chillimp(new Stats(345, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Pinxie());
        addNewPokemon(new Cosminx());
//        addNewPokemon(new Konchore()); Missing Stats
//        addNewPokemon(new Neptide()); Missing Art
//        addNewPokemon(new Lemomi()); Missing Stats
//        addNewPokemon(new Shelmissy()); Missing Art
//        addNewPokemon(new Empressea()); Missing Art
        addNewPokemon(new Sharfin());
        addNewPokemon(new Thrashark());
        addNewPokemon(new Voidefish());
        addNewPokemon(new Voidevour());
//        addNewPokemon(new Gargobble()); Missing Art
//        addNewPokemon(new Garglizer()); Member of line not finished
        addNewPokemon(new Ruffski());
        addNewPokemon(new Arblizen());
        addNewPokemon(new Siberizen());
        addNewPokemon(new Pipsicle());
        addNewPokemon(new Wilspri());
        addNewPokemon(new Trillowee());

        addNewPokemon(new Oreglyph());
        addNewPokemon(new Geoglyphic(new Stats(476, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Eskiflurr()); Missing art
        addNewPokemon(new Tasticky());
        addNewPokemon(new Tadapt());
        addNewPokemon(new Thornment());
        addNewPokemon(new Phrilter());
        addNewPokemon(new Vortexol());
        addNewPokemon(new Elecko());
        addNewPokemon(new Foxsye());
        addNewPokemon(new Veroxifye());
//        addNewPokemon(new Chainect()); Missing art
//        addNewPokemon(new Chainector()); Missing art
        addNewPokemon(new Tundrill());
//        addNewPokemon(new Malakele()); Missing art
//        addNewPokemon(new Kahukele()); Missing art
        addNewPokemon(new Camohut());
        addNewPokemon(new Camofirma());
        addNewPokemon(new Fyglow());
//        addNewPokemon(new Polighoul()); Missing art
        addPokedexPokemon(
                "eevee," +
                        "vaporeon," +
                        "jolteon," +
                        "flareon," +
                        "espeon," +
                        "umbreon," +
                        "leafeon," +
                        "glaceon," +
                        "sylveon");
        addNewPokemon(new Alpheon());
        addNewPokemon(new Eveon());
        addNewPokemon(new Tekichu(new Stats(410, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Finray());
        addNewPokemon(new Ogoprowl());
        addNewPokemon(new Sephysar());
//        addNewPokemon(new Vexigon()); Member of line not finished
//        addNewPokemon(new Noxareo()); Missing art
//        addNewPokemon(new Darcastro()); Member of line not finished
        addNewPokemon(new Rivulcred());
        addNewPokemon(new Valecred());
//        addNewPokemon(new Drazephir()); Missing art
        addNewPokemon(new Netherval());
        addNewPokemon(new Quadrossal());
        addNewPokemon(new Infiluv());
//        addNewPokemon(new Obideion()); Missing art
//        addNewPokemon(new Generion()); Missing art
//        addNewPokemon(new Indureion()); Missing art
        addNewPokemon(new Zedakazm());
//        addNewPokemon(new Intelix()); Missing art
//        addNewPokemon(new Nectavian()); Missing art

//        addNewPokemon(new HavaiianPoliwag(60)); //Member of line Not Finished
//        addNewPokemon(new HavaiianPoliwhirl(61)); Missing Art
//        addNewPokemon(new HavaiianKrabby(98)); Missing Stats
//        addNewPokemon(new HavaiianExeggcute(102)); Missing Art
//        addNewPokemon(new HavaiianExeggutor(103)); Missing Art
//        addNewPokemon(new HavaiianHorsea(116)); //Member of line Not Finished
//        addNewPokemon(new HavaiianBlipbug(824)); Member of line Not Finished
//        addNewPokemon(new HavaiianDottler(825)); Missing Art
//        addNewPokemon(new HavaiianOrbeetle(826)); Missing Art
//        addNewPokemon(new HavaiianOshawott(501)); Member of line Not Finished
    }

}
