package ch.khinkali.cryptowatch.bittrex.adapter.balance.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("balances")
public class BalanceResource {

    @GET
    public String getBalances() {
        return "balances";
    }

}
