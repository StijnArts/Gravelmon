package drai.dev.gravelmon.mega;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.events.battles.*;
import com.cobblemon.mod.common.api.storage.party.*;
import com.cobblemon.mod.common.pokemon.*;
import com.cobblemon.yajatkaul.mega_showdown.event.cobbleEvents.*;
import com.cobblemon.yajatkaul.mega_showdown.megaevo.*;
import kotlin.*;
import net.minecraft.server.level.*;
import net.minecraft.world.effect.*;

public class GravelmonRevertEvents {

    public static Unit devolveFainted(BattleFaintedEvent battleFaintedEvent){
        Pokemon pokemon = battleFaintedEvent.getKilled().getOriginalPokemon();
        ServerPlayer serverPlayer = battleFaintedEvent.getKilled().getOriginalPokemon().getOwnerPlayer();

        if(serverPlayer == null || serverPlayer.level().isClientSide){
            return Unit.INSTANCE;
        }

        if(pokemon.getAspects().stream().anyMatch(aspect->aspect.equalsIgnoreCase("mega")
                ||aspect.toLowerCase().contains("mega_")
                ||aspect.toLowerCase().contains("_mega"))){
            MegaLogic.Devolve(pokemon, true);
        }

        return Unit.INSTANCE;
    }

    public static Unit deVolveFlee(BattleFledEvent battleFledEvent) {
        battleFledEvent.getBattle().getPlayers().forEach(serverPlayer -> {
            PlayerPartyStore playerPartyStore = Cobblemon.INSTANCE.getStorage().getParty(serverPlayer);
            for (Pokemon pokemon: playerPartyStore){
                EventUtils.revertFormesEnd(pokemon);

                if(pokemon.getEntity() != null){
                    pokemon.getEntity().removeEffect(MobEffects.GLOWING);
                }
            }
        });

        return Unit.INSTANCE;
    }
}
