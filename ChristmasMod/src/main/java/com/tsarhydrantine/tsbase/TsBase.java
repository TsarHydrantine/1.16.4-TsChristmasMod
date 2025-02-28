package com.tsarhydrantine.tsbase;

import com.tsarhydrantine.tsbase.tsEntity.TsEntities;
import com.tsarhydrantine.tsbase.tsEntity.SkeletonBoss.IceSkeletonEntity;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tschristmas")
public class TsBase {
	public static final String MODID = "tschristmas";
	
	//
	public TsBase() {
		TsRegistry.register();
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		
		TsEntities.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SuppressWarnings("deprecation")
	private void setup(final FMLCommonSetupEvent event) {
		TsRegistry.logger.info("TsBase Starting...");
		DeferredWorkQueue.runLater(() ->{
			GlobalEntityTypeAttributes.put(TsEntities.ICESKELTONBOSS.get(), IceSkeletonEntity.setCustomAttributes().create());
		});
	}
	
	private void doClientStuff(final FMLClientSetupEvent event) {
		RenderType solid = RenderType.getSolid();
    	RenderType cutout_mipped = RenderType.getCutoutMipped();
    	RenderType cutout = RenderType.getCutout();
    	RenderType translucent = RenderType.getTranslucent();
    	RenderType translucent_no_crumbling = RenderType.getTranslucentNoCrumbling();
    	
    	RenderTypeLookup.setRenderLayer(TsRegistry.ROYAL_ICE.get(), translucent);
    	RenderTypeLookup.setRenderLayer(TsRegistry.CANDYCANE_GRASS.get(), cutout);
	}
	
}
