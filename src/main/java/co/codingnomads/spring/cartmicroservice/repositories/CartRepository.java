package co.codingnomads.spring.cartmicroservice.repositories;

import co.codingnomads.spring.cartmicroservice.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);


}