package id.my.hendisantika.ecommerceapp1.repository;

import id.my.hendisantika.ecommerceapp1.entity.CartProduct;
import id.my.hendisantika.ecommerceapp1.entity.CartProductId;
import id.my.hendisantika.ecommerceapp1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : ecommerce-app1
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/09/25
 * Time: 05.33
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface CartProductRepository extends JpaRepository<CartProduct, CartProductId> {

    @Query(value = "SELECT p.* FROM product p INNER JOIN cart_product cp ON p.product_id = cp.product_id WHERE cp.cart_id = :cartid", nativeQuery = true)
    List<Product> findProductsByCartId(@Param("cartId") Integer cartId);
}
