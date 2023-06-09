package com.geekster.Food.delivery.platform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_Table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;  //status will be created, dispatch , delivered

    @ManyToOne
    private Users users;
    @OneToOne
    private Food food;
}
