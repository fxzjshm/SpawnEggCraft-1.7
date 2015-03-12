package eNTeR.fxz.SpawnEggCraft.coremod;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

import net.minecraft.launchwrapper.IClassTransformer;

public class SpawnEggCraftCoremodTransformer implements IClassTransformer{
	@Override
	public byte[] transform(String name, String transformedName,byte[] basicClass) {
		// TODO Auto-generated method stub
		if (basicClass == null) {
			return null;
		}
		return basicClass;

		
	}

}
