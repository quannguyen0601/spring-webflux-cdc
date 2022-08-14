package com.quan.demo.debezium.sink.mysql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("user")
public class User {
    @Id
    private long id;
    private String name;
    private String address;
    private boolean delflag;
}
