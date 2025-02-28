package com.tsarhydrantine.tsbase.client;

import com.tsarhydrantine.tsbase.TsBase;
import com.tsarhydrantine.tsbase.tsEntity.TsEntities;
import com.tsarhydrantine.tsbase.tsEntity.SkeletonBoss.GigaSnowballRenderer;
import com.tsarhydrantine.tsbase.tsEntity.SkeletonBoss.IceSkeletonRenderer;
import com.tsarhydrantine.tsbase.tsItems.TsSpawnEggItem;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = TsBase.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientHandler
{
	@SubscribeEvent
    public static void onClientSidedSetup(FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.ICESKELTONBOSS.get(), IceSkeletonRenderer::new);
    }
	
	@SubscribeEvent
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		TsSpawnEggItem.initSpawnEggs();
	}
}
