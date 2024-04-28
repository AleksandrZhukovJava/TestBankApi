package me.komov.BankApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String surname;
    private String passport;
    private String socialNumber;
    private List<Account> accounts;
    private Authorization authorization;
    private ClientStatus status;
}
