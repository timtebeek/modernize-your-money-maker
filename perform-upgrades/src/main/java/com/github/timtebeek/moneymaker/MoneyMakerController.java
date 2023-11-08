package com.github.timtebeek.moneymaker;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/moneymaker")
public class MoneyMakerController {

    private final MoneyMakerService moneyMakerService;

    @Autowired
    public MoneyMakerController(MoneyMakerService moneyMakerService) {
        this.moneyMakerService = moneyMakerService;
    }


    @RequestMapping(value = "/make-money/{currency}", method = RequestMethod.GET)
    public Money makeMoney(@PathVariable("currency") String currency,
                           @RequestParam("amount") int amount) {
        Money money = moneyMakerService.makeMoney(currency, amount);
        return money;
    }

    @RequestMapping(value = "/statements", method = RequestMethod.GET)
    public String statements() {
        val statements = moneyMakerService.statements();
        return statements;
    }

    @RequestMapping(value = "/consume", method = RequestMethod.POST)
    public void consume(@RequestBody Money obj) {
        moneyMakerService.consume(obj);
    }

    @RequestMapping(value = "/balances", method = RequestMethod.GET)
    public List<Money> balances() {
        List<Money> balances = moneyMakerService.balances();

        Money first = balances.get(0);
        Money last = balances.get(balances.size() - 1);
        System.out.println("First balance: " + first.getAmount() + " " + first.getCurrency());
        System.out.println("Last balance: " + last.getAmount() + " " + last.getCurrency());

        return balances;
    }

}
