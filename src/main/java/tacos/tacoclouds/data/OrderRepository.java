package tacos.tacoclouds.data;


import tacos.tacoclouds.Order;


public interface OrderRepository {

    Order save(Order order);
}
