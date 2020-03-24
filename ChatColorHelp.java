package de.chatcolor.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.shaky_hd.main.Main;

public class ChatColorHelp implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String string, String[] args) {

		Player p = (Player) s;
		
		if(p.hasPermission("chatcolor.colorcodes")) {
			
			p.sendMessage(" ");
			p.sendMessage(Main.PREFIX);
			p.sendMessage(" ");
			p.sendMessage(Main.BLACK);
			p.sendMessage(Main.DBLUE);
			p.sendMessage(Main.DGREEN);
			p.sendMessage(Main.DAQUA);
			p.sendMessage(Main.DRED);
			p.sendMessage(Main.DLILA);
			p.sendMessage(Main.GOLD);
			p.sendMessage(Main.GRAU);
			p.sendMessage(Main.DGRAU);
			p.sendMessage(Main.BLUE);
			p.sendMessage(Main.GREEN);
			p.sendMessage(Main.AQUA);
			p.sendMessage(Main.RED);
			p.sendMessage(Main.HLILA);
			p.sendMessage(Main.YELLOW);
			p.sendMessage(Main.WHITE);
			p.sendMessage(" ");
			p.sendMessage(Main.K);
			p.sendMessage(Main.D);
			p.sendMessage(Main.DU);
			p.sendMessage(Main.UND);
			p.sendMessage(Main.KU);
			p.sendMessage(Main.RE);
			p.sendMessage(" ");

			
			                         
			
			
			
			
			
			
			
		}else {	
			p.sendMessage(" ");
			p.sendMessage(Main.NoPerms);
			p.sendMessage(" ");
			p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);

		}

		return true;
	}

			
	
	
			
			
		}
		
		


