package com.cinemamod.bukkit.command.theater;

import com.cinemamod.bukkit.CinemaModPlugin;
import com.cinemamod.bukkit.theater.Theater;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class ForceSkipCommand extends TheaterOwnerCommandExecutor {

    public ForceSkipCommand(CinemaModPlugin cinemaModPlugin) {
        super(cinemaModPlugin);
    }

    @Override
    public boolean onTheaterOwnerCommand(Player player, Command command, String label, String[] args, Theater theater) {
        if (theater.isPlaying()) {
            theater.forceSkip();
            player.sendMessage("The video has been force skipped."); //TODO make gold
        } else {
            player.sendMessage("This theater is not playing anything."); //TODO make red
        }

        return true;
    }

}
