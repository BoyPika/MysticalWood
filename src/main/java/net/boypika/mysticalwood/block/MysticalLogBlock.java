package net.boypika.mysticalwood.block;

import net.boypika.mysticalwood.MysticalWood;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class MysticalLogBlock extends PillarBlock {
    public MysticalLogBlock(Settings settings) {
        super(settings);
    }
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        for(Direction direction : Direction.values()) {
            Direction.Axis axis = direction.getAxis();
            double e = axis == Direction.Axis.X ? 0.5F + 0.5625F * direction.getOffsetX() : world.random.nextFloat();
            double f = axis == Direction.Axis.Y ? 0.5F + 0.5625F * direction.getOffsetY() : world.random.nextFloat();
            double g = axis == Direction.Axis.Z ? 0.5F + 0.5625F * direction.getOffsetZ() : world.random.nextFloat();
            world.addParticleClient(MysticalWood.MYSTICAL_PARTICLE, pos.getX() + e, pos.getY() + f, pos.getZ() + g, 0.0F, 0.0F, 0.0F);
        }
    }
}
