package com.company;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //create a list collection of trade
        List <Trade> trades = new ArrayList<>();

     trades.add(new Trade("MS",30, new BigDecimal("25.0")));
     trades.add(new Trade("IBM",25, new BigDecimal("100.2")));
     trades.add(new Trade("GOOGLE",45, new BigDecimal("90")));
     trades.add(new Trade("BP",63, new BigDecimal("61")));

     //Storing all symbols of trade int a List collection of symbols
//        List <String> symbols = new ArrayList<>();
//
//        for (Trade trade: trades){
//            symbols.add(trade.getSymbol());
//        }

        //Storing all symbols of trade int a List collection of symbols using stream
        List<String> symbols =
                trades.stream().map(t->t.getSymbol()).collect(Collectors.toList());
        System.out.println("Symbol: "+  symbols);
        System.out.println("-----------------------------------------------");

        //using stream to map each symbol to quantity to each trade.
        Map <String,Integer> map =trades.stream()
                                         .collect(Collectors.toMap(
                                            p -> p.getSymbol(),
                                            p->p.getQuantity(),
                                        (qty1,qty2) -> qty1+qty2
        ));

        System.out.println("Map: "+  map);

        System.out.println("-----------------------------------------------");
        int firstQuantity = trades.get(0).getQuantity();
        System.out.println("The first quantity in the trade is "+ firstQuantity);
        //increasing all quantity by the value one
        trades.forEach(t -> t.setQuantity(t.getQuantity()+1));
        //checking the new value of the first quantity
        System.out.println("-----------------------------------------------");
        System.out.println("The new value of the first quantity " + trades.get(0).getQuantity());
        System.out.println("-----------------------------------------------");
        //retrieve the trades that have a quantity of greater than 20
        List<Integer> highVolume= trades.stream().filter(t->t.getQuantity() > 20).map( i -> i.getQuantity()).collect(Collectors.toList());
        System.out.println("list of quantity of trade grater than  20: " + highVolume);

         System.out.println("Count list of quantity of trade grater than  20: " + highVolume.stream().count());
        System.out.println("-----------------------------------------------");
        System.out.println("Pipelines");
        //Sort Names of Symbols(in lowercase) with quantity greater than 20
        List<String> combined= trades.stream().filter(t->t.getQuantity() >20).map(t->t.getSymbol()).map(String::toLowerCase).sorted().collect(Collectors.toList());
        System.out.println(combined);
        System.out.println("-----------------------------------------------");
        List<List<Trade>> listsOfTrades = Arrays.asList(trades,trades);
        listsOfTrades.stream().flatMap(t->t.stream()).collect(Collectors.toList());
        System.out.println(listsOfTrades);
        System.out.println("-----------------------------------------------");
    //get total quantity of all trades
        int totalQty = trades.stream().map(Trade::getQuantity).reduce(0,(a,b) -> a+b);
        System.out.println("Total Quantity: " + totalQty);
        System.out.println("-----------------------------------------------");



    }
}
