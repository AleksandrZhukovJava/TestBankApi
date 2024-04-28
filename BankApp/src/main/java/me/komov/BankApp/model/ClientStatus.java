package me.komov.BankApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ClientStatus {
    VIP("Вип клиент"),
    NORMAL("Обычный клиент"),
    DANGEROUS("Потенциально заблокированный клиент"),
    BLOCKED("Заблокированный клиент");
    private final String value;
}
