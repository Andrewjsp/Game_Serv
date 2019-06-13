package service;

import dao.PlayerDao;
import dto.PlayerDto;
import encoder.Encoder;
import entity.Player;
import exception.UserHaveBeanException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
/*Correction exception*/
@Stateless
public class PlayerServiceImpl implements PlayerService {

    @Inject
    PlayerDao playerDao;

    @Inject
    Encoder encoder;

    @Inject
    PlayerDto playerDto;

    @Override
    public List<Player> getAllPlayers() {
        return playerDao.getAllUsers();
    }

    @Override
    public void savePlayer(Player player) {
        playerDto.setLogin(player.getLogin());
        try {
            findPlayerByLogin(playerDto);
            player.setPassword(encoder.newHashPassword(player));
        } catch (NoResultException ex) {

        } catch (UserHaveBeanException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }

    @Override
    public void deletePlayer(Player player) {

    }

    @Override
    public void findPlayerByLogin(PlayerDto player) throws UserHaveBeanException {
        if (playerDao.findByLoginForRegistation(playerDto) != null) {
            throw new UserHaveBeanException();
        }
    }

    @Override
    public void findPlayerByLoginAndPassword(PlayerDto playerDto) {
    }
}
