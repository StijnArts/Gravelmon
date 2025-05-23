package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatArchetype.*;
import static drai.dev.data.attributes.StatType.*;

public class Raian extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Raian();
    private Raian() {
        super("Raian");
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



        addNewPokemon(new Migraff());
        addNewPokemon(new Airgraff());
        addNewPokemon(new Raffrobter(new Stats(530, BULKY_SUPPORT, List.of(HP))));
        addNewPokemon(new Hymbr());
        addNewPokemon(new Blayna());
        addNewPokemon(new Ertheno(new Stats(525, BULKY_PHYSICAL_ATTACKER, List.of(HP))));
        addNewPokemon(new Aquama());
        addNewPokemon(new Salaima());
        addNewPokemon(new Amoxica(new Stats(534, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));

        addNewPokemon(new Flufforn());
        addNewPokemon(new Sahawk());
        addNewPokemon(new Driacon(new Stats(480, PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new Pineque());
        addNewPokemon(new Orcpine(new Stats(450, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(HP))));
        addNewPokemon(new Saltworm());
        addNewPokemon(new Pocrock());
        addNewPokemon(new Crystsap(new Stats(460, BULKY_PHYSICAL_ATTACKER, List.of(ATTACK))));
        addNewPokemon(new Pomeed());
        addNewPokemon(new Bloomnate());
        addNewPokemon(new Kingpome(new Stats(450, PHYSICAL_WALL, List.of(DEFENCE))));
        addNewPokemon(new Coatity());
        addNewPokemon(new Bintat(new Stats(440, FAST_PHYSICAL_ATTACKER, List.of(ATTACK))));
        addNewPokemon(new Chubchu()); //Evolves into Elfachu from LastPoint
        addNewPokemon(new Jakort().fishingSpawnFromExisting());
        addNewPokemon(new Jaicicle(new Stats(450, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Jaklaze(new Stats(450, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new Dimolf());
        addNewPokemon(new Wultail(new Stats(454, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE, StatType.ATTACK, StatType.ATTACK))));
        addNewPokemon(new Maxard());
        addNewPokemon(new Triagon(new Stats(410, FAST_PHYSICAL_ATTACKER, List.of(SPEED))));

        addNewPokemon(new Snaprick());
        addNewPokemon(new Turtace());
        addNewPokemon(new Spiritur(new Stats(525, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Sycrog());
        addNewPokemon(new Zenrog());
        addNewPokemon(new Triclope(new Stats(534, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new Dagekko());
        addNewPokemon(new Evigekko());
        addNewPokemon(new Predodator(new Stats(530, PHYSICAL_ATTACKER, List.of(ATTACK))));

        addNewPokemon(new Bubotus().fishingSpawnFromExisting());
        addNewPokemon(new Vamprquid(new Stats(440, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new Lileaf());
        addNewPokemon(new Comfleaf());
        addNewPokemon(new Umleaf(new Stats(480, BULKY_SUPPORT, List.of(DEFENCE))));
        addNewPokemon(new Abuleaf(new Stats(480, PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Candilug());
        addNewPokemon(new Slugrish(new Stats(440, BULKY_SUPPORT, List.of(DEFENCE))));
        addNewPokemon(new Envirock(new Stats(310, PHYSICAL_WALL, List.of(DEFENCE))));
        addNewPokemon(new CaveEnvirock("", Aspect.CAVE, new Stats(310, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new ForestEnvirock("", Aspect.FOREST, new Stats(310, BULKY_SUPPORT, List.of(DEFENCE))));
        addNewPokemon(new SeaEnvirock("", Aspect.SEA, new Stats(310, SPECIAL_WALL, List.of(SPEED))));
        addNewPokemon(new Collecrok());
        addNewPokemon(new Dracnarok(new Stats(550, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new Cheeda());
        addNewPokemon(new Dameetah());
        addNewPokemon(new Cherastle(new Stats(510, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE   ))));
        addNewPokemon(new Zesee());
        addNewPokemon(new Soishell());
        addNewPokemon(new Maestryme(new Stats(500, SPECIAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new Elphish().fishingSpawnFromExisting());
        addNewPokemon(new Malactro(new Stats(460, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).fishingSpawnFromExisting());
        addNewPokemon(new Cublog());
        addNewPokemon(new Leoquare(new Stats(460, BULKY_SPECIAL_ATTACKER, List.of(SPEED))));

        addNewPokemon(new Solice());
        addNewPokemon(new Frozarawn());
        addNewPokemon(new Darcicle(new Stats(534, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Watchost());
        addNewPokemon(new Redinfine());
        addNewPokemon(new Securider(new Stats(520, PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Clasoil());
        addNewPokemon(new Cimentok());
        addNewPokemon(new Closalarm(new Stats(525, SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));

        addNewPokemon(new Biomkid());
        addNewPokemon(new Mbombo());
        addNewPokemon(new Drwitch(new Stats(440, BULKY_SUPPORT, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new Esudoo(new Stats(440, PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Blobybolb(new Stats(340, SPECIAL_WALL, List.of(SPEED))));
        addNewPokemon(new Apefant());
        addNewPokemon(new Probsant(new Stats(430, SLOW_BULKY_PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new Hazaire());
        addNewPokemon(new Expolaze());
        addNewPokemon(new Gasular(new Stats(515, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new Sphoild());
        addNewPokemon(new Royalinx(new Stats(460, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new Napohead(new Stats(420, PHYSICAL_WALL, List.of(HP))).fishingSpawnFromExisting());
        addNewPokemon(new Shargill(new Stats(430, FAST_PHYSICAL_ATTACKER, List.of(ATTACK))));
        addNewPokemon(new Shielbow());
        addNewPokemon(new Spearetle(new Stats(450, PHYSICAL_WALL, List.of(DEFENCE))));
        addNewPokemon(new Jembirit());
        addNewPokemon(new Congumo(new Stats(450, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new Siagibon(new Stats(450, FAST_PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new Parotish());
        addNewPokemon(new Pentagle(new Stats(480, PHYSICAL_ATTACKER, List.of(SPEED))));

        addNewPokemon(new Jumpkret(new Stats(550, FAST_PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new Jajagon(new Stats(550, PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new Ariromode(new Stats(550, PHYSICAL_WALL, List.of(HP))));
        addNewPokemon(new Batacuila(new Stats(550, FAST_SPECIAL_WALL, List.of(SPEED))));
        addNewPokemon(new Shroheat(new Stats(550, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new Zonktress(new Stats(550, BULKY_PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new Pearcious(new Stats(550, FAST_SUPPORT, List.of(SPEED))));
        addNewPokemon(new Pullrog(new Stats(550, SLOW_BULKY_SPECIAL_ATTACKER, List.of(HP))));
        addNewPokemon(new Rugmamba(new Stats(550, FAST_SPECIAL_ATTACKER, List.of(SPEED, SPEED))));
        addNewPokemon(new Fashinda(new Stats(550, SPECIAL_WALL, List.of(SPEED))));
        addNewPokemon(new Glaciking(new Stats(550, BULKY_SPECIAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Glaciqueen(new Stats(550, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new Grouwary(new Stats(550, FAST_PHYSICAL_ATTACKER, List.of(HP))));
        addNewPokemon(new Articture(new Stats(550, FAST_SUPPORT, List.of(SPEED))));
        addNewPokemon(new Kiwalon(new Stats(550, BULKY_SUPPORT, List.of(DEFENCE))));
        addNewPokemon(new Gargaitor(new Stats(550, PHYSICAL_ATTACKER, List.of(ATTACK, HP))).fishingSpawnFromExisting());
        addNewPokemon(new Spiturtos(new Stats(550, FAST_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Beninroz(new Stats(550, FAST_PHYSICAL_ATTACKER, List.of(SPEED))));

        addNewPokemon(new Tryambeak()); //fossil
        addNewPokemon(new Terrotryma(new Stats(460, PHYSICAL_ATTACKER, List.of(ATTACK))));
        addNewPokemon(new Nodoo()); //fossil
        addNewPokemon(new Dodenius(new Stats(460, PHYSICAL_WALL, List.of(HP))));
        addNewPokemon(new Chamenetic());
        addNewPokemon(new Geneleon(new Stats(450, SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new Grifowl());
        addNewPokemon(new Royaffin());
        addNewPokemon(new Emperoffin(new Stats(480, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new Harminanka(new Stats(590, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new Sossnit(new Stats(590, FAST_PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new Trintity(new Stats(590, MIXED_WALL, List.of(SPEED))));
        addNewPokemon(new Mawata(new Stats(600, ALL_ROUND, List.of(SPECIAL_DEFENCE))));
        addPokedexPokemon("growlithe");
        addNewPokemon(new RaianianArcanine("", Aspect.RAIANIAN, new Stats(555,
                FAST_SPECIAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new RaianianScyther("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianScizor("", Aspect.RAIANIAN, new Stats(500,
                BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
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
        addNewPokemon(new Cloueon(new Stats(524, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));

        addPokedexPokemon("dratini, dragonairn");
        addNewPokemon(new RaianianDragonite("", Aspect.RAIANIAN, new Stats(600,
                BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new RaianianDragoniteOne("", Aspect.RAIANIAN, new Stats(600,
                BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addPokedexPokemon("hoothoot+" +
                "");
        addNewPokemon(new RaianianNoctowl("", Aspect.RAIANIAN, new Stats(542,
                BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new RaianianChinchou("", Aspect.RAIANIAN).fishingSpawnFromExisting());
        addNewPokemon(new RaianianLanturn("", Aspect.RAIANIAN, new Stats(460,
                PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))).fishingSpawnFromExisting());
        addNewPokemon(new RaianianPhanpy("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianDonphan("", Aspect.RAIANIAN, new Stats(500,
                SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new RaianianWhismur("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianLoudred("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianExploud("", Aspect.RAIANIAN, new Stats(490,
                PHYSICAL_ATTACKER, List.of(HP))));
        addNewPokemon(new RaianianAbsol("", Aspect.RAIANIAN, new Stats(465,
                PHYSICAL_ATTACKER, List.of(ATTACK, ATTACK, ATTACK))));
        addPokedexPokemon("bagon, shelgon");
        addNewPokemon(new RaianianSalamence("", Aspect.RAIANIAN, new Stats(600,
                SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new RaianianGible("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianGabite("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianGarchomp("", Aspect.RAIANIAN, new Stats(600,
                BULKY_SUPPORT, List.of(ATTACK, ATTACK, ATTACK))));
        addPokedexPokemon("riolu");
        addNewPokemon(new RaianianLucario("", Aspect.RAIANIAN, new Stats(525,
                FAST_SPECIAL_ATTACKER, List.of(SPEED))));
        addPokedexPokemon("ralts, kirlia");
        addNewPokemon(new RaianianGallade("", Aspect.RAIANIAN, new Stats(518,
                FAST_PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new TribalRaffrobter("", Aspect.TRIBAL, new Stats(580, BULKY_SUPPORT, List.of(DEFENCE))));
        addNewPokemon(new TribalErtheno("", Aspect.TRIBAL, new Stats(580, BULKY_PHYSICAL_ATTACKER, List.of(HP))));
        addNewPokemon(new TribalAmoxica("", Aspect.TRIBAL, new Stats(580, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new TribalSpiritur("", Aspect.TRIBAL, new Stats(580, SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new TribalTriclope("", Aspect.TRIBAL, new Stats(580, FAST_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new TribalPredodator("", Aspect.TRIBAL, new Stats(580, PHYSICAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new TribalDarcicle("", Aspect.TRIBAL, new Stats(580, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new TribalSecurider("", Aspect.TRIBAL, new Stats(580, SLOW_BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new TribalClosalarm("", Aspect.TRIBAL, new Stats(580, SPECIAL_WALL, List.of(SPECIAL_DEFENCE, SPECIAL_DEFENCE))));

        addNewPokemon(new Chaontouka(new Stats(680, BULKY_PHYSICAL_ATTACKER, List.of(ATTACK))));
        addNewPokemon(new Ordabada(new Stats(680, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
    }

}
