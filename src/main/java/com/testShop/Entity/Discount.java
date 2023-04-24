package com.testShop.Entity;

import com.testShop.DTO.Categories;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Сущность скидок
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "discount")
public class Discount {
    @Id
    @Column(name = "categories", nullable = false)
    /** Категория  скидки       */
    Categories categories;
    /** Размер скидки       */
    @Column(name = "volume")
    Integer volume;
    /**Дата завершения скидки       */
    @Column(name = "created_ds")
    LocalDateTime createdDs;
}
