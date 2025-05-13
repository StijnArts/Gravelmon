package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Palmia  extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Palmia();
    private Palmia() {
        super("Palmia");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.PALMIA);
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Wizlit());
        addNewPokemon(new Wazloom());
        addNewPokemon(new Hollose(new Stats(528, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Oryoze());
        addNewPokemon(new Burnyx());
        addNewPokemon(new Pyroxall(new Stats(530, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Squcale().fishingSpawnFromExisting());
        addNewPokemon(new Beracale());
        addNewPokemon(new Yadazard(new Stats(534, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));

        addNewPokemon(new Bulblute());
        addNewPokemon(new Euphobul());
        addNewPokemon(new Cianbul(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Arnabar());
        addNewPokemon(new Jazarnab(new Stats(410, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Garupa());
        addNewPokemon(new Upacoon());
        addNewPokemon(new Dobnaly(new Stats(420, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Tetranq());
        addNewPokemon(new Cynomotar(new Stats(430, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Jarboen(new Stats(430, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Sanqet());
        addNewPokemon(new Herramal(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Buffox());
        addNewPokemon(new Foxmi(new Stats(460, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kermite());
        addNewPokemon(new Solmite(new Stats(410, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Wingmite(new Stats(410, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Mitequeen(new Stats(520, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Miteking(new Stats(520, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Hamoria().fishingSpawnFromExisting());
        addNewPokemon(new Bossmor(new Stats(450, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Oinad().fishingSpawnFromExisting());
        addNewPokemon(new Kanarel(new Stats(450, StatArchetype.PHYSICAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Weroy());
        addNewPokemon(new Fazight());
        addNewPokemon(new Mudarek(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
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
        addNewPokemon(new Topazeon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Marsheon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Piezeon(new Stats(525, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Chibug(new Stats(320, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Snakolt(new Stats(320, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Grumyna());
        addNewPokemon(new Mynzaj(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Tribarix(new Stats(360, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new Vargri().fishingSpawnFromExisting());
        addNewPokemon(new Monivara(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Litchil());
        addNewPokemon(new Defstring());
        addNewPokemon(new Dajara(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));

        addPokedexPokemon("ratata-palmian, raticate-palmian");
        addNewPokemon(new Ratatox(new Stats(525, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Froguin().fishingSpawnFromExisting());
        addNewPokemon(new Tenturog(new Stats(470, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Murkrog(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Igon());
        addNewPokemon(new Stingall());
        addNewPokemon(new Gonamor(new Stats(540, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        addNewPokemon(new Gonking(new Stats(540, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Agona(new Stats(540, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Colloestamp(new Stats(460, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Poltamp(new Stats(310, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Farstamp(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Finstamp(new Stats(310, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Doomonic(new Stats(580, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));

        addPokedexPokemon("gastly-palmian");
        addNewPokemon(new Dieseltar());
        addNewPokemon(new Diesgar(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Mogboal());
        addNewPokemon(new Goldos(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Salaqoar(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Reroglora());
        addNewPokemon(new Agroglora(new Stats(440, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Reroyox());
        addNewPokemon(new Walitan(new Stats(450, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Rexiard());
        addNewPokemon(new Draxizar(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Glidird(new Stats(360, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));

        addPokedexPokemon("pawniard-palmian, bisharp-palmian");
        addNewPokemon(new Kintan(new Stats(550, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Jelltox(new Stats(350, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).fishingSpawnFromExisting());
        addNewPokemon(new Darrpler());
        addNewPokemon(new Darcoon());
        addNewPokemon(new Grimoth(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Batzon());
        addNewPokemon(new Basitrus(new Stats(450, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Owsno());
        addNewPokemon(new Flacowl(new Stats(440, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("absol");
        addNewPokemon(new Balan(new Stats(560, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Desol(new Stats(560, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Bawolf());
        addNewPokemon(new Puffulf(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));

        addPokedexPokemon("gible-palmian, gabite-palmian, garchomp-palmian, exeggcute-palmian, exeggutor-palmian");
        addNewPokemon(new Dusklyr());
        addNewPokemon(new Duskreap(new Stats(460, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
        addNewPokemon(new Fairny());
        addNewPokemon(new Candilite());
        addNewPokemon(new Lampuly(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));

        addPokedexPokemon("growlithe-palmian, arcanine-palmian, magikarp-palmian");
        addNewPokemon(new Bahmut(new Stats(540, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Joorit());
        addNewPokemon(new Ejoort(new Stats(460, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));

        addPokedexPokemon("poliwag-palmian, poliwhirl-palmian");
        addNewPokemon(new Polimud(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Croomish(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Yotock(new Stats(450, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));

        addNewPokemon(new Chikotize());
        addNewPokemon(new Florize());
        addNewPokemon(new Purgrize(new Stats(580, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Cyndaqize());
        addNewPokemon(new Flamize());
        addNewPokemon(new Efreetize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Totodize().fishingSpawnFromExisting());
        addNewPokemon(new Aqurize());
        addNewPokemon(new Orcarize(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));

        addPokedexPokemon("eevee");
        addNewPokemon(new Eonize(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addPokedexPokemon("pichu, pikachu, raichu");
        addNewPokemon(new Churaize(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Pikavee());
        addNewPokemon(new Raivee(new Stats(550, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("pinsir");
        addNewPokemon(new Insarize(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK))));
        addPokedexPokemon("rookidee");
        addPokedexPokemon("corvisquire");
        addPokedexPokemon("corviknight");
        addNewPokemon(new Stormrize(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("tyrogue");
        addPokedexPokemon("hitmonchan");
        addPokedexPokemon("hitmonlee");
        addPokedexPokemon("hitmontop");
        addNewPokemon(new Hitmonrize(new Stats(580, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addPokedexPokemon("solosis");
        addPokedexPokemon("duosion");
        addPokedexPokemon("reuniclus");
        addNewPokemon(new Cellurize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        addPokedexPokemon("nickit");
        addPokedexPokemon("thievul");
        addNewPokemon(new Yeggrize(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("flabebe");
        addPokedexPokemon("floette");
        addPokedexPokemon("florges");
        addNewPokemon(new Pixirize(new Stats(580, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("koffing");
        addPokedexPokemon("weezing");
        addNewPokemon(new Polurize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("trapinch");
        addPokedexPokemon("vibrava");
        addPokedexPokemon("flygon");
        addNewPokemon(new Traprize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.ATTACK))));
        addPokedexPokemon("vanillite");
        addPokedexPokemon("vanillish");
        addPokedexPokemon("vanilluxe");
        addNewPokemon(new Glacerize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        addPokedexPokemon("roggenrola");
        addPokedexPokemon("boldore");
        addPokedexPokemon("gigalith");
        addNewPokemon(new Boldurize(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addPokedexPokemon("klink");
        addPokedexPokemon("klang");
        addPokedexPokemon("klinklang");
        addNewPokemon(new Kagenrize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Drarize());
        addNewPokemon(new Dreadrize());
        addNewPokemon(new Tymarize(new Stats(600, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Maditize(new Stats(610, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Coratize(new Stats(610, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Noistize(new Stats(610, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Mothrize(new Stats(680, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Majaite(new Stats(680, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Royandy(new Stats(680, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))));
    }
}
