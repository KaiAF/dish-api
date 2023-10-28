package net.ouja.api.world;

import net.ouja.api.Player;

import java.util.List;

public interface Level {

    /**
     * @return the level name
     */
    public String getName();

    /**
     * @return the world seed
     */
    public long getSeed();

    /**
     * @return the list of players currently in the world
     */
    public List<Player> getPlayers();
}