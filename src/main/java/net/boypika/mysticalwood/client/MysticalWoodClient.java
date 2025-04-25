package net.boypika.mysticalwood.client;

import net.boypika.mysticalwood.MysticalWood;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;

public class MysticalWoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(MysticalWood.MYSTICAL_PARTICLE, EndRodParticle.Factory::new);
    }
}
