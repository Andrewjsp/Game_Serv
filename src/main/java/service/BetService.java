package service;

import entity.Bet;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class BetService {

    public List<Bet> bets=new ArrayList<>();

    public void addBet(Bet bet){
        bets.add(bet);

    }

    public List<Bet>getAll(){
        return bets;
    }
}
