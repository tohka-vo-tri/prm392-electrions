package fpt.edu.prm392_project_electronics.models.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Table(name ="orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userOrder;

    @Column(name="date_create")
    private LocalDate dateCreate;
    @ManyToMany(mappedBy = "orderEntity",  cascade = CascadeType.ALL)
    private OrderEntity orderEntity;




}
