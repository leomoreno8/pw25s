package br.edu.utfpr.pb.pw25s.Fynance.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Currency;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Builder
public class TransactionDto {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private WalletDto wallet;

    @NotNull
    private Date dateTransaction;

    @NotNull
    private Double valueTransaction;

    @NotNull
    private char ES;

    @NotNull
    private String description;

    @NotNull
    private String category;

    @NotNull
    private Double fees;

    @NotNull
    private Double total;
}
