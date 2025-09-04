package cn.wusuot.potm;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Potm extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("插件加载成功，现在可以压力腐竹啦~");
        getLogger().info("Potm OK");
    }

    @Override
    public void onDisable() {
        System.out.println("插件已卸载，腐竹可以哈气啦~");
        getLogger().info("Potm off");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("potm")) {
            if(sender instanceof Player){
                if(sender.isOp()){
                    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "管理员" + sender.getName() + "使用op权限给与了腐竹—三—星—堆~");
                }
                else{
                    Bukkit.getServer().broadcastMessage(ChatColor.AQUA + sender.getName() + "压力了腐竹~");
                }
            }
            else{
                Bukkit.getServer().broadcastMessage(ChatColor.GOLD + "控制台使用wusuoT召唤出了传说中的-猫-娘-卡-沃~");
            }
            return true;
        }
        return false;
    }
}