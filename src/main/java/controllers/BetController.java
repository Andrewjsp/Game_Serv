package controllers;

import entity.Bet;
import service.BetService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "bets")
@RequestScoped
public class BetController {
    @Inject
    BetService betService;

    Bet bet=new Bet();

    public Bet getBet() {
        return bet;
    }

    public void addBet(){
        betService.addBet(bet);
    }

    public List<Bet> getAll(){
        return betService.getAll();
    }
}
