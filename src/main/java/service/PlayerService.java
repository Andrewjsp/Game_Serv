package service;

import dto.PlayerDto;
import entity.Player;
import exception.UserHaveBeanException;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayers();

    void savePlayer(Player player);

    void deletePlayer(Player player);

    void findPlayerByLogin(PlayerDto playerDto) throws UserHaveBeanException;

    void findPlayerByLoginAndPassword(PlayerDto playerDto);
}
