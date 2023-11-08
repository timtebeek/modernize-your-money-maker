package com.github.timtebeek.moneymaker;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoneyMakerService {
    public Money makeMoney(String currency, int amount) {
        return new Money(currency, amount);
    }

    public String statements() {
        String statements = "Date       | Description          | Amount\n"
                + "2018-01-01 | Initial balance      | 0.00\n"
                + "2018-01-01 | Salary January       | 1000.00\n"
                + "2018-01-02 | Rent January         | -500.00\n";
        return statements;
    }

    public void consume(Object obj) {
        if (obj instanceof Money) {
            Money money = (Money) obj;
            System.out.println("Consumed " + money.getAmount() + " " + money.getCurrency());
        } else {
            System.out.println("Consumed object: " + obj);
        }
    }

    public List<Money> balances() {
        return new ArrayList<Money>() {{
            add(new Money("EUR", 1000));
            add(new Money("USD", 2000));
            add(new Money("GBP", 3000));
        }};
    }
}
