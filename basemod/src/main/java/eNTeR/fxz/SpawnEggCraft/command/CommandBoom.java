package eNTeR.fxz.spawneggcraft.command;

import java.util.Iterator;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
/**@auther darkyoooooo*/
public class CommandBoom extends CommandBase {
    // 这里可以给你的指令添加一点的权限需求
    // 返回的int值范围从1~4
    // 0:任何对象可执行 2:只有开启作弊模式可执行 3:只有服务器的OP可执行 4:只有服务端控制台可执行
    public int getRequiredPermissionLevel() {
        return 0;
    }
 
    @Override
    public String getCommandName() {
    return "boom";
    }
 
    @Override
    public String getCommandUsage(ICommandSender sender) {
    return "/boom";
    }
 
    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
    if(sender instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) sender;
            // 接下来的代码我直接抄的Szszss的教程: http://www.hakugyokurou.net/wordpress/?p=225
            // 这串代码可以获取玩家周围一定范围的生物列表
        List<?> list = player.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(player.posX - 30D, player.posY - 20D, player.posZ - 30D, player.posX + 30D, player.posY + 20D, player.posZ + 30D));
            // 使用Iterator遍历list
            for(Iterator<?> iterator = list.iterator(); iterator.hasNext();) {
                EntityLiving entity = (EntityLiving) iterator.next();
                // 上面所获取的生物列表里也包含玩家自己 所以别把自己也炸了
                if(entity.equals(player)) {
                    continue;
                }
                // 顺 ! 间 ! 爆 ! 炸 !
                if(entity instanceof EntityDragon || entity instanceof EntityWither){
                	player.worldObj.createExplosion(player, entity.posX, entity.posY, entity.posZ, 8f, false);
                	continue;
                }
                player.worldObj.createExplosion(player, entity.posX, entity.posY, entity.posZ, 4f, false);
            }
    } else {
            //这里特别注意一下 当玩家输入的指令的参数不对或者有别的什么错误的话
            //直接throw一个CommandException就好 MC会捕获并显示给玩家
        throw new CommandException("This command is for players only!");
    }
    }
}