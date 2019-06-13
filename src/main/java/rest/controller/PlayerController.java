package rest.controller;

import dao.PlayerDao;
import entity.Player;
import service.PlayerService;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/player")
public class PlayerController {

    @Inject
    PlayerDao playerDao;

    @Inject
    PlayerService service;
    @GET
    @Path("/getAllPlayers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> allUsers() {
        return playerDao.getAllUsers();
    }

    @POST
    @Path("/addPlayer")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPlayer(Player player) {
     service.savePlayer(player);
    }
}
