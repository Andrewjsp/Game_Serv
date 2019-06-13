package entity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bet {
private long price;
private String nameBet;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getNameBet() {
        return nameBet;
    }

    public void setNameBet(String nameBet) {
        this.nameBet = nameBet;
    }
}
